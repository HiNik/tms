<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 11.08.2019
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Account ${user.surname}</title>
</head>
<body>
<h1> Welcome,${user.name} </h1>
Surname:${user.surname}
Mail:${user.mail}
Phone:${user.phone}
Password: ${user.password}
<a href="${pageContext.request.contextPath}/homepage">HomePage</a>
</body>
</html>
