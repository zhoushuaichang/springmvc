<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
${error}
<form:form action="/test/test3" method="post" modelAttribute="stu">
    <form:select path="stuId" items="${stuList}" itemLabel="stuName" itemValue="stuId"></form:select>
    <input type="submit"/>
</form:form>

</body>
</html>
