<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Bangalore Wiki</title>

<link type="text/css" href="css/bwiki-style.css" rel="stylesheet"/>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script src="script/jquery-1.7.min.js"></script>
</head>

<body>
<div class="content-section">
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="menu"/>
	<div id="content">
		<tiles:insertAttribute name="body"/>
	</div>
</div>
</body>
</html>
