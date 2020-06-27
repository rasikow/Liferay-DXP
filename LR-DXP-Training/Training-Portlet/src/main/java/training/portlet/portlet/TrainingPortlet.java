package training.portlet.portlet;

import training.portlet.constants.TrainingPortletKeys;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.annotations.ServeResourceMethod;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author gk2053520
 */
@Component(immediate = true, 
		property = { "com.liferay.portlet.display-category=Training",
		"com.liferay.portlet.instanceable=true", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", 
		"javax.portlet.name=" + TrainingPortletKeys.Training,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)

public class TrainingPortlet extends MVCPortlet {

	
	// Render Method
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		System.out.println("#######Render action ##############");		
		
		PortletSession pSession = renderRequest.getPortletSession();
		pSession.setAttribute("productId","Sanad123",PortletSession.APPLICATION_SCOPE);
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	// Deault process action
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("#######process action default##############");
		actionResponse.getRenderParameters().setValue("mvcPath", "/view.jsp");
		super.processAction(actionRequest, actionResponse);
	}

	@ProcessAction(name = "customProcessActionMethod")
	public void customProcessActionMethod(ActionRequest actionRequest, ActionResponse actionResponse) {

		String paramValue = ParamUtil.getString(actionRequest, "name");
		
		System.out.println("#######Value##############" + paramValue);
		
		System.out.println("#######callProcessActionMethod##############");
	}

	@ProcessAction(name = "submitPersonalInfoMethod")
	public void submitPersonalInfoMethod(ActionRequest actionRequest, ActionResponse actionResponse) {

		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String iqama = ParamUtil.getString(actionRequest, "iqama");

		
		PortletSession pSession = actionRequest.getPortletSession();
		String sessionValue = (String) pSession.getAttribute("productId",PortletSession.APPLICATION_SCOPE);
		System.out.println("#######pSession##############" + sessionValue);
		
		System.out.println("#######firstName##############" + firstName);
		System.out.println("#######lastName##############" + lastName);
		System.out.println("#######iqama##############" + iqama);

		List<String> list = new ArrayList<String>();
		list.add(firstName);
		list.add(lastName);
		list.add(iqama);
		
		actionRequest.setAttribute("list",list);
	
		SessionMessages.add(actionRequest, "entryAdded");
		// Redirect to success
		actionResponse.getRenderParameters().setValue("mvcPath", "/success.jsp");
		
		/* actionResponse.setRenderParameter("jspPage", "/success.jsp"); */

	}


	
	@Override
	  public void serveResource(ResourceRequest resourceRequest,
		  ResourceResponse resourceResponse) throws PortletException, IOException {
		 
		System.out.println("#######inside serve resource ##############" );
		
		// Writing the result in resourceResponse writer.
		 Writer wtr = resourceResponse.getWriter(); 
		 
		  // Rest Service
		  String service = ParamUtil.getString(resourceRequest, "service");
		  if(service.equals("travel")) {
			  System.out.println("#######Inside the Travel Service Call##############");
			
			
			  String serviceResponse = TrainingServiceConsumer.getResponse();
			  
				try {
						JSONObject jsnobject1 = JSONFactoryUtil.createJSONObject(serviceResponse);
					
					    System.out.println("#######explrObject##############" + jsnobject1.toString());
						
						  wtr.write(jsnobject1.toString()); 
						  wtr.flush(); 
				} catch (JSONException e) {
					 System.out.println("#######Iexception##############" + e.getMessage());
						// TODO Auto-generated catch block
						e.printStackTrace();
				} catch(Exception e) {
					 System.out.println("#######Iexception1111##############" + e.getMessage());
				}
		  } else {

			  String param1 =ParamUtil.getString(resourceRequest,"fname");
				
			  String param2 =ParamUtil.getString(resourceRequest,"lname");
				  
				  System.out.println("#######param1##############" + param1);
				  System.out.println("#######param2##############" + param2);
				  
				// Creating a JSON object .
				  JSONObject jsonObj = JSONFactoryUtil.createJSONObject(); 
				  jsonObj.put("fname", param1);
				  jsonObj.put("lname", param2);
				  System.out.println("#######jsonObj.toString()##############" +jsonObj.toString() );
				  
				  wtr.write(jsonObj.toString()); 
				  wtr.flush(); 
				
		  }
		 }
	 
	  
	 /* public String getParam(RenderRequest renderRequest, String param) {
			HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
		    HttpServletRequest request = PortalUtil.getOriginalServletRequest(httpRequest);
		   
		    
		    return request.getParameter(param);
		    
		}*/
	  
	 
}
	
	
		


