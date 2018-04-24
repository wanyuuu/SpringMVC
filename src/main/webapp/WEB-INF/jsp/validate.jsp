<%@ page language="java"
         contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<!-- 必须使用Spring的组件 -->
<form:form method="post" action="/vc/val" commandName="user">
    <h4 align="center"><u>登录页</u></h4>
    <table align="center">
        <tr>
            <td>用户名:</td>
            <td><form:input path="username" /><font color="red">
                <form:errors	path="username" /></font></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="number" name="age" value="10" ><font color="red">
                <form:errors path="age" /></font></td>
        </tr>
        <tr>
            <td>密码:</td>

            <td><form:password path="pwd" /><font color="red">
                <form:errors     path="pwd" /></font>



            </td>
        </tr>
        <tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Submit" /></td>
        </tr>
    </table>
</form:form>


</body>

</html>