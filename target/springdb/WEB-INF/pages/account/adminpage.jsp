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

      <%-- <div> <td><c:out value="${user}"/></td></div>--%>
          <div>Name:<td><c:out value="${user.name}"/></td></div>
          <div>Surname:<td><c:out value="${user.surname}"/></td></div>
          <div>phone:<td><c:out value="${user.phone}"/></td></div>
          <div>Mail:<td><c:out value="${user.mail}"/></td></div>
    </tr>
    <br>
</c:forEach>
<a href="${pageContext.request.contextPath}/homepage">HomePage</a>
</body>
</html>
