<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
    </style>
    <title>Login</title>
</head>
<body>
<c:form action="/signIn" method="post" modelAttribute="cUser">
   Mail: <c:input path="mail"/>
    <div>
    <c:errors path="mail"/>
    </div>
    Password: <c:input path="password"/>
    <div>
    <c:errors path="password"/>
    </div>
    <c:button>Sig In</c:button>
</c:form>

</body>
</html>
