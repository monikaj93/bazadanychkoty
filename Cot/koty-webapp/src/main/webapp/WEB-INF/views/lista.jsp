<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Lista kotów</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	</head>
	<body>
		<div class="container">
		<a href="dodaj" class="btn btn-primary" role="button">Dodaj kota</a><br /><br />
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Imie kota</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach varStatus="status" var="kot" items="${koty}">
                   <tr>
                     <td>${status.index+1}</td>
                     <td><a href="<c:url value="kot-${status.index+1}" />">${kot.imie}</a></td>
                   </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
	</body>
</html>