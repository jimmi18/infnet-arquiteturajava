<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Avi�es</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
  <h3>Avi�es: ${listagem.size()}</h3>
  
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Tipo Motor: </th>
        <th>Combustivel: </th>
        <th>QTD Pessoas: </th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="aviao" items="${listagem}">
      <tr>
        <td>${aviao.tipoMotor}</td>
        <td>${aviao.combustivel}</td>
        <td>${aviao.qtdPessoas}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>