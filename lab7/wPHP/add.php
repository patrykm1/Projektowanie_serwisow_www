<?php

	include ('polacz.php');
	
	if(isSet( $_POST['tytul']))	{
		$tytul = $_POST['tytul'];
		
		//$sth = $aVar->prepare('INSERT INTO `baza_filmow`(`tytul`) VALUES ("$_POST[tytul]")');
		$sth = $aVar->prepare("INSERT INTO baza_filmow (tytul, rok_wyd, gatunek) VALUES ('".$_POST["tytul"]."','".$_POST["rok_wyd"]."','".$_POST["gatunek"]."')");
		$sth->execute();
		//$sth = $aVar->prepare('INSERT INTO `baza_filmow`(`tytul`, `rok_wyd`, `gatunek`) VALUES ([tytul],[rok_wyd],[gatunek])');
		//$sth->bindParam(':tytul', $_POST['tytul']);
		//$sth->bindParam(':rok_wyd', $_POST['rok_wyd']);
		//$sth->bindParam(':gatunek', $_POST['gatunek']);
		//$sth->execute();
	}
	

?>

<form name="dodaj" method="post" action="add.php">
	
	Tytuł: <input type="text" name="tytul"><br>
	Rok wydania: <input type="int" name="rok_wyd"><br>
	Gatunek: <input type="text" name="gatunek"><br>
	<input type="submit" value="Zapisz">
</form>