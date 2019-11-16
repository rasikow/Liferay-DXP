/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.user.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import org.osgi.service.component.annotations.Component;

@Component(service = ServiceWrapper.class)

public class UserRegistrationServiceHook extends UserLocalServiceWrapper {

	public UserRegistrationServiceHook() {
		
		super(null);
		
		System.out.println("inside completing user registration constructor>>>>>>>>>>>>>>>");
	}
	
		
	@Override
	public void completeUserRegistration(User user, ServiceContext serviceContext) throws PortalException {
		// TODO Auto-generated method stub
		System.out.println("inside completeUserRegistration>>>>>>>>>>>>>>>");
		
		System.out.println("ScreenName>>>>>>>>>>>>>>>" + user.getScreenName());
		System.out.println("Password>>>>>>>>>>>>>>>" + user.getPassword());
		
		
		super.completeUserRegistration(user, serviceContext);
	}

}