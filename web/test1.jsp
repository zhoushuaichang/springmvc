<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/19
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/inprama/test2" method="post">
    <spring:message code="stu.stuName"/>    <input type="text" name="stuId"/>
    ${stu.stuName} <input type="text" name="stuName"/>
    <input type="submit"/>
</form>

</body>
</html>
