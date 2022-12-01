<%--
  Created by IntelliJ IDEA.
  User: lukehongg
  Date: 12/1/22
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Editform</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Edit Form</title>
</head>
<body>
<h1 align="center">동영상 수정</h1>
<div align="center">
    <form:form modelAttribute="boardVO" action="../editok" method="POST" >
        <form:hidden path="seq"/>

        <label for="title" class="form-label">제목:</label>
        <form:input path="title" />
        <br />
        <label for="youtuber" class="form-label">유튜버:</label>
        <form:input path="youtuber" />
        <br />
        <label for="link" class="form-label">링크:</label>
        <form:input path="link" />
        <br />
        <label for="views" class="form-label">조회수:</label>
        <form:input path="views" />
        <br />
        <label for="content" class="form-label">정보:</label>
        <form:textarea cols="50" rows="5" path="content" />
        <br />
        <input type="submit" class="btn btn-primary" value="수정" />
        <input type="button" value="취소" class="btn btn-danger" onclick="history.back()" />
    </form:form>
</div>
</body>
</html>