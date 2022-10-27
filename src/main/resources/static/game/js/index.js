const box = document.getElementById('box');

let leftNumber = 0;
let topNumber = 0;

let interval;

const n = 8;


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
            }, 10)
            break
        case 'R':
            interval = setInterval(function () {
                leftNumber += n
                box.style.left = leftNumber + 'px'
            }, 10)
            break
        case 'B':
            interval = setInterval(function () {
                topNumber += n
                box.style.top = topNumber + 'px'
            }, 10)
            break
        case 'T':
            interval = setInterval(function () {
                topNumber -= n
                box.style.top = topNumber + 'px'
            }, 10)
            break
    }
}


function outInterval() {
    clearInterval(interval)
}