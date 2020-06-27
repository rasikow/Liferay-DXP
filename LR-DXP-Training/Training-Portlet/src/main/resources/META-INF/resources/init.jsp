<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />


<!-- 
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script> -->
  
 <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletSession"%>

<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>

<portlet:renderURL var="renderPage1">
 <portlet:param name="mvcPath" value="/renderURL.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage2">
 <portlet:param name="mvcPath" value="/actionURL.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage3">
 <portlet:param name="mvcPath" value="/resourceURL.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage4">
 <portlet:param name="mvcPath" value="/formSubmit.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage5">
 <portlet:param name="mvcPath" value="/mvcCommands.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage6">
 <portlet:param name="mvcPath" value="/searchContainer.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage7">
 <portlet:param name="mvcPath" value="/crud.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="renderPage8">
 <portlet:param name="mvcPath" value="/restService.jsp"/>
</portlet:renderURL>


<portlet:renderURL var="renderPage9">
 <portlet:param name="mvcPath" value="/liferayAPI.jsp"/>
</portlet:renderURL>