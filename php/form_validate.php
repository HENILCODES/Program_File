<html>
<head>
	<title> Henil </title>
</head>
<body>
	<form name="f" action="/action_page.php" method="post" autocomplete="off">
		Name:- <input type="text" name="n1" size="5" maxlength="5"> <span id="p1"></span>
<br>
		number :- <input type="text" name="n2" size="10" maxlength="10"> <span id="p2"></span>
<br>
<br> 		<input type="button" value="click" onclick="f1()">
<br>		<input type="file" multiple>
<br>		Date:-<input type="date" >
		Enter 1 to 5 :-<input type="number" min="1" max="5">
 	</form>
<script>
	function f1(){
		var n=document.f.n1.value;
		var m=document.f.n2.value;
		if (n==null || n==""){
		document.getElementById("p1").innerHTML="Name can't be blank";
		return false;
		}else if(m.length<10 ){
		document.getElementById("p1").innerHTML="";
		document.getElementById("p2").innerHTML="enter 10 digits only";
		return false;
		}else if(m.length>10 ){
		document.getElementById("p2").innerHTML="enter 10 digits only";
		return false;}
		else{
		alert("congratulation ");
		window.location = "https://www.facebook.com";}
	}
</script>

<?php 
$ser ="localhost";
$data="detail";
$use ="root";
$pass ="";
$con =mysqli_connect($ser, $data, $use, $pass);
echo "sucees ";
?>

</body>
</html>
