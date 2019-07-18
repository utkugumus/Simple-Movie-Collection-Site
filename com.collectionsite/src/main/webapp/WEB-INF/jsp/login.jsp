<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Giriş Sayfası</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	
	<form action="login" method="post">		
  		<div class="container">
  			<div align="center">
	  		<h1>Giriş Sayfası</h1>
	  		<div class="form-group w-50">
	    		<label for="exampleInputEmail1">Kullanıcı Adı</label>
	    		<input type="text" class="form-control" name="username">
	  		</div>
	  		<div class="form-group w-50">
	    		<label for="exampleInputPassword1">Password</label>
	    		<input type="password" class="form-control" name="password">
	  		</div>
	  		<div class="form-group form-check">
	    		<input type="checkbox" class="form-check-input" id="exampleCheck1" name="remember-me">
	    		<label class="form-check-label" for="exampleCheck1">Beni Hatırla</label>
	  		</div>
	  		<button type="submit" class="btn btn-primary">Giriş Yap</button> </br>
	  		<a href="${pageContext.request.contextPath}/register">Kayıt Ol</a>
	  		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	  		<font color="blue">
	  			<c:if test="${not empty param.loginFailed}">
	  				<c:out value="Giriş Başarısız, Kullanıcı Adı veya Parola Hatalı"></c:out>
	  			</c:if>
	  		</font>
 			</div>
  		</div>
	</form>
</body>
</html>