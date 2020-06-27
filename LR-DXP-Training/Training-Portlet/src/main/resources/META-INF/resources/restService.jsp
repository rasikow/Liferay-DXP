
<%@ include file="/init.jsp" %>


<% String from = (String) renderRequest.getParameter("from"); %>

From: <code><%=from %> </code>

<h1></h1> <br/>

<div class="row">

	<div class="card">
	  <div class="card-header">
	    Consume Rest Service
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	           
	       1. Create Resource URL :   </br>
			   <code>
				   <<span>liferay-portlet:resourceURL var='restServiceURL'</span>> </br>
					<<span>portlet:param name='service' value='travel'</span>/></br>
					<<span>/liferay-portlet:resourceURL</span>></br>
			   </code></br>
	       3. Call the url from anchor link or button </br>
	            
	            <code> 
	          		 <<span>input type="button" value="Ajax Call" onclick="callRestService('<<span>%=restServiceURL.toString()%>')"><span></br>
				</code>
				</br>
			4. Resource Action Method in controller:<br/><br/>
					<code>@Override <br/><br/>
						  public void serveResource(ResourceRequest resourceRequest,<br/>
							  ResourceResponse resourceResponse){<br/><br/>
							  String firstName = ParamUtil.getString(actionRequest, "service");<br/>
							  }<br/>
					</code>
			5. Invoke REST service:<br/><br/>
			            - Create HttpURLConnection to invoke the url request with headers property<br/>
			            - Read with Sending the REquest <br/>
			            - Send the response back to View<br/><br/>
			          <code><h1>Ref - TrainingServiceConsumer.java </h1></code><br/><br/>
					<code>@Override <br/><br/>
						  public void serveResource(ResourceRequest resourceRequest,<br/>
							  ResourceResponse resourceResponse){<br/><br/>
							  String firstName = ParamUtil.getString(actionRequest, "service");<br/>
							  }<br/>
					</code>
				</br></br>
				
		</p>
	  
	    </blockquote>
	  </div>
    </div>
  </div> 



<!-- Resource URL -->
<liferay-portlet:resourceURL var="restServiceURL" >
 <portlet:param name="service" value="travel"/>
</liferay-portlet:resourceURL>

<!-- Call the Javscript to Invoke the URL -->
<input type="button" value="Ajax Call" onclick="callRestService('<%=restServiceURL.toString()%>')">
  <br/>
 <!-- Response from Service -->
Products:
<table id="travelResponse" border='1' class="table table-striped">
   <!-- Data will be loaded from ajax -->
</table>

<a href="<portlet:renderURL/>"><<< Go Back</a>

<script>

function callRestService(url)
{
	
$.ajax({
                type     : "POST",
                url      : url,
                data : ({   
                	<portlet:namespace/>fname: "Gnaniyar", <portlet:namespace/>lname : "Zubair"
            }),
            dataType: 'json',
          
             success: function( data, textStatus, jQxhr ){
            	 var obj = JSON.parse(JSON.stringify(data.ProductDetailsDescriptionResponse));
             	console.log(obj);
                 var results;
             	for (i in obj.ProductDetailsDescription) {
             		var product = obj.ProductDetailsDescription[i];
             		results += '<tr><td>' + product.productCode + '</td><td>' + product.productDescription + '</td></tr>';
             	}
             	$('#travelResponse').append(results);
             },
             error: function( jqXhr, textStatus, errorThrown ){
                 console.log(errorThrown );
             }
              
        });
}

$.ajaxPrefilter(function( options, original_Options, jqXHR ) {
    options.async = true;
});
</script>
