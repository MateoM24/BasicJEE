<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2017-02-23
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <meta http-equiv="content-type" content="text/html" charset="ISO-8859-1">
</head>
<body>
My login page in jsp
<br>
Do method param1 is: ${param1}
<%
    //testing scriplet
    System.out.println("scriplet works");
    LocalDateTime data =LocalDateTime.now();
%>
<br>
Local time from scriplet expression is: <%=data%>
<br>
<p><font color="red">${errorMessage}</font></p>
<form action="/login" method="post">
    Enter your name <input type="text" name="name"> and password <input type="password" name="password"><input type="submit" value="Zaloguj!">
</form>

</body>
</html>
