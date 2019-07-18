<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Kayıt Sayfası</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/register" method="post">
		<h1>Kayıt Sayfası</h1>
		Kullanıcı Adı: <input type="text" name="username"/> </br>
		Şifre: <input type="password" name="password"/> </br>
			   <button type="submit">Kayıt Ol</button>
	</form:form>
</body>
</html>