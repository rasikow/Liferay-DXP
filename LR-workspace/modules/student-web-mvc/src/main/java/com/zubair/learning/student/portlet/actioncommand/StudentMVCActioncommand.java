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
package com.zubair.learning.student.portlet.actioncommand;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.zubair.learning.student.constants.StudentWebMvcPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
			"javax.portlet.name=" + StudentWebMvcPortletKeys.StudentWebMvc,
			"mvc.command.name=addStudent"
	},
	service = MVCActionCommand.class
)
public class StudentMVCActioncommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		// TODO Auto-generated method stub
		_handleActionCommand(actionRequest,actionResponse);

		return true;
	}

	private void _handleActionCommand(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);

		if (log.isInfoEnabled()) {
			log.info("Hello " + name);
			log.info("[StudentMVCActioncommand]-Inside");
		}

		String greetingMessage = "Hello " + name + "! Welcome to OSGi";

		actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);

		SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);
		actionResponse.setRenderParameter("jspPage", "/success.jsp");
	}
	
	private static final Log log = (Log) LogFactoryUtil.getLog(StudentMVCActioncommand.class.getName());
	
}