<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>SONO PAGINA DI LANDING</h1>
	
	<p style="color: red;">${tostapane}</p>
	<%   
		// NON FARE MAI PORCATE COME QUELLA QUI SOTTO
		String ciao = "heyla gente!!!";
		ciao = ciao + " questo codice fa schifo!";
		out.print("<h2>" + ciao + "</h2>");
	%>
	
	<p style="color: green;">${ditapiedi}</p>
</body>
</html>