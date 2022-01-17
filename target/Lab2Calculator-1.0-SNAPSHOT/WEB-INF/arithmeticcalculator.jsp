

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first">First:</label>
            <input type="text" id="first" value = "${param.first}" name="first">
            <br>
            <label for="second">Second: </label>
            <input type="text" id="second" value = "${param.second}" name="second">
            <br>
            <button type="submit" name="ope" value="add">+</button>
            <button type="submit" name="ope" value = "sub">-</button>
            <button type="submit" name="ope" value = "mul">*</button>
            <button type="submit" name="ope" value = "mod">%</button>
        </form>
        <p>Result:${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
