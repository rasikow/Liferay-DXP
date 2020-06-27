<%@ include file="/init.jsp" %>

<% List<String> list = (List<String>)request.getAttribute("list"); %>

<% String from = (String) renderRequest.getParameter("from"); %>


<liferay-ui:success key="entryAdded" message="entry-added" />


From: <code><%=from %> </code>
<h1>Form Submitted Successfully </h1>

<table class="table table-striped">
        <thead>
	        <tr>
	            <th scope="col">First Name</th>
	            <th scope="col">Last Name</th>
	            <th scope="col">Iqama</th>
	        </tr>
        </thead>
        <tr>
		<c:forEach items="${list}" var="list">
		      
		        <td><c:out value="${list}" /></td>
		   
		</c:forEach>
		</tr>
</table>

<a href="<portlet:renderURL/>"><<< Go Back</a>



   
  