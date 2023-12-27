<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@page import="entity.home"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AirBnb</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<% try {
    homeService homeService = new homeService();
    List<home> list = homeService.getAllCourse();
    pageContext.setAttribute("listA", list);
} catch (Exception e) {
    e.printStackTrace(); // Handle the exception appropriately, log it, or show an error message.
}
 %>
 <ol>
  <c:forEach items="${listA}" var="home">
   <li>${home.name}</li>
  </c:forEach>
</ol>


</body>
</html>