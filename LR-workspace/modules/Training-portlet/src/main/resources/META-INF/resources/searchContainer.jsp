<%@ include file="/init.jsp" %>



<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>



<%
 List<User> users = UserLocalServiceUtil.getUsers(-1,-1);

%>

<liferay-portlet:renderURL varImpl="iteratorURL">
    <portlet:param name="mvcPath" value="/searchContainer.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container total="<%=users.size()%>" var="searchContainer" delta="1" deltaConfigurable="true" 
  emptyResultsMessage="Oops. There Are No Users To Display, Please add Users" iteratorURL="<%= iteratorURL %>">
  
 <liferay-ui:search-container-results results="<%=ListUtil.subList(users, searchContainer.getStart(),searchContainer.getEnd())%>" />
  <liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" modelVar="user" keyProperty="userId" >
   <liferay-ui:search-container-column-text name="User Id" value="${user.userId}"/>
   <liferay-ui:search-container-column-text name="firstName" value="${user.firstName}" orderable="true"/>
   <liferay-ui:search-container-column-text name="lastName" value="${user.lastName}"/>
   <liferay-ui:search-container-column-text name="Email" value="${user.emailAddress}"/>
  </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>

<a href='<portlet:renderURL/>'><< Go Back</a>