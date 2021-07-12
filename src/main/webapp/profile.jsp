<%--
  Created by IntelliJ IDEA.
  User: serik
  Date: 12.07.2021
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile page</title>
</head>
<body>

<a href="login.jsp">Login</a>
<a href="logoutServlet">Logout</a>
<a href="profileServlet">Profile</a>
<br>
<h1>Hello! This is your profile page:</h1>
<h4>
  Your username is:  <%=session.getAttribute("name")%>
</h4>


</body>
</html>
