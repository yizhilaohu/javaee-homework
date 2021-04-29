<%@ page import="com.example.BeerE.Beer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: syw
  Date: 2021/4/18
  Time: 11:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Recommended JSP</title>
</head>
<body>
<%
    List<Beer> styles = (List<Beer>) request.getAttribute("styles");
    out.println("<br/>This is a jsp page");

    for (Beer brand: styles) {
        out.println("<br/>try: " + brand);
    }
%>
</body>
</html>
