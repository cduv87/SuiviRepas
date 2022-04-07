<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Fira+Code&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<meta charset="UTF-8">
<title>Listes des repas</title>
</head>
<body>
	<form action="./AfficherRepas" method="GET">
		<c:if test="${listeRepas.size() > 0}">
			<h3>Mes Repas</h3>
			<ul>
				<c:forEach items="${listeRepas}" var="item">
					<li><c:if test="${item.condition == false}">
					${item} 
					<button name="detail" value="${item.id}">détails</button>
						</c:if> <c:if test="${item.condition == true}">
					${item}
					<button name="reduire" value="${item.id}">réduire</button>
						</c:if></li>
				</c:forEach>
			</ul>
		</c:if>
	</form>
	<a href="./">Accueil</a>
</body>
</html>