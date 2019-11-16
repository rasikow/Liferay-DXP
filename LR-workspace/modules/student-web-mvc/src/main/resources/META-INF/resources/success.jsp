<%@ include file="/init.jsp" %>

Successfully Student Added

<%=renderRequest.getAttribute("GREETER_MESSAGE") %>

<liferay-portlet:renderURL var="viewPageURL">
   <portlet:param name="jspPage" value="/view.jsp"/>
</liferay-portlet:renderURL>


<a href="<liferay-portlet:renderURL/>">&laquo; Go Back</a>



 <a href="<%=viewPageURL%>">&laquo; Go Back1</a> 