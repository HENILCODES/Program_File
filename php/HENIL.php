<!doctype html>
<html>
<head>
	<title> Henil </title>
<link rel="stylesheet" href="f.css" type="text/css" />
</head>

	<h1><u><i>Details For Communication </u></i></h1><br>
<body>
<b>
<form method="POST" name="fm" onsubmit="return f1()" autocomplete="off" class="ff">
	Last Name:- <input type="text" name="lnam" size="20" maxlength="20" placeholder="enter surname"> <br> <br>
	First Name:-<input type="text" name="nam" size="20" maxlength="20" placeholder="enter your name"> <br><br>
	Middle Name:- <input type="text" name="mname" size="20" maxlength="20" placeholder="enter parent name"> <br><br> 
	Contact Number:- <input type="text" name="num" size="10" maxlength="10" placeholder="enter phone number"> <br><br>
	Date Of Birth :- <input type="date" name="dat"> <br> <br> <hr>
	<input type="submit" name="done" class="but" >  
</form>
</b>
<?php
$ser ="localhost";
$use ="root";
$pass ="";
$data ="Henil";
$con = mysqli_connect($ser, $use, $pass, $data);
echo "suceec";

if(isset($_POST['done'])){
$fname= $_POST['nam'];
$lname= $_POST['lnam'];
$mname= $_POST['mname'];
$number= $_POST['num'];
$date= $_POST['dat'];

$in ="INSERT INTO `info`(`Last name`, `Name`, `Middle name`, `Contact`,`DoB`) VALUES ('$lname','$fname','$mname','$number','$date')";
mysqli_query($conn, $in);
}
?>
</body>
</html>