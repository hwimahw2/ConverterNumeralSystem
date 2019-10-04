<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConverterNumeralSystem</title>
</head>
<body>
    <form action="/resultServlet" method="POST">
        <h1><b>Conversion of numbers between numeral systems</b></h1>
        <p><b>Number:</b><br>
            <input type="text" name="number" value="${number}" size="40">
        </p>
        <p><b>Input base:</b><br>
            <input type="text" name="a" value="${a}" size="40">
        </p>
        <p><b>Target base:</b><br>
            <input type="text" name="b" value="${b}" size="40">
        </p>
        <p><b>Result:</b><br>
            <input type="text" name="result" value="${result}" size="40">
        </p>
        <p><button type="submit" id="btn_convert">Calculate</button></p>
    </form>
</body>
</html>
