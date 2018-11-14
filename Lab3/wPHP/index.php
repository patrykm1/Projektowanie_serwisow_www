<h2>Blog o filmach</h2>
<h3>Baza filmów</h3>

<?php
	$aVar = mysqli_connect("localhost", "root", "" );
	$filmy= "filmy";
	
	$baza1 = mysqli_select_db($aVar, $filmy )
	or die ("Blad wyboru bazy danych");
	
	$wynik=mysqli_query($aVar, "select * from baza_filmow")
	or die ("wystapily problemy");
	
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

?>

