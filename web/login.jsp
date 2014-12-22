<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/22
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form action="/login/login" method="post" >
   <input type="text" name="userName"/>
    <input type="password" name="userPass"/>
    <%--<form:input path="userName" />--%>
    <%--<form:password path="userPass"/>--%>
    <input type="submit"/>
</form:form>

</body>
</html>
