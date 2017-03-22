<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/3/21
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<H1>列表</H1>
<a href="/findAll.do">查看所有！</a>
<br/><br/><br/><br/>

<H1>查找</H1>

<form action="/findOne.do">
    用户ID：<input name="id" /><br/>
    <input type="submit" value="Search!"/>
</form>

</body>
</html>
