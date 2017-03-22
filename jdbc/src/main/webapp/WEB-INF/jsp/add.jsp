<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/3/21
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <%--<form:form action="/insert" method="post" modelAttribute="student">--%>
        <%--姓名:<form:input  path="name"/><br>--%>
        <%--年龄:<form:input  path="age"/><br>--%>
        <%--sex :<form:input  path="sex"/><br>--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form:form>--%>


    <form action="/insert.do" method="post" >
        <table>
            姓名:<input  name="name"/><br>
            年龄:<input  name="age"/><br>
            sex :<input  name="sex"/><br>
            <input type="submit" value="提交">
        </table>
    </form>

</body>
</html>
