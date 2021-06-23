<%@ page import="com.example.BeerE.Beer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: syw
  Date: 2021/4/18
  Time: 11:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>

<%
    ArrayList styles =(ArrayList)request.getAttribute("styles");
    for(Object s: styles){
        out.print("<br>try:"+((Beer)s).toString());
    }
%>
</body>
</html>
