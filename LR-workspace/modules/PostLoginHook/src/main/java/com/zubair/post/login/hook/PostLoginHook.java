package com.zubair.post.login.hook;


import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Team;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.TeamLocalServiceUtil;
import com.liferay.portal.kernel.service.persistence.GroupUtil;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

/**
 * @author rasik
 */
@Component(
		immediate = true, property = "key=login.events.post",
		service = LifecycleAction.class
	)
public class PostLoginHook implements LifecycleAction  {
	
	private final static String DEFAULT_SITE = "/web/library/test";

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		// TODO Auto-generated method stub
	
		System.out.println("inside the post login hook >>>>");
		
		System.out.println("user id >>>>"+PortalUtil.getUserId(lifecycleEvent.getRequest()));
		
		long userId = PortalUtil.getUserId(lifecycleEvent.getRequest());
		String groupPath = StringPool.BLANK;
		
		try {
			List<Group> userSiteList = GroupLocalServiceUtil.getUserSitesGroups(userId);
		
			if(userSiteList == null) {
				groupPath = DEFAULT_SITE;
			} else {
			
				for(Group group :userSiteList) {
					groupPath = "/web"+group.getFriendlyURL();
					System.out.println("Site Name >>>>" + group.getName());
					System.out.println("Site Url >>>>" + groupPath);
					if (groupPath != StringPool.BLANK)
							break;
				}
			}
			System.out.println("Redirection path >>>>" + groupPath);
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lifecycleEvent.getRequest().getSession().setAttribute(WebKeys.LAST_PATH, new LastPath("", groupPath));
	}
	
	
}