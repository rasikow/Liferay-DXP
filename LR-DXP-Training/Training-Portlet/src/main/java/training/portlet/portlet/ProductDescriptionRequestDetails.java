package training.portlet.portlet;

import com.liferay.portal.kernel.json.JSON;


	public class ProductDescriptionRequestDetails {

		private String productCode;
		private String source;
		private String languageCode;
		private String channelCode;

		@JSON(name = "productCode", include = true)
		public String getProductCode() {
			return productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		@JSON(name = "source", include = true)
		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		@JSON(name = "languageCode", include = true)
		public String getLanguageCode() {
			return languageCode;
		}

		public void setLanguageCode(String languageCode) {
			this.languageCode = languageCode;
		}

		@JSON(name = "channelCode", include = true)
		public String getChannelCode() {
			return channelCode;
		}

		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}
	}

