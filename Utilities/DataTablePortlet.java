package DataTable.portlet.portlet;

import DataTable.portlet.constants.DataTablePortletKeys;
import fms.ticket.service.model.FmsTicketCreation;
import fms.ticket.service.service.FmsTicketCreationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Dell
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=DataTable",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DataTablePortletKeys.DATATABLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DataTablePortlet extends MVCPortlet {
	
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
			String renderCommand = ParamUtil.getString(renderRequest, "renderCommand");

					DynamicQuery dynamicQuery = FmsTicketCreationLocalServiceUtil.dynamicQuery();
					//dynamicQuery.add(RestrictionsFactoryUtil.eq("status", "Pending"));
					List<FmsTicketCreation> allTickets = FmsTicketCreationLocalServiceUtil.dynamicQuery(dynamicQuery);
					renderRequest.setAttribute("allTickets", allTickets);
					super.render(renderRequest, renderResponse);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	
}