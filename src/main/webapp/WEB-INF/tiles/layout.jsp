<%-- 
    Document   : layout
    Created on : 30-ago-2018, 18:21:33
    Author     : JairoNino
--%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

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