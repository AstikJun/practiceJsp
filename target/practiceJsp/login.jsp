<%--
  Created by IntelliJ IDEA.
  User: serik
  Date: 11.07.2021
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Log in</h1>
<br>
<form action="LoginServlet" method="post">
    Name:<input type="text" name="username"><br>
    Password:<input type="password" name="pass"><br>
    <input type="submit" value="submit">

</form>
</body>
</html>
