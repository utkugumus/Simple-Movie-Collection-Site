<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Oyuncu Oluşturma Sayfası</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/newActor" method="post">
		Oyuncunun İsmi: <input type="text" name="fullName"/> </br>
						<button class="btn btn-primary" type="submit">Oluştur</button>  </br>
						${errorMessage}
	</form:form>
</body>
</html>