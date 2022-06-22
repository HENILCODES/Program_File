<!DOCTYPE html>
<html lang="en">
<head>
    <title>Henil</title>
</head>
<body>
    <input type="number" placeholder="Minutes" id="min">
    <input type="number" placeholder="Second" id="sec">
    <button onclick="sss()">OK</button>
    <span id="s"></span>
</body>
</html>
<script>
    var mini;
    var sc ;
    var i = 0;
    function get() {
        mini = document.getElementById("min").value;
        sc = document.getElementById("sec").value;
        mini++;
        sc++;
        i = sc;
        document.getElementById("s").innerHTML = mini + " " + sc;
        alert(i)
    }
    // function sss(){
    //     setInterval(get,1000);
    // }
</script>