<%@ include file="/init.jsp" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>

<p>
	<b><liferay-ui:message key="training.caption"/></b>
</p>


<h1>Liferay URLs:</h1>  <br/>
 ###############<br/>
<h1>1. Action URL : </h1>  <br/>

		<a href="<portlet:actionURL/>">Call Process Action 2</a><br/>

###############<br/>

<h1>2. Action URL with attributes: </h1>  <br/>

		<portlet:actionURL var="submitURL1" name="callProcessActionMethod">
		</portlet:actionURL>
		
		<a href="<%=submitURL1%>">Click</a>
		<input type="submit" name="submit" onclick="window.location.href='<%=submitURL1%>'" /><br/>

###############<br/>

<h1>3. Action URL with Parameter: </h1>  <br/>

		<portlet:actionURL var="submitURL2" name="callProcessActionMethod">
			<portlet:param name="name" value="zubair"/>
		</portlet:actionURL>
		
		<a href="<%=submitURL2%>">Click</a>
		<input type="submit" name="submit" onclick="window.location.href='<%=submitURL2%>'" /> <br/>
		
 ###############<br/>
 
<h1>4. Action URL with Form Submit:</h1>  <br/>

	  <h2>a. Submit Form Action:</h2>  <br/>

		<form name="trainingFrm1" id="trainingFrm1" method="post" action="<%=submitURL2%>">
		
			<input type="submit" name="submit" />
		
		</form>  <br/>

		<h2>b. Submit Through javascript:</h2>  <br/>
		
		<form name="trainingFrm2" id="trainingFrm2" method="post">
		
			<input type="submit" name="submit" onclick="callActionMethod();" />
		
		</form>  <br/>
###############<br/>		
   <h1>5. Comple Form with Input Fields :</h1> <br/>
   
   		<portlet:actionURL var="personalInfoURL" name="submitPersonalInfo">
		</portlet:actionURL>
		<!-- <liferay-portlet:actionURL  var="personalInfoURL1" name="submitPersonalInfo">
		</liferay-portlet:actionURL> -->
		
   <form name="completeFrm" method="post">
	    First Name : <input type="text" name="<portlet:namespace />firstName"/>
	    <br/>
	    Last Name : <input type="text" name="<portlet:namespace />lastName"/>
	    <br/>
	    Iqama No : <input type="text" name="<portlet:namespace />iqama"/>
	    <br/>
	    <input type="button" value="Submit Form" onclick="submitCompleteFrm()">
	</form>

 <br/>
 ###############<br/>
<h1>6. Render URL</h1>

<portlet:renderURL var="renderURL" >
 <portlet:param name="mvcPath" value="/success.jsp"/>
 <portlet:param name="name" value="zubair"/>
</portlet:renderURL>

<a href="<%=renderURL %>" > Go to Next Page</a> 
 <br/>
 
<h1>Resource URL No Framework :</h1> <br/>

<portlet:resourceURL var="resourceURL"/>
<input type="button" value="Ajax Call" onclick="callServeResource('<%=resourceURL.toString()%>')">

<br/>
 ###############
<br/>
<h1>Resource URL Alloy AJAX :</h1> <br/>

<liferay-portlet:resourceURL var="resourceURL" >
 <portlet:param name="name" value="zubair"/>
</liferay-portlet:resourceURL>

<input type="button" value="Ajax Call" onclick="callServeResource1('<%=resourceURL.toString()%>')">
  <br/>
<h4>Serve resource response will be printed here: 
 <br/>
<span id="resHolder"></span></h4>


<h1>Resource URL jQuery AJAX :</h1> <br/>

<liferay-portlet:resourceURL var="resourceURL" >
 <portlet:param name="name" value="zubair"/>
</liferay-portlet:resourceURL>

<input type="button" value="Ajax Call" onclick="callServeResourceJQuery('<%=resourceURL.toString()%>')">
  <br/>
<h4>Serve resource response will be printed here: 
 <br/>
<span id="resHolder1"></span></h4>

<h1>Search Conteiner  :</h1> <br/>

<liferay-portlet:renderURL var="searchContainerURL" >
 <portlet:param name="mvcPath" value="/searchContainer.jsp"/>
 </liferay-portlet:renderURL>

<a href="<%=searchContainerURL%>">Go To Search Container page</a>
  <br/>


<script>
function callActionMethod() {
    document.trainingFrm2.action='<%=submitURL2%>';
    document.trainingFrm2.submit();

}

function submitCompleteFrm() {
    document.completeFrm.action='<%=personalInfoURL%>';
    document.completeFrm.submit();

}

function callServeResource(url) {
    url = url + "&<portlet:namespace/>fname=Gnaniyar&<portlet:namespace/>lname=Zubair";
    var xmlhttp=new XMLHttpRequest();
    
    xmlhttp.onreadystatechange=function()
    {
    if (xmlhttp.readyState==4 && xmlhttp.status==200)
      {
      // Code goes here
      //xmlhttp.responseText
      }
    }
    
    xmlhttp.open("GET",url,true);
    xmlhttp.send();
     
}

function callServeResource1(url)
{
	
AUI().use('aui-io-request', function(A){
 A.io.request(url, {
 dataType: 'json',
 on: {
   success: function() {
     var data = this.get('responseData');
     document.getElementById('resHolder').innerHTML=data.value;
   },
   failure: function(){alert('Error');}
 }
 })
}); 
}


function callServeResourceJQuery(url)
{
	
jQuery.ajax({
                type     : "POST",
                url      : url,
                data : ({   
                	<portlet:namespace/>fname: "Gnaniyar", <portlet:namespace/>lname : "Zubair"
            }),
            dataType: 'json',
            success:function(data)
            {      
            	
                 document.getElementById('resHolder1').innerHTML=data.fname+""+data.lname;
             },
                async : false,
                });
}

</script>



<%-- COMMENTED 
<h1>1. Action URL Through Java</h1>

<%
    PortletURL actionURL1 = renderResponse.createActionURL();
    actionURL1.setParameter("javax.portlet.action", "callProcessActionMethod");
    actionURL1.setWindowState(LiferayWindowState.MAXIMIZED);
%>
 
<a href="<%=actionURL1%>">Call Process Action</a>

<%
 ThemeDisplay td = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
 PortletURL actionURL = PortletURLFactoryUtil.create(request, td.getPortletDisplay().getId(), td.getPlid(), PortletRequest.ACTION_PHASE);
 actionURL.setParameter("actionParam", "paramVal");
 actionURL.setParameter("javax.portlet.action", "myAction");
 actionURL.setWindowState(LiferayWindowState.NORMAL);
%>

 --%>