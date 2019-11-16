<%@ include file="/init.jsp" %>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<% String name = ParamUtil.getString(request, "name"); %>

Welcome Mr. <%=name %> 