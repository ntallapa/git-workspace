<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<display:table name="list" export="false">
	<display:column property="no" title="#"/>
	<display:column property="place" title="Place"/>
	<display:column property="rating" title="Rating"/>
	<display:column property="type" title="Type"/>
	<display:column property="dist" title="Distance"/>
	<display:column property="direction" title="Direction"/>
	<display:column property="road" title="Road"/>
	<display:column property="food" title="Food"/>
	<display:column property="lodge" title="Lodge"/>
	<display:column property="petrol" title="Petrol"/>
	<display:column property="remarks" title="Remarks"/>
	<display:column property="days_reqd" title="Days Reqd"/>
	<display:column property="from_period" title="from_period"/>
	<display:column property="to_period" title="to_period"/>
</display:table>