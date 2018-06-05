<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dodaj zabawke</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	</head>
	<body>
		<div class="container">
		<a href="lista" class="btn btn-default" role="button">Powrót do listy kotów</a><br /><br />
		<form:form method="POST" modelAttribute="dodajZabawkeFormularz">

        <th>Nazwa Zabawki:</th>
        <form:input path="nazwaZabawki" type="text" id="nazwaZabawki"></form:input>
        <c:if test="${pageContext.request.method=='POST'}"><form:errors path="nazwaZabawki" cssclass="error" />
        <br/>

        <p><input type="submit" class="btn btn-primary" value="Dodaj!" /></p>
		</form:form>
		</div>
	</body>
</html>