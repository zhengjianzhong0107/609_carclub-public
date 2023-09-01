<%--
  Created by IntelliJ IDEA.
  User: Kuexun
  Date: 2018/6/21
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提醒信息</title>
</head>
<body>
${remindList[0].remindId}
${remindList[0].remindTime}

<a href="/admin/remind/delete/${remindList[0].remindId}">点击删除第一个</a>
</body>
</html>
