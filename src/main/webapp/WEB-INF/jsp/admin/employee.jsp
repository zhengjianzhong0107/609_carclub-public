<%--
  Created by IntelliJ IDEA.
  User: Kuexun
  Date: 2018/6/21
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
${employeeList[0].employeeId}
${employeeList[0].employeeName}
${employeeList[0].employeeSex}

<a href="/admin/employee/delete/${employeeList[0].employeeId}">点击删除第一个</a>
</body>
</html>
