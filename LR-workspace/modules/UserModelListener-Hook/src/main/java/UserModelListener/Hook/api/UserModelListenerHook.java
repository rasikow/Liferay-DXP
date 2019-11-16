package UserModelListener.Hook.api;

import java.util.stream.BaseStream;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

/**
 * @author KowbathullahG
 */

@Component(immediate=true,service=ModelListener.class)
public class UserModelListenerHook extends BaseModelListener<User> {
	
	@Override
	public void onAfterCreate(User user) throws ModelListenerException {
		// TODO Auto-generated method stub
		
		try {
			User userObject = UserLocalServiceUtil.getUser(user.getUserId());
			System.out.println("User Created Succesfully >>>>>>>>>>>>>>>>>>>>>>>>>:Welcome Mr."+userObject.getFirstName());
			System.out.println("UYour Email id is ."+userObject.getEmailAddress());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.onAfterCreate(user);
		
	}
	
}