var box = document.getElementById('box');

var leftNumber = 0
var topNumber = 0


function changeGreen() {
    box.style.backgroundColor = '#449d44'
}

function changeYellowOrange() {
    box.style.backgroundColor = '#ec971f'
}

function runTop() {
    topNumber -= 4
    box.style.top = topNumber + 'px'
}

function runBottom() {
    topNumber += 4
    box.style.top = topNumber + 'px'
}

function runRight() {
    leftNumber += 4
    box.style.left = leftNumber + 'px'
}

function runLeft() {
    leftNumber -= 4
    box.style.left = leftNumber + 'px'
}