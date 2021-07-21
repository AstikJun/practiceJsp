<%--
  Created by IntelliJ IDEA.
  User: serik
  Date: 13.07.2021
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="login.jsp">Login</a>
<a href="secured/logoutServlet">Logout</a>
<a href="secured/profileServlet">Profile</a>
<h4>
    Your username is:  <%=session.getAttribute("username")%>
</h4>
</body>
</html>
