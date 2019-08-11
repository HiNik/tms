<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 11.08.2019
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AdminPage</title>
</head>
<body>
<h1> Welcome,${admin.name} </h1>
<c:forEach var="user" items="${allUsers}">
    <tr>
        <td><c: out value="${user}"/>1</td>
        <td><c: out value="${user.name}"/>2</td>
        <td><c: out value="${user.surname}"/>3</td>
        <td><c: out value="${user.phone}"/>4</td>
        <td><c: out value="${user.mail}"/>5</td>
    </tr>
</c:forEach>
<a href="${pageContext.request.contextPath}/homepage">HomePage</a>
</body>
</html>
