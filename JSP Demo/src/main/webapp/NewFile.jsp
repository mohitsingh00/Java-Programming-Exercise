<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2> Welcome to JSP page </h2>
  <%
      String s = "Dave Andreson";
      int len = s.length();
  %>
  <%= len %>
</body>
</html>