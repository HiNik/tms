<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 11.08.2019
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form method="post" modelAttribute="hotels" action="/hotels">
    <c:forEach var="hotel" items="${hotels}">
        <menu aria-label="Hotels:">

            <li>Name:<c:out value="${hotel.hotelName}"/></li>
            <li>Description:<c:out value="${hotel.hotelDescription}"/></li>
            <li>Rooms:<c:out value="${hotel.rooms}"/></li>

        </menu>
    </c:forEach>
</s:form>
<c:if test="${sessionScope.cAdmin!= null }">
    <a href="${pageContext.request.contextPath}/hotels/newH">Add hotel</a>
    <a href="${pageContext.request.contextPath}/room/newR">Add Room</a>
</c:if>
<a href="${pageContext.request.contextPath}/homepage">HomePage</a>
</body>
</html>
