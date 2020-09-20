<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Conver</title>
</head>
<body>
<form action="/convers" method="post" style="width: 200px;height: 100px">
    <fieldset>
        <legend> Currency conversion</legend>
        <input type="number" placeholder="nhap usd" name="usd">
        <input type="submit" value="conver">

    </fieldset>
</form>
<h1>${vnd}</h1>

</body>
</html>
