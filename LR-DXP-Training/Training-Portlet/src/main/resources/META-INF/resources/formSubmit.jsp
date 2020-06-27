<%@ include file="/init.jsp" %>


<% String from = (String) renderRequest.getParameter("from"); %> <br/>

From: <code><%=from %> </code><br/>

Welcome to Form Submit page

<!--  Go Back to default render -->
<a href="<portlet:renderURL/>"><<< Go Back</a>

<!-- Declare Portlet Action url --> 

<portlet:actionURL var="submitPersonalInfoURL" name="submitPersonalInfoMethod">
 </portlet:actionURL>


 <form name="personalInfoFrm" method="post">
	First Name : <input type="text" name="<portlet:namespace />firstName"/>
	Last Name : <input type="text" name="<portlet:namespace />lastName"/>
	Iqama No : <input type="text" name="<portlet:namespace />iqama"/>
	<input type="button" value="Submit Form" onclick="submitPersonalInfoJS()">
</form>
 
 <script>
 function submitPersonalInfoJS() {
	    document.personalInfoFrm.action='<%=submitPersonalInfoURL%>';
	    document.personalInfoFrm.submit();

	}
 
 </script>