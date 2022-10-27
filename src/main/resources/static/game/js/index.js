var box = document.getElementById('box');

var leftNumber = 0
var topNumber = 0

var n = 40


function changeGreen() {
    box.style.backgroundColor = '#449d44'
}

function changeYellowOrange() {
    box.style.backgroundColor = '#ec971f'
}

function runTop() {
    topNumber -= n
    box.style.top = topNumber + 'px'
}

function runBottom() {
    topNumber += n
    box.style.top = topNumber + 'px'
}

function runRight() {
    leftNumber += n
    box.style.left = leftNumber + 'px'
}

function runLeft() {
    leftNumber -= n
    box.style.left = leftNumber + 'px'
}