<%--
  Created by IntelliJ IDEA.
  User: samsung
  Date: 2017/11/25
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${map}" var="m">
        ${m.key}---${m.value.username}---${m.value.pwd}
    </c:forEach>
</body>
</html>
