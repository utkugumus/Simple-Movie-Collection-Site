<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	
 <table class="table table-striped"> 
    	<tr>
      		<th scope="col">Filmin İsmi</th>
      		<td>  <input type="text" name="name" value="${movie.name}" > </td>
    	</tr>
		<tr>
			<th scope="col">Yayınlanma Tarihi</th>
			<td> <input type="text" name="release_year" value="${movie.releaseYear}"></td>
		</tr>
		<tr>
 			<th scope="col">Türü</th>
 			<td> <input type="text" name="type" value="${movie.type}"></td>
 		</tr>
 		<tr>
 			<th scope="col">Film Açıklama</th>
 			<td> <textarea rows="7" cols="50" name="description">${movie.description}</textarea> </td>
 		</tr>
 		<tr>
 			<th scope="col">Medya</th>
 			<td> <input type="text" name="media" value="${movie.media}"> </td>
 		</tr>
 		<tr>
 			<th scope="col">Oyuncular</th>
 			<td> 
 				<c:forEach items="${movie.movieActors}" var="movieActors">
 					 <b>Oyuncu isim:</b> ${movieActors.actor.fullName}	<b>Rol:</b> ${movieActors.role} </br>
 				</c:forEach> 
 			</td>
 		</tr>
 		<tr>
 			<th scope="col">Yeni Oyuncu Ekle</th>
 			<td>
 				<form action="${pageContext.request.contextPath}/newActor">
 					
 					<button class="btn" type="submit"><i class="fas fa-plus-circle"></i></button>
 				</form> 
 			</td>
 		</tr>
	</table>

</body>
</html>