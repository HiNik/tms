<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 12.08.2019
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:form method="get" modelAttribute="hotels" action="/hotels">
    <s:forEach var="hotel" items="${hotels}">
        <menu aria-label="Hotels:">

            <li>Name:<s:out value="${hotel.hotelName}"/></li>
            <li>Description:<s:out value="${hotel.hotelDescription}"/></li>
            <li>Rooms:<s:out value="${hotel.rooms}"/></li>

        </menu>
    </s:forEach>
</c:form>
<c:form modelAttribute="newreservation" method="post" action="reservation/new">
    Hotel Name: <c:input path="hotel.hotelName"/>
    <div><c:errors cssStyle="color: red;" path="hotel.hotelName"/></div>
    Type: <c:input path="room.type"/>
    <div><c:errors cssStyle="color: red;" path="room.type"/></div>
    Price: <c:input path="room.price"/>
    <div><c:errors cssStyle="color: red" path="room.price"/></div>
    <c:button>Registration</c:button>
</c:form>
</body>
</html>
