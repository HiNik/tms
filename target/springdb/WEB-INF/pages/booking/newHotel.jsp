<%--
  Created by IntelliJ IDEA.
  User: zhuri
  Date: 11.08.2019
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:form modelAttribute="newhotel" method="post" action="/hotels/addhotel">
   Hotel: <c:input path="hotelName"/>
    <div><c:errors cssStyle="color: red;" path="hotelName"/></div>
    Description: <c:input path="hotelDescription"/>
    <div><c:errors cssStyle="color: red;" path="hotelDescription"/></div>
    <c:button>Add hotel</c:button>
</c:form>
</body>
</html>
