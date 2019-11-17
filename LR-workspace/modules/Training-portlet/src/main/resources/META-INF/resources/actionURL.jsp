<%@ include file="/init.jsp" %>





<div class="row">
 <div class="col-sm-6">
	<div class="card">
	  <div class="card-header">
	    Action URL Example
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	       1. Add the portlet taglib </br></br>
	          <code><<span>%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"</span>%> </br></code> </br>
	          
	       2. Create Portlet Action URL using taglib :   portlet:actionURL </br>
			   <code>
				   <<span>portlet:actionURL var='customProcessActionURL' name="customProcessActionMethod"</span>> </br>
					<<span>portlet:param name='name' value='zubair'</span>/></br>
					<<span>/portlet:actionURL</span>></br>
			   </code></br>
	       3. Call the url from anchor link or button </br>
	            
	            <code> 
	                  <<span>a href="<<span>%=customProcessActionURL %>"</span></span>>Call Custom Process Action<<span>/a</span>></br>

				</code>
				</br>
				<h1> 1. Portlet Action URL with Default ProcessAction Method :  </h1></br>
				 
					<a href="<portlet:actionURL/>">Call Default Process Action </a><br/><br/>

			
				<h1>2. Portlet Action URL with Custom Method  : </h1>  <br/>
				 
					 <portlet:actionURL var="customProcessActionURL" name="customProcessActionMethod">
			  			<portlet:param name="name" value="zubair"/>
					</portlet:actionURL>
			
					<a href="<%=customProcessActionURL%>">Call Custom Process Action</a><br/> <br/>OR <br/><br/>
					<input type="submit" name="submit" onclick="window.location.href='<%=customProcessActionURL%>'" /><br/><br/>
				
				
				<h1>3. Action URL with Form Submit:</h1>  <br/>

	 		
					<form name="trainingFrm2" id="trainingFrm2" method="post">
					
						 Name : <input type="text" name="<portlet:namespace />name"/>
						<input type="submit" name="submit" onclick="callActionMethod();" />
					
					</form>  <br/>
		
			</p>
	  
	    </blockquote>
	  </div>
    </div>
  </div> 
</div>


	<a href='<portlet:renderURL/>'> Go to Home JSP Page</a> 




		
 

<script>
function callActionMethod() {
    document.trainingFrm2.action='<%=customProcessActionURL%>';
    document.trainingFrm2.submit();

}
</script>