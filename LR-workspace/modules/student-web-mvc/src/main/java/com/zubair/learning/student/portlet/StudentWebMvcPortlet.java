package com.zubair.learning.student.portlet;

import com.zubair.learning.student.constants.StudentWebMvcPortletKeys;

import java.io.IOException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author rasik
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.DXP",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentWebMvcPortletKeys.StudentWebMvc,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentWebMvcPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		
		log.info("[doView-StudentWebMVC]-Inside the Student Web MVC Portlet default Render (doView) Method");
		
				
		super.doView(renderRequest, renderResponse);
		
		log.info("[doView-StudentWebMVC]- EXIT Render");
	}
	
	
	/**
	 * This is default process  Action. if you want to use multiple process action then go for MVCActionCommand Class
	 */
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		/*log.info("[processAction-StudentWebMVC]-Inside the processAction Web MVC Portlet");
		
		log.info("Name:" + actionRequest.getParameter("name"));
		
		
		actionResponse.setRenderParameter("jspPage", "/success.jsp");
		log.info("[processAction-StudentWebMVC]-EXIT process action");*/
		
		// TODO Auto-generated method stub
				super.processAction(actionRequest, actionResponse);
	}
	
	private static final Log log = (Log) LogFactoryUtil.getLog(StudentWebMvcPortlet.class.getName());
}