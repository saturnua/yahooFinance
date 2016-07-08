<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04.07.2016
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <br>
  <h2>Please do you choise, ONLY 2 boxes must be marked</h2>
<form action="/queryToFinance" method="post">
    <input type="checkbox" value="EURUSD" name="group">USD-EUR</input><br>
    <input type="checkbox" value="AUDUSD" name="group">AUD-USD</input><br>
    <input type="checkbox" value="GBPUSD" name="group">GBP-USD</input><br>
    <input type="checkbox" value="USDJPY" name="group">USD-JPY</input><br>
    <input type="checkbox" value="EURJPY" name="group">EUR-JPY</input><br>
    <input type="checkbox" value="EURGBP" name="group">EUR-GBP</input><br>
    <input type="checkbox" value="USDCAD" name="group">USD-CAD</input><br>
    <input type="checkbox" value="USDUAH" name="group">USD-UAH</input><br>
    <input type="checkbox" value="EURUAH" name="group">EUR-UAH</input><br>
    <input type="submit" value="Submit">
  </form>


  </body>
</html>
