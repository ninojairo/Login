<%-- 
    Document   : layout
    Created on : 30-ago-2018, 18:21:33
    Author     : JairoNino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>
<tiles:getAsString name="title"/>
</title>
</head><body>
<table border="1" cellpadding="2" cellspacing="2" align="center">
<tr>
<td height="30" colspan="2">
<tiles:insertAttribute name="header"/>
</td>
</tr>
<tr>
<td width="350">
<tiles:insertAttribute name="body"/>
</td>
</tr>
<tr>
<td height="30" colspan="2">
<tiles:insertAttribute name="footer"/>
</td>
</tr>
</table>
</body>
</html>