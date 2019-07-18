<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Ana Sayfa</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  
	  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
	  
	  	<a class="navbar-brand" href="#">Hidden brand</a>
	  	
	  	<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	    	<li class="nav-item active">
	    		<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	     	</li>
	      	<li class="nav-item">
	        	<a class="nav-link" href="${pageContext.request.contextPath}/newActor">Oyuncu Ekle</a>
	      	</li>
	      	<li class="nav-item">
	        	<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
	      	</li>
	      	<li>
	      		<form class="form-inline my-2 my-lg-0">
	      			<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
	      			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	    		</form>
	      	</li>
	  	</ul>
	  	 
	  	 
	  	 <sec:authorize access="isAuthenticated()">
	  	 	<font color="white" class="mr-4" style="text-transform:uppercase"><sec:authentication property="principal.username"/></font>
	  	 	<form action="logout" method="post">
	  	 		<input type="submit"  class="btn btn-outline-success" value="Çıkış Yap"/>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	  	 	</form>
	  	 </sec:authorize>
	  	 		
	  </div>
	</nav>
	
	<c:forEach items="${movies}" var="movie">	
		<tr>
			<td><a href="${pageContext.request.contextPath}/movie/${movie.id}">${movie.name}</a></td> </br>
		</tr>	
	</c:forEach>
</body>
</html>