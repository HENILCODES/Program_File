var fs = require('fs');

fs.appendFile('open.js','f',function(err,file){
    if (err) throw file;
    console.log("Helo");
});