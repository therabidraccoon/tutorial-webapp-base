<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>SESSION PLAYGROUND:</h2>
	<h5>Utente Loggato: ${logged_user}</h5>
	<a href="/tutorial-webapp-base/logout">LOGOUT</a>

	<form action="/tutorial-webapp-base/add-frase" method="GET">
		<label>Inserisci frase da aggiungere:</label> <input type="text"
			name="frase" /> <input type="submit" value="AGGIUNGI FRASE" />
	</form>
	<p>Inserite ${numero_frasi} frasi</p>
	<ul>
		<c:forEach items="${lista_frasi}" var="frase">
			<li>${frase}</li>
		</c:forEach>
	</ul>

</body>
</html>