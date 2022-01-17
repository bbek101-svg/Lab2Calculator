<%-- 
    Document   : agecalculator
    Created on : Jan 16, 2022, 1:45:21 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label for='age'>Enter you age: </label>
            <input type='text' name='age' id='age' >
            <br>
            <br>
            <button type="submit">Age next birthday</button>
        </form>
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
