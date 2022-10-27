const box = document.getElementById('box');

let leftNumber = 0;
let topNumber = 0;

let interval;

const n = 1;
let width = 0
/*获取进度条*/
let p1 = document.getElementById('p1');
/*设置定时器 200毫秒执行一次 到100重置*/
setInterval(function () {
    p1.style.width = ++width + '%';
    if (p1.style.width === '100%') {
        width = 0
    }
}, 200)
/*修改颜色为绿色*/
function changeGreen() {
    box.style.backgroundColor = '#449d44'
}
/*修改颜色为黄橙色*/
function changeYellowOrange() {
    box.style.backgroundColor = '#ec971f'
}
/*设置移动定时器*/
function run(type) {
    switch (type) {
        case 'L':
            interval = setInterval(function () {
                leftNumber -= n
                box.style.left = leftNumber + 'px'
            }, 0.1)
            break
        case 'R':
            interval = setInterval(function () {
                leftNumber += n
                box.style.left = leftNumber + 'px'
            }, 0.1)
            break
        case 'B':
            interval = setInterval(function () {
                topNumber += n
                box.style.top = topNumber + 'px'
            }, 0.1)
            break
        case 'T':
            interval = setInterval(function () {
                topNumber -= n
                box.style.top = topNumber + 'px'
            }, 0.1)
            break
    }
}
/*关闭定时器*/
function outInterval() {
    clearInterval(interval)
}