<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dodaj kota</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	</head>
	<body>
		<div class="container">
		<a href="lista" class="btn btn-default" role="button">Powrót do listy kotów</a><br /><br />
		<form:form method="POST" modelAttribute="dodajKotaFormularz">

        <th>Imię:</th>
        <form:input path="imieKota" type="text" id="imieKota"></form:input>
        <c:if test="${pageContext.request.method=='POST'}"><form:errors path="imieKota" cssclass="error" />
        <br/>

        Data Urodzenia (MM-dd-yyyy):
        <form:input path="dataUrodzenia" type="text" id="dataUrodzenia"></form:input>
        <c:if test="${pageContext.request.method=='POST'}"><form:errors path="dataUrodzenia" cssclass="error" />
        <br/>

        Waga:
        <form:input path="waga" type="text" id="waga"></form:input>
        <c:if test="${pageContext.request.method=='POST'}"><form:errors path="waga" cssclass="error" />
        <br/>

        Opiekun:
        <form:input path="imieOpiekuna" id="imieOpiekuna"></form:input>
        <c:if test="${pageContext.request.method=='POST'}"><form:errors path="imieOpiekuna" cssclass="error" />
        <br/>

        <p><input type="submit" class="btn btn-primary" value="Dodaj!" /></p>
		</form:form>
		</div>
	</body>
</html>