
<%@ include file="/init.jsp" %>

<h1></h1> <br/>

<div class="row">

	<div class="card">
	  <div class="card-header">
	     Resource URLs
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	       1. Add the portlet taglib </br></br>
	          <code><<span>%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"</span>%> </br></code> </br>
	          
	       2. Create Portlet Render URL using taglib :   portlet:resourceURL </br>
			   <code>
				   <<span>liferay-portlet:resourceURL var='resourceURL'</span>> </br>
					<<span>portlet:param name='name' value='zubair'</span>/></br>
					<<span>/liferay-portlet:resourceURL</span>></br>
			   </code></br>
	       3. Call the url from anchor link or button </br>
	            
	            <code> 
	          		 <<span>input type="button" value="Ajax Call" onclick="callServeResource('<<span>%=resourceURL.toString()%>')"><span></br>
				</code>
				</br>
			4. Resource Action Method in controller:<br/><br/>
					<code>@Override <br/><br/>
						  public void serveResource(ResourceRequest resourceRequest,<br/>
							  ResourceResponse resourceResponse){}<br/><br/>
					</code>
				</br></br>
				
		</p>
	  
	    </blockquote>
	  </div>
    </div>
  </div> 


<h1> Resource URL No Framework :</h1>
<portlet:resourceURL var="resourceURL"/>
<input type="button" value="Ajax Call" onclick="callServeResource('<%=resourceURL.toString()%>')">
<span id="resultData"></span></h4>
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


<a href="<portlet:renderURL/>"><<< Go Back</a>

<script>



function callServeResource(url) {
    url = url + "&<portlet:namespace/>fname=Gnaniyar&<portlet:namespace/>lname=Zubair";
    var xmlhttp=new XMLHttpRequest();
    
    xmlhttp.onreadystatechange=function()
    {
    if (xmlhttp.readyState==4 && xmlhttp.status==200)
      {
      // Code goes here
         var result = JSON.parse(xmlhttp.responseText);
       document.getElementById('resultData').innerHTML=result.fname+""+result.lname;
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
 data: { <portlet:namespace/>fname: 'Gnaniyar', <portlet:namespace/>lname:'Zubair' },
 on: {
   success: function() {
	   var data=this.get('responseData');
     document.getElementById('resHolder').innerHTML=data.fname+""+data.lname;
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
