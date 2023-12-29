let count = 0;

document.getElementById("up").onclick = function(){
    count=count+1;
    document.getElementById("title").innerHTML = count;
}

document.getElementById("down").onclick = function(){
    count=count-1;
    document.getElementById("title").innerHTML = count;
}