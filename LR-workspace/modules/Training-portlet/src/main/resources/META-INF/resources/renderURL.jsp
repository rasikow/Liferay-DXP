<%@ include file="/init.jsp" %>



<div class="row">
 <div class="col-sm-6">
	<div class="card">
	  <div class="card-header">
	    Render URL Example
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	       1. Add the portlet taglib </br></br>
	          <code><<span>%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"</span>%> </br></code> </br>
	          
	       2. Create Portlet Render URL using taglib :   portlet:renderURL </br>
			   <code>
				   <<span>portlet:renderURL var='renderURL'</span>> </br>
					<<span>portlet:param name='mvcPath' value='/view.jsp'</span>/></br>
					<<span>portlet:param name='name' value='zubair'</span>/></br>
					<<span>/portlet:renderURL</span>></br>
			   </code></br>
	       3. Call the url from anchor link or button </br>
	            
	            <code> 
	          
						 <<span>a href="<<span>%=renderURL %>"</span></span>>Go to Next Page<<span>/a</span>></br>
				</code>
				</br>
				 Click This link to render next page:</br>
				 
				 <portlet:renderURL var="renderURL" >
					 <portlet:param name="mvcPath" value="/view.jsp"/>
					 <portlet:param name="name" value="zubair"/>
					</portlet:renderURL>

				<a href="<%=renderURL %>" > Go to Home JSP Page</a> 
				 
		</p>
	  
	    </blockquote>
	  </div>
    </div>
  </div> 
</div>


