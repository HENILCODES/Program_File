var url = require('url');
var add = 'http://127.0.0.1:8080/hen.html?year=2001';
var q = url.parse(add,true);
console.log(q.host);
console.log(q.pathname);
console.log(q.search);

var qq = q.query;
console.log(qq.year);