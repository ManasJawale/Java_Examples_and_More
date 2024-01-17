let r = false;
function changeColor() {
    let button = document.getElementById("SmoothButton");
    let rcolor = '#' + Math.floor(Math.random()*16777215).toString(16);
    button.style.backgroundColor = rcolor;
    button.style.boxShadow = '10px 10px 10px '+rcolor
}
function OnMouseMove() {
    let rcolor = '#' + Math.floor(Math.random()*16777213).toString(16);
    let button = document.getElementById("SmoothButton");
    button.style.border = '5px solid '+rcolor;
}
function OnTogglePress() {
    let top = 100;
    let botton = 0;
    let right = 0;
    let left = 105;
    let textContent = "Off";
    if(r==true) {
        top = 105;
        left = 10;
        textContent = "Off";
    }
    else if(r==false) {
        top = 105;
        left = 105;
        textContent = "On";
    }
    let button = document.getElementById("Toggle");
    let rcolor = '#' + Math.floor(Math.random()*16777215).toString(16);
    button.style.backgroundColor = rcolor;
    button.style.boxShadow = '10px 10px 10px '+rcolor;
    let circle = document.getElementById("circle");
    circle.style.position = 'absolute';
    circle.style.left = left+'px';
    circle.style.top = top+'px';
    circle.textContent = textContent;
    r = !r;
}