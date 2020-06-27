<%@ include file="/init.jsp" %>


<h1>Portlet Implicit Objects: </h1> <br/><br/>

<code><<span>%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %></span><br/>
<<span>portlet:defineObjects /</span>>
</code><br/><br/>

<code>
 actionRequest                 (javax.portlet.ActionRequest)<br/>
actionResponse                (javax.portlet.ActionResponse)<br/>
eventRequest                  (javax.portlet.EventRequest)<br/>
eventResponse,                (javax.portlet.EventResponse)<br/>
portletConfig,                (javax.portlet.PortletConfig)<br/>
portletName,                  (java.lang.String portletName)<br/>
portletPreferences,           (javax.portlet.PortletPreferences)<br/>
portletPreferencesValues,     (java.util.Map)<br/>
portletSession,               (javax.portlet.PortletSession)<br/>
portletSessionScope,          (java.util.Map)<br/>
renderRequest,                (javax.portlet.RenderRequest)<br/>
renderResponse,               (javax.portlet.RenderResponse)<br/>
resourceRequest,              (javax.portlet.ResourceRequest)<br/>
resourceResponse              (javax.portlet.ResourceResponse)<br/>
</code><br/>

Portlet Name <<span>%=portletName%></span> : <code><%=portletName%></code><br/><br/>

<h1>Liferay Theme Implicit Objects: </h1> <br/><br/>


<code><<span>%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %></span><br/>
<<span>liferay-theme:defineObjects /></span><br/><br/>
</code><br/>
<code>
themeDisplay             (com.liferay.portal.theme.ThemeDisplay)<br/>
company                  (com.liferay.portal.model.Company)<br/>
account                  (com.liferay.portal.model.Account)<br/>
user                     (com.liferay.portal.model.User)<br/>
realUser                 (com.liferay.portal.model.User)<br/>
contact                  (com.liferay.portal.model.Contact)<br/>
layout                   (com.liferay.portal.model.Layout)<br/>
layouts                  (java.util.List)<br/>
plid                     (java.lang.Long)<br/>
layoutTypePortlet        (com.liferay.portal.model.LayoutTypePortlet)<br/>
scopeGroupId             (java.lang.Long)<br/>
permissionChecker        (com.liferay.portal.security.permission.PermissionChecker)<br/>
locale                   (java.util.Locale)<br/>
timeZone                 (java.util.TimeZone)<br/>
theme                    (com.liferay.portal.model.Theme)<br/>
colorScheme              (com.liferay.portal.model.ColorScheme)<br/>
portletDisplay           (com.liferay.portal.theme.PortletDisplay)<br/>
portletGroupId           (java.lang.Long)<br/>
</code><br/><br/>

User Name - <<span>%=user.getScreenName() %></span> : <code><%=user.getScreenName() %></code><br/>
Locale - <<span>%=locale %> </span>: <code><%=locale %></code><br/>
Page Name - <<span>%=layout.getName() %> </span>:  <code><%=layout.getName() %></code><br/><br/>

<h1> Get All portal users : "UserLocalServiceUtil" </h1><br/><br/>

<code>
<<span>% List<</span>User> usersList = UserLocalServiceUtil.getUsers(0,UserLocalServiceUtil.getUsersCount());<br/>
for(User user1 : usersList) {<br/>
System.out.println("Name:" + user1.getFullName());<br/>
}<br/>
%><br/>
</code><br/><br/>

<h1>Liferay ThemeDisplay </h1><br/>

The ThemeDisplay object has methods for retrieving commonly used file paths. Below are a few of the methods: <br/><br/>

REF:<code>https://portal.liferay.dev/docs/7-0/tutorials/-/knowledge_base/t/liferay-themedisplay </code><br/><br/>

themeDisplay.getUserId() : <code><%=themeDisplay.getUserId() %></code><br/>
themeDisplay.getLanguageId() : <code><%=themeDisplay.getLanguageId() %></code><br/>
themeDisplay.isSignedIn() : <code><%=themeDisplay.isSignedIn() %></code><br/>

themeDisplay.getPathImage() : <code><%=themeDisplay.getPathImage() %></code><br/>
themeDisplay.getPathJavaScript()  : <code><%=themeDisplay.getPathJavaScript() %></code><br/>
themeDisplay.getPathMain() : <code><%=themeDisplay.getPathMain() %></code><br/>
themeDisplay.getPathThemeImages() : <code><%=themeDisplay.getPathThemeImages() %></code><br/>
themeDisplay.getPathThemeRoot() : <code><%=themeDisplay.getPathThemeRoot() %></code><br/>
themeDisplay.getURLCurrent() : <code><%=themeDisplay.getURLCurrent() %></code><br/>
themeDisplay.getURLHome() : <code><%=themeDisplay.getURLHome() %></code><br/>
themeDisplay.getURLPortal() :<code><%=themeDisplay.getURLPortal() %></code><br/><br/>

ThemeDisplay from controller:<code>ThemeDisplay themeDisplay = (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);</code><br/><br/>

<h1>Liferay ServiceContext </h1><br/>

The ServiceContext class holds contextual information for a service. <br/>
</span><br/>

REF :<code>https://portal.liferay.dev/docs/7-2/frameworks/-/knowledge_base/f/understanding-servicecontext </code><br/><br/>


<h1>SOAP </h1><br/>

For your secure services (i.e., serevices requiring authentication) use <code>http://[host]:[port]/api/secure/axis.</code> <br/>

For your sevices that don't require authentication, use <code>http://[host]:[port]/api/axis.</code><br/><br/>


<h1>REST </h1><br/><br/>

<code>http://localhost:8080/api/jsonws</code><br/>

To list registered services on a plugin (e.g. a custom portlet), don't forget to use its context path in your URL:<br/>

<code>http://localhost:8080/[plugin-context]/api/jsonws</code><br/> <br/>


	
	 <h1>Portlet Session :</h1>
	
	SET:<br>
	
	PortletSession pSession = renderRequest.getPortletSession();<br>
	pSession.setAttribute("productId","Sanad123",PortletSession.APPLICATION_SCOPE);<br>
	
	GET: <br>
	
		PortletSession pSession = actionRequest.getPortletSession();<br>
		String sessionValue = (String) pSession.getAttribute("productId",PortletSession.APPLICATION_SCOPE);<br>
		System.out.println("#######pSession##############" + sessionValue);<br>
