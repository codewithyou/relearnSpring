<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/3/21
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
    <title>all</title>
</head>
<body>

<c:forEach items="${userList}" var="item">
    <table>
    <tr><td>id:${item.id}</td>
        <td>name:${item.name}</td>
        <td>age:${item.age}</td>
        <td>sex:${item.sex}</td>
    </tr>
</table>
</c:forEach>



</body>
</html>
