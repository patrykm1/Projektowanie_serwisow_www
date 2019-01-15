

<?php
	function dbContainUser($login, $pass){
		
		include 'polacz.php';
		$login = mysqli_real_escape_string($aVar, $login);
		$pass = mysqli_real_escape_string($aVar, $pass);
		
		//$sql = 'SELECT * FROM users WHERE login="'.$_POST["login"].'" && pass = "'.$_POST["pass"].'"';
		$sql = 'SELECT * FROM users WHERE login = "'.$_POST["login"].'"';
		$result = mysqli_query($aVar, $sql);
	
		if(!$result){
			$error = 'blad wyszukiwania';
			echo "blad wyszukiwania";
			
		exit();
		}
		$row = mysqli_fetch_array($result);
		 print_r ($row);
		if($row[0]>0){
			//echo "true";
		return TRUE;}
		else{
			//echo"false";
		return FALSE;}
		}
		
function userIsLoggedIn(){
	if(isset($_POST['action'] ) and $_POST['action']=='zaloguj'){
	
		
		if(!isset($_POST['login']) or $_POST['login'] == '' or !isset($_POST['pass']) or $_POST['pass'] == ''){
			$GLOBALS['loginError'] = 'Nie wypelniono obu pol';
			echo "Nie wypelniono obu pol";
		return FALSE;
		}
		$login = $_POST['login'];
		$pass = md5($_POST['pass']);

		
		if(dbContainUser($login, $pass)){
		
			session_start();
			$_SESSION['loggedIn'] = TRUE;
			$_SESSION['login']=$login;
			$_SESSION['pass']= $pass;
			echo "Poprawne zalogowanie\n";
			return TRUE;
			
		}
		
		else{
		
			session_start();
			unset($_SESSION['loggedIn']);
			unset($_SESSION['login']);
			unset($_SESSION['pass']);
			$GLOBALS['loginError']='niepoprawne dane';
			echo "niepoprawne dane";
			return FALSE;
		}
	
		session_start();
		if(isset($_SESSION['loggedIn'])){
			
		return dbContainUser($_SESSION['login'], $_SESSION['pass']);
		}
		
	}
		
}
		//$sql = 'SELECT * FROM users WHERE login = "'.$_POST["login"].'" AND pass = "'.$_POST["pass"].'"';
		//$sql = 'SELECT pass FROM users WHERE login = "'.$_POST["login"].'"';
		
		
		//$sql = "SELECT * FROM users WHERE login='$login' AND pass='$pass'";
		//$sql = "SELECT COUNT (*) FROM users WHERE login='$login' AND pass='$pass'";
		
	?>