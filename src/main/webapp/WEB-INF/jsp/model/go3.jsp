<%--
  Created by IntelliJ IDEA.
  User: samsung
  Date: 2017/11/25
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${userList}" var="i">
        ${i.username}==${i.pwd}
        <br/>
    </c:forEach>
</body>
</html>
