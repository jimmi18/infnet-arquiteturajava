<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>AppLocadora</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
 
 <h2>Login</h2>
  <form action="/login" method="post">
  	<div class="form-group">
      <label>Email:</label>
      <input type="email" class="form-control" placeholder="Digite o e-mail" name="email">
    </div>
    <div class="form-group">
      <label>Senha:</label>
      <input type="password" class="form-control" placeholder="Digite a senha" name="senha">
    </div>
    <button type="submit" class="btn btn-default">Fazer Login</button>
  </form>

</div>
</body>
</html>