<%--
  Created by IntelliJ IDEA.
  User: lukehongg
  Date: 12/1/22
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
<html>
<head>
  <meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <title>Insert title here</title>
</head>
<body >
<h1 align="center">동영상 추가</h1>
<div align="center">
  <form action="addok" method="post">
    <label for="title" class="form-label">제목:</label>
    <input type="text" id="title" name="title"/>
    <br />
    <label for="youtuber" class="form-label">유튜버:</label>
    <input type="text" id="youtuber" name="youtuber"/>
    <br />
    <label for="link" class="form-label">링크:</label>
    <input type="text" id="link" name="link"/>
    <br />
    <label for="views" class="form-label">조회수:</label>
    <input type="number" id="views" name="views"/>
    <br />
    <label for="content" class="form-label">정보:</label>
    <textarea cols="50" rows="5" id="content" name="content"></textarea>
    <br />
    <button type="submit" class="btn btn-primary" value="Add Post">추가</button>
    <button type="button" class="btn btn-danger"><a href="list" style="text-decoration: none; color: white;">취소</a></button>
  </form>
</div>




</body>
</html>
