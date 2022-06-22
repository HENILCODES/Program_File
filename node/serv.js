var fs = require('fs');
var ur = require('url');
var ht = require('http');

ht.createServer(function(req,res){
    var q = ur.parse(req.url,true);
    var filename = "."+ q.pathname;
    fs.readFile(filename,function(err,date){
        if (err) {
            res.writeHead(404,{'Content-Type':'text/html'});
            return res.end("404");   
        }
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write(date);
        return res.end();
    });
}).listen(8080);
console.log("Start");