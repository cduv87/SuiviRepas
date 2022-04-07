<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<link href="https://fonts.googleapis.com/css2?family=Fira+Code&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/style.css" />
		<meta charset="UTF-8">
		<title>SUIVI DES REPAS</title>
	</head>
	<body>
		<h1>Welcome to the "Suivi des Repas" small application</h1> <br>
		<p class="message-confirmation">${messageConfirmation}</p>
		<form action="./AjoutRepas">
			<button>Ajouter Repas </button>
		</form>
		<br>
		<form action="./AfficherRepas">
			<button>Afficher Repas</button>
		</form>
	</body>
</html>
