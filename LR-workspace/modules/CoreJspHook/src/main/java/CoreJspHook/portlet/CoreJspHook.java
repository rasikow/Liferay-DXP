package CoreJspHook.portlet;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.deploy.hot.CustomJspBag;
import com.liferay.portal.kernel.url.URLContainer;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * @author rasik
 */
@Component(
		immediate = true,
		property = {
			"context.id=CoreJspHook",
			"context.name=CoreJspHook",
			"service.ranking:Integer=100"
		}
	)
public class CoreJspHook implements CustomJspBag {

	@Override
	public String getCustomJspDir() {
		// TODO Auto-generated method stub
		return "META-INF/jsps/";
	}

	@Override
	public List<String> getCustomJsps() {
		// TODO Auto-generated method stub
		return _customJsps;
	}

	@Override
	public URLContainer getURLContainer() {
		// TODO Auto-generated method stub
		return _urlContainer;
	}

	@Override
	public boolean isCustomJspGlobal() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundle = bundleContext.getBundle();

		_customJsps = new ArrayList<>();

		Enumeration<URL> entries = _bundle.findEntries(
			getCustomJspDir(), "*.jsp", true);

		while (entries.hasMoreElements()) {
			URL url = entries.nextElement();

			_customJsps.add(url.getPath());
		}
	}
	
	private final URLContainer _urlContainer = new URLContainer() {

		@Override
		public URL getResource(String name) {
			return _bundle.getEntry(name);
		}

		@Override
		public Set<String> getResources(String path) {
			Set<String> paths = new HashSet<>();

			for (String entry : _customJsps) {
				if (entry.startsWith(path)) {
					paths.add(entry);
				}
			}

			return paths;
		}

	};
	
	private Bundle _bundle;
	private List<String> _customJsps;
}