<?php
 define('DB_SERVER', 'localhost');
 define('DB_USERNAME', 'root');
 define('DB_PASSWORD', '');
 define('DB_DATABASE', 'henil');
 $db = mysqli_connect(DB_SERVER,DB_USERNAME,DB_PASSWORD,DB_DATABASE);

 if(isset($_POST) && !empty($_FILES['image']['name'])){
 $name = $_FILES['image']['name'];
 list($txt, $ext) = explode(".", $name);
 $image_name = time().".".$ext;
 echo $image_name;
 $tmp = $_FILES['image']['tmp_name'];

 if(move_uploaded_file($tmp, 'upload/'.$image_name)){

 mysqli_query($db,"INSERT INTO user (Name)
 VALUES ('".$image_name."')");

 echo "<img width='200px' src='upload/".$image_name."' class='preview'>";
 }else{
 echo "image uploading failed";
 }
 }
