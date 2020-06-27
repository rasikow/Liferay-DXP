package training.portlet.mvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import training.portlet.constants.TrainingPortletKeys;

@Component(
    immediate = true,
    property = {
        "javax.portlet.name="+TrainingPortletKeys.Training,
        "mvc.command.name=/training/mvcresource/command"
    },
    service = MVCResourceCommand.class
)
public class TrainingMVCRourceCommand extends BaseMVCResourceCommand  {

	
	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("Inside the MVC Resource Command>>>>>");
				
		String param1 =ParamUtil.getString(resourceRequest,"fname");
		  String param2 =ParamUtil.getString(resourceRequest,"lname");
		  
		   System.out.println("#######param1 & 2##############" + param1 + " "+param2);
		  

		
	}

	
	}


	



	
	
