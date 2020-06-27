<%@ include file="/init.jsp" %>


<div class="row">

	<div class="card">
	  <div class="card-header">
	     MVC Command -*MVCActionCommand - *MVCRenderCommand - *MVCResourceCommand
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	       1. Add the portlet taglib </br></br>
	          <code><<span>%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"</span>%> </br></code> </br>
	          
	       2. *MVCActionCommand - Create URL :   portlet:actionURL </br>
			   <code>
				   <<span>portlet:actionURL name="/training/mvcaction/command" var="trainingMVCActionURL" /></span><br/>

			   </code></br>
		  3. *MVCRenderCommand - Create URL :   portlet:renderURL </br>
			   <code>
				  <<span> portlet:renderURL var="trainingMVCRenderURL"</span>> <br/>
    <<span>portlet:param name="mvcRenderCommandName" value="/training/mvcrender/command"</span> /></span><br/>
    <<span>portlet:param name="from" value="Page is redirecting from TrainingMVCRenderCommand" /><br/>
<<span>/portlet:renderURL></span>
				
			   </code></br>
		  4. *MVCResourceURL - Create URL :   portlet:resourceURL </br>
			   <code>
				   <<span>liferay-portlet:renderURL name='/training/mvcresource/command' var='trainingMVCResourceURL'</span>/> </br>
				
			   </code></br>
	     
		  5. MVC Action Class: extend BaseMVC*Action  or implements MVC*Command<br/><br/>
					<code>@Component(</br>
						    immediate = true,</br>
						    property = {</br>
						        "javax.portlet.name="+TrainingPortletKeys.Training,</br>
						        "mvc.command.name=/training/mvcaction/command"</br>
						    },</br>
						    service = MVCActionCommand.class</br>
						)
						public class TrainingMVCActionCommand implements MVCActionCommand {}</br></br>
					</code>
					</br>
					Ref : TrainingMVCActionCommand.java  - TrainingMVCRenderCommand.java - TrainingMVCResourceCommand.java
				</br></br>
				
		</p>
	  
	    </blockquote>
	  </div>
    </div>
  </div> 

<portlet:actionURL name="/training/mvcaction/command" var="trainingMVCActionURL" />


<portlet:renderURL var="trainingMVCRenderURL">
    <portlet:param name="mvcRenderCommandName" value="/training/mvcrender/command" />
    <portlet:param name="from" value="Page is redirecting from TrainingMVCRenderCommand" />
</portlet:renderURL>

 <liferay-portlet:resourceURL id="/training/mvcresource/command" var="trainingMVCResourceURL"  />


 <a href="<%=trainingMVCActionURL%>" > MVC Action  </a>
 
  <a href="<%=trainingMVCRenderURL%>" > MVC Render  </a>

 
  <input type="button" value="MVC Resource" onclick="callResource('<%=trainingMVCResourceURL.toString()%>')">
  


<script type="text/javascript">

function callResource(url) {

	// prepare parameters for the ajax call
	var dataArray = {
				    "<portlet:namespace/>fname":"Gnaniayar",
				    "<portlet:namespace/>lname":"Zubair"				
				  };
			  
	 
 	$.ajax({
			type : "post",
			url : url,
			data: dataArray,
			dataType:"json",
			success : function(data) {
					console.log(data);
			},
			error : function(result) {
				console.log("error occured");
				return false;
			}
		});
}
</script>


