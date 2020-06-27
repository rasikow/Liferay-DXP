package training.portlet.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.ContentTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TrainingServiceConsumer {

	public static String getResponse() {
		// TODO Auto-generated method stub
		StringBuilder serviceResponse = new StringBuilder();
		
			try {
				
				URL url = new URL("http://172.50.10.105:8888/gateway/TawnTravelAPIREST/TawnTravelAPI.restful.getProductDetailsDescription");
				
				// Connection
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestMethod("POST");
				connection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
				connection.setRequestProperty(HttpHeaders.ACCEPT, ContentTypes.APPLICATION_JSON);
				connection.setRequestProperty("twanapikey","0f3e9f59-3d81-4d8b-be3c-5add90b93a14");

				// Preparing REQUEST object from model
				ProductDescriptionRequestDetails requestParam = new ProductDescriptionRequestDetails();
				requestParam.setLanguageCode("E");
				requestParam.setChannelCode("");
				requestParam.setSource("");
				
				// To send data with Request
				OutputStream outputStream = connection.getOutputStream();
				String request = JSONFactoryUtil.looseSerialize(requestParam);
				outputStream = connection.getOutputStream();
				outputStream.write(request.getBytes());
			
				System.out.println("request>>>>"+request.toString());
				
				// If Connection Fails
				if (connection.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ connection.getResponseCode());
				}
				
				//  REST Service RESPONSE		
				BufferedReader br = new BufferedReader(new InputStreamReader( connection.getInputStream(),"utf-8"));
				String line = null;
				while ((line = br.readLine()) != null) {
					serviceResponse.append(line + "\n");
				}
				System.out.println("Response:>>>>"+serviceResponse.toString());
				br.close();
				outputStream.flush();
				
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("exception:>>>>"+e.getMessage());
					e.printStackTrace();
				}
				
			return serviceResponse.toString();
			
	}

}
