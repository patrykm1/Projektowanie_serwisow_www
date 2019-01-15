<?php
$aVar = mysqli_connect("localhost", "root", "" );
	$filmy= "filmy";
	
	$baza1 = mysqli_select_db($aVar, $filmy )
	or die ("Blad wyboru bazy danych");
	
	$wynik=mysqli_query($aVar, "select * from baza_filmow")
	or die ("wystapily problemy");
	
	?>