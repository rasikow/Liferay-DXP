package training.portlet.portlet;

import training.portlet.constants.TrainingPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
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
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Training",
		"com.liferay.portlet.instanceable=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + TrainingPortletKeys.TRAINING,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)

public class TrainingPortlet extends MVCPortlet {

	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
					
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

		System.out.println("#######firstName##############" + firstName);
		System.out.println("#######lastName##############" + lastName);
		System.out.println("#######iqama##############" + iqama);

		List<String> list = new ArrayList<String>();
		list.add(firstName);
		list.add(lastName);
		list.add(iqama);
		
		actionRequest.setAttribute("list",list);
	
		// Redirect to success
		actionResponse.getRenderParameters().setValue("mvcPath", "/success.jsp");
		
		/* actionResponse.setRenderParameter("jspPage", "/success.jsp"); */

	}


	
	
	  @Override 
	  public void serveResource(ResourceRequest resourceRequest,
		  ResourceResponse resourceResponse) throws PortletException, IOException {
		  System.out.println("#######inside serve resource ##############" );
		    String param1 =ParamUtil.getString(resourceRequest,"fname");
		  String param2 =ParamUtil.getString(resourceRequest,"lname");
		  
		  System.out.println("#######param1##############" + param1);
		  
		  System.out.println("#######param2##############" + param2);
		 
		
		  
		// Creating a JSON object .
		  JSONObject jsonObj = JSONFactoryUtil.createJSONObject(); 
		  jsonObj.put("fname", param1);
		  jsonObj.put("lname", param2);
		  System.out.println("#######jsonObj.toString()##############" +jsonObj.toString() );
		  
		// Writing the result in resourceResponse writer.
		  Writer wtr = resourceResponse.getWriter(); 
		  wtr.write(jsonObj.toString()); 
		  wtr.flush(); 
		 }
	 
}