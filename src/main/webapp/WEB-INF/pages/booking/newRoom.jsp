<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 11.08.2019
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:form modelAttribute="newroom" method="post" action="/hotels/addroom">
    Hotel: <c:input path=""/>
    <div><c:errors cssStyle="color: red;" path="hotelName"/></div>
    Type <c:input path="type"/>
    <div><c:errors cssStyle="color: red;" path="type"/></div>
    Price <c:input path="price"/>
    <div><c:errors cssStyle="color: red;" path="price"/></div>
    <c:button>Add room</c:button>
</c:form>
</body>
</html>
