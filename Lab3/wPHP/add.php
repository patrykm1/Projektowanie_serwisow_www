<?php

	//include ('index.php');
	if (isset($_POST['add'])) {

		$add=$_GET['add'];


	$zapytanie="INSERT INTO `baza_filmow` where Id='$add'( `tytul`, `rok_wyd`, `gatunek`) VALUES ([tytul1],[rok_wyd1],[gatunek1	])";

	$wynik=mysqli_query($aVar ,$zapytanie);

		if($wynik){
		header("Location:index.php");
	}
}
?>

<form method="post" action="add.php">
	
	Tytuł: <input type="text" name="tytul1"><br>
	Rok wydania: <input type="int" name="rok_wyd1"><br>
	Gatunek: <input type="text" name="gatunek1"><br>
	<input type="submit" value="Zapisz">
</form>