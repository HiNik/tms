<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>
<c:if test="${sessionScope.currentUser== null}">
    <a href="${pageContext.request.contextPath}/reg">Registration</a>
    <a href="${pageContext.request.contextPath}/signIn">Sig In</a>
    <a href="${pageContext.request.contextPath}/hotels">hotels</a>
</c:if>
<c:if test="${sessionScope.currentUser!= null }">
    <a href="${pageContext.request.contextPath}/">Add post</a>
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
    <a href="${pageContext.request.contextPath}/account">User Cabinet</a>
</c:if>

</body>
</html>
