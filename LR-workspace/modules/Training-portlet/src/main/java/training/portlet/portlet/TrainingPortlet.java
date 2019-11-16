package training.portlet.portlet;

import training.portlet.constants.TrainingPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.io.Writer;

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
		super.processAction(actionRequest, actionResponse);
	}

	@ProcessAction(name = "processActionMethod")
	public void callProcessActionMethod(ActionRequest actionRequest, ActionResponse actionResponse) {

		String paramValue = ParamUtil.getString(actionRequest, "name");
		if (paramValue != null) {
			System.out.println("#######Value##############" + paramValue);
		}
		System.out.println("#######callProcessActionMethod##############");
	}

	@ProcessAction(name = "submitPersonalInfo")
	public void submitPersonalInfo(ActionRequest actionRequest, ActionResponse actionResponse) {

		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String iqama = ParamUtil.getString(actionRequest, "iqama");

		System.out.println("#######firstName##############" + firstName);
		System.out.println("#######lastName##############" + lastName);
		System.out.println("#######iqama##############" + iqama);

		// Redirect to success
		actionResponse.getRenderParameters().setValue("jspPage", "/success.jsp");
		
		/* actionResponse.setRenderParameter("jspPage", "/success.jsp"); */

	}

	/*
	 * no framework
	 * 
	 * @Override public void serveResource(ResourceRequest resourceRequest,
	 * ResourceResponse resourceResponse) throws IOException, PortletException {
	 * System.out.
	 * println("#######inside servr resource ( no framework )##############");
	 * String firstName = ParamUtil.getString(resourceRequest, "fname"); String
	 * lastName = ParamUtil.getString(resourceRequest, "lname");
	 * 
	 * 
	 * System.out.println("#######fName##############" + firstName);
	 * System.out.println("#######lName##############" + lastName); // TODO
	 * Auto-generated method stub super.serveResource(resourceRequest,
	 * resourceResponse); }
	 */

	/*
	 * alloy
	 * 
	 * @Override public void serveResource(ResourceRequest resourceRequest,
	 * ResourceResponse resourceResponse) throws PortletException, IOException {
	 * System.out.println("#######inside servr resource ( alloy )##############" );
	 * String param = ParamUtil.getString(resourceRequest, "name"); 
	 * Writer wtr =resourceResponse.getWriter(); 
	 * JSONObject jsonObj = JSONFactoryUtil.createJSONObject();  
	 * jsonObj.put("value", param);
	 * wtr.write(jsonObj.toString()); 
	 * wtr.flush();
	 *  }
	 */
	
	
	
	  @Override 
	  public void serveResource(ResourceRequest resourceRequest,
		  ResourceResponse resourceResponse) throws PortletException, IOException {
		  System.out.println("#######inside servr resource ( jquery )##############" );
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