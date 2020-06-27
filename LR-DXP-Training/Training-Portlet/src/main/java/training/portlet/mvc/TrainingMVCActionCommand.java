package training.portlet.mvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import training.portlet.constants.TrainingPortletKeys;

@Component(
    immediate = true,
    property = {
        "javax.portlet.name="+TrainingPortletKeys.Training,
        "mvc.command.name=/training/mvcaction/command"
    },
    service = MVCActionCommand.class
)
public class TrainingMVCActionCommand extends BaseMVCActionCommand {


	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				_handleActionCommand(actionRequest);
				
		
				actionResponse.getRenderParameters().setValue("from", "Page is redirecting from TrainingMVCActionCommand ");
		actionResponse.getRenderParameters().setValue("mvcPath", "/success.jsp");
	}
	

	private void _handleActionCommand(ActionRequest actionRequest) {
		
		System.out.print("Inside the MVC Action Command>>>>>");
		
		
	}
}