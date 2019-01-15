<h2>Blog o filmach</h2>
<h3>Baza filmów</h3>

<?php
	include 'polacz.php';
	
	while($wiersz=mysqli_fetch_array($wynik)){
			
		echo'<table border="1">';
		echo '<tr>';
		echo '<td>';
		print "Tytul: " .$wiersz[1] ;
		echo '</td>';
		echo '<td>';
		print "Rok wydania: " .$wiersz[2] ;
		echo '</td>';
		echo '<td>';
		print "Gatunek: " .$wiersz[3] ;	
		echo '</td>';
		echo '</tr>';	
		echo'</table>';
		print "<br><a href=\"index.php?usun=".$wiersz[0]."\">Usun film z bazy</a>
		&nbsp ";
		
		print"<hr width=\"60%\" color=#0099FF>";
	}
	print '<br><br>';
	print "<a href=\"add.php".$wiersz[0]."\">Dodaj nowy film</a><br>";
		print '<br>';
	

if (isset($_GET['usun'])) {

	$usun=$_GET['usun'];


	$zapytanie="delete from baza_filmow where Id='$usun'";

	$wynik=mysqli_query($aVar ,$zapytanie);

			if($wynik){
				header("Location:index.php");
			}
}

//include_once $_SERVER['DOCUMENT_ROOT'] . '/includes/magicquotes.inc.php';
require_once $_SERVER['DOCUMENT_ROOT'] . '/wPHP/access.inc.php';
if(!userIsLoggedIn()){
	include 'C:\xampp\htdocs\wPHP\login.html.php';
	exit();
}


	#if (mysqli_connect_errno()) {
	#	echo"blad";
	#}
	#else{
	#	$add=$_POST['add'];
	#	$sql = 'INSERT INTO `baza_filmow`(`tytul`, `rok_wyd`, `gatunek`) VALUES ([tytul],[rok_wyd],[gatunek])';
	#	$wynik1 = $aVar->query($sql);
	#	header("location: index.php");
	#}
	
// (isset($_POST['add'])) {
//
	//	$add=$_POST['add'];
	//$zapytanie="INSERT INTO `baza_filmow`( `tytul`, `rok_wyd`, `gatunek`) VALUES ([tytul1],[rok_wyd1],[gatunek1	])";

//	$wynik=mysqli_query($aVar ,$zapytanie);

	//	if($wynik){
		//header("Location:index.php");
	//}
	
//}
?>

