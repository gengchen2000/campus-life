const box = document.getElementById('box');

let leftNumber = 0;
let topNumber = 0;

let interval;

const n = 1;
let width = 0
let p1 = document.getElementById('p1');
p1.style.width = '0%'
setInterval(function () {
    p1.style.width = ++width + '%';
    if (p1.style.width === '100%') {
        width = 0
    }
}, 200)

function changeGreen() {
    box.style.backgroundColor = '#449d44'
}

function changeYellowOrange() {
    box.style.backgroundColor = '#ec971f'
}

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

function outInterval() {
    clearInterval(interval)
}