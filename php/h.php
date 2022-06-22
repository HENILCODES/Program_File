<!doctype html>
<head>
<title> Henil </title>
</head>

<html>

<body>
<?php
$ser ="localhost";
$use ="root";
$pass ="";
$data ="Henil";
$con = mysqli_connect($ser, $use, $pass, $data);
echo "suceec";
?>
<br>
<form method="POST" onsubmit="g()">
Name:-<input type="text" name="user" >
number :- <input type="text" name="num" maxlength=10 size=10> <br>
<input type="submit" name="done" >
</form>

<script>
	function g(){
		document.write("<h1> congratulations Your Data Successfully Submited, Thank You </h1>");
	}
</script>
<?php 

if(isset($_POST['done'])){
$name= $_POST['user'];
$phone = $_POST['num'];

$in ="INSERT INTO log(name,number) VALUES ('$name','$phone')";

mysqli_query($con,$in);
}
?>

</body>
</html>