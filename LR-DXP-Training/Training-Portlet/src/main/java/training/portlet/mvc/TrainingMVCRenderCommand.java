package training.portlet.mvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import training.portlet.constants.TrainingPortletKeys;

@Component(
    immediate = true,
    property = {
        "javax.portlet.name="+TrainingPortletKeys.Training,
        "mvc.command.name=/training/mvcrender/command"
    },
    service = MVCRenderCommand.class
)
public class TrainingMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		System.out.print("Inside the MVC Render Command>>>>>");
		
		return "/formSubmit.jsp";
	}

	
	
	
}