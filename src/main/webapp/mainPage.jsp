<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConverterNumeralSystem</title>
</head>
<body>
    <form action="/resultServlet" method="POST">
        <h1><b>Перевод чисел из одной системы счисления в другую онлайн</b></h1>
        <p><b>Введите число:</b><br>
            <input type="text" name="number" size="40">
        </p>
        <p><b>Его система счисления:</b><br>
            <input type="text" name="a" value="" size="40">
        </p>
        <p><b>Перевести в:</b><br>
            <input type="text" name="b" size="40">
        </p>
        <p><button type="submit" id="btn_convert">Перевести</button></p>
    </form>
</body>
</html>
