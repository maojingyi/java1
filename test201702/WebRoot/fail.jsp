<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java"
	import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'fail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	You are not allowed to enter.
	<br>
	<label><s:property value="#request.list" /></label>
	<input value="<s:property value="#request.list"/>">
	<br>
	<table border="2px">
		<s:iterator var="region" value="list" status="st">
			<tr>
				<td><s:property value="region" /></td>
				<td><s:property value="#st.odd" /></td>
			</tr>
		</s:iterator>
	</table>
	<form action="">
		<s:checkboxlist name="test" list="list" label="region"
			labelposition="left" value="0"></s:checkboxlist>
		<s:select list="list">
			<s:optgroup label="region" list="#{'0':'a','1':'b','2':'c'}"
				listKey="key" listValue="value"></s:optgroup>
		</s:select>
		<s:file name="file" label="upfile"></s:file>
		<input type="submit">
	</form>
	<s:debug></s:debug>
</body>
</html>
