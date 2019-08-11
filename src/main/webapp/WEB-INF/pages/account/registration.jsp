<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration User</title>
</head>
<body>
<c:form modelAttribute="newUser" method="post" action="/reg">
   Name: <c:input path="name"/>
    <div><c:errors cssStyle="color: red;" path="name"/></div>
    Surname: <c:input path="surname"/>
    <div><c:errors cssStyle="color: red;" path="surname"/></div>
    Age: <c:input path="age"/>
    <div><c:errors cssStyle="color: red" path="age"/></div>
    Mail: <c:input path="mail"/>
    <div><c:errors cssStyle="color: red;" path="mail"/></div>
    Phone: <c:input path="phone"/>
    <div><c:errors cssStyle="color: red;" path="phone"/></div>
    Password: <c:input path="password"/>
    <div><c:errors cssStyle="color: red;" path="password"/></div>
    <c:button>Registration</c:button>
</c:form>
</body>
</html>
