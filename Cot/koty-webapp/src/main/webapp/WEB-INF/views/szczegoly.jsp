<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Szczegóły kota</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	</head>
	<body>
		<div class="container">
		<a href="lista" class="btn btn-default" role="button">Powrót do listy kotów</a><br /><br />
		<table class="table table-bordered">
			<tbody>
				<tr>
					<th>Imię</th>
					<td>${kot.imie}</td>
				</tr>
				<tr>
					<th>Data urodzenia</th>
					<td><fmt:formatDate pattern="MM-dd-yyyy" value="${kot.dataUrodzenia}" /></td>
				</tr>
				<tr>
					<th>Waga</th>
					<td><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${kot.waga}" /> kg</td>
				</tr>
				<tr>
					<th>Imię opiekuna</th>
					<td>${kot.imieOpiekuna}</td>
				</tr>
				<tr>
                	<th>Zabawki</th>
                	<td><a href="<c:url value="dodajZabawke-${param.kotID}"/>" class="btn btn-primary" role="button">Dodaj Zabawke</a>
                	<c:forEach var="zabawka" items="${zabawka}" >
                        ${zabawka.nazwa}
                    </c:forEach></td>
                </tr>
			</tbody>
		</table>
		</div>
	</body>
</html>