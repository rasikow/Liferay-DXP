
<%@ include file="/init.jsp" %>

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




<script>



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
