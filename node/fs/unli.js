var fs = require('fs');
fs.unlink('mm.txt',function(err){
    if (err) throw err;
    console.log("op"); 
})