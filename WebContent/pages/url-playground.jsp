<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>PAGINA ATTUALE: ${cur_page}</h1>

	<a href="/tutorial-webapp-base/pagina?num_pagina=1">1</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=2">2</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=3">3</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=4">4</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=5">5</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=6">6</a>
	<a href="/tutorial-webapp-base/pagina?num_pagina=${next}">Prossimo</a>

</body>
</html>