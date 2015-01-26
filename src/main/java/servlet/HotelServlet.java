package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Web Servlet to handle the hotelDeals request
 * 
 */
@WebServlet(name = "HotelServlet", urlPatterns = { "/hotelDeals" })
public class HotelServlet extends HttpServlet {

	private final String DEALS_URL = "http://deals.expedia.com/beta/deals/hotels.json";
	private final String USER_AGENT = "Mozilla/5.0";

	/**
	 * Get the deals data and pass it to front end
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		String dealsData = getHotelDeals();
		out.write(dealsData.getBytes());
		out.flush();
		out.close();
	}

	/**
	 * Calls json api to get the deals data. Converts it into string and returns
	 */
	private String getHotelDeals() {

		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost(DEALS_URL);
			request.addHeader("content-type", "application/json");
			HttpResponse result = httpClient.execute(request);
			String json = EntityUtils.toString(result.getEntity(), "UTF-8");
			return json;
		} catch (Exception e) {
			return "ERROR";
		}

	}

}