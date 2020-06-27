<%@ include file="/init.jsp" %>

<h1>Search Container  :</h1> <br/>

<%
 List<User> users = UserLocalServiceUtil.getUsers(-1,-1);

%>

<div class="row">

	<div class="card">
	  <div class="card-header">
	    Search Container
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0">
	      <p>
	       1. Add the liferay-portlet taglib </br></br>
	          <code><<span>%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"</span>%> </br></code> </br>
	          
	       2. Prepare the List object  <br/><br/>
			   <code>
				   <<span>%</span>List<User> users = UserLocalServiceUtil.getUsers(-1,-1);<span>%</span>><br/>

					
			   </code></br>
	       3. Iterator URL for Search Container:</br><br/>
	            <code> 		<<span>liferay-portlet:renderURL varImpl="iteratorURL"</span>><br/>
    						<<span>portlet:param name="mvcPath" value="/searchContainer.jsp" /</span>><br/>
						<<span>/liferay-portlet:renderURL</span>><br/>
				</code>
	          </br></br>
		   4.  Search Container COde:<br/><br/>
				<code>
					<<span>liferay-ui:search-container total="<<span>%=users.size()%>" var="searchContainer" delta="1" deltaConfigurable="true" </span><br/>
 					 emptyResultsMessage="Oops. There Are No Users To Display, Please add Users" iteratorURL="<<span>%= iteratorURL %>"></span><br/>
  
					 <<span>liferay-ui:search-container-results results="<<span>%=ListUtil.subList(users, searchContainer.getStart(),searchContainer.getEnd())%>" /></span><br/>
					  <<span>liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" modelVar="user" keyProperty="userId" ></span><br/>
					   <<span>liferay-ui:search-container-column-text name="User Id" value="$<span>{user.userId}</span>"/></span><br/>
					   <<span>liferay-ui:search-container-column-text name="firstName" value="$<span>{user.firstName}</span>" orderable="true"/></span><br/>
					   <<span>liferay-ui:search-container-column-text name="lastName" value="$<span>{user.lastName}</span>"/></span><br/>
					   <<span>liferay-ui:search-container-column-text name="Email" value="$<span>{user.emailAddress}</span>"/></span><br/>
					  <<span>/liferay-ui:search-container-row><span><br/>
					 <<span>liferay-ui:search-iterator /<span>><br/>
				
				</code>
				</br>
				
	    </blockquote>
	  </div>
    </div>
  </div> 


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

