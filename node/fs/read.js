var f = require('fs');
var h = require('http');
h.createServer(function(req,res){
    f.readFile('Menu/home.html',function(err,data){
        res.writeHead(200,{'content-Type':'text/html'});
        res.write(data);
        return res.end();
    });
}).listen(8080);