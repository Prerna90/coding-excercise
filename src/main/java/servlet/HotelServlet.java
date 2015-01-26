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

@WebServlet(
        name = "HotelServlet",
        urlPatterns = {"/hotelDeals"}
    )
public class HotelServlet extends HttpServlet {

	
	private final String DEALS_URL = "http://deals.expedia.com/beta/deals/hotels.json";
	private final String USER_AGENT = "Mozilla/5.0";
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        String dealsData = getHotelDeals();
        out.write(dealsData.getBytes());
        out.flush();
        out.close();
    }
    
    private String getHotelDeals() {
    	
    	try {
    		URL obj = new URL(DEALS_URL);
    		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
     
    		//add reuqest header
    		con.setRequestMethod("POST");
    		con.setRequestProperty("User-Agent", USER_AGENT);
    		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
     
    		String urlParameters = "city=Delhi";
     
    		// Send post request
    		con.setDoOutput(true);
    		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    		wr.writeBytes(urlParameters);
    		wr.flush();
    		wr.close();
     
    		int responseCode = con.getResponseCode();
    		System.out.println("\nSending 'POST' request to URL : " + DEALS_URL);
    		System.out.println("Post parameters : " + urlParameters);
    		System.out.println("Response Code : " + responseCode);
     
    		BufferedReader in = new BufferedReader(
    		        new InputStreamReader(con.getInputStream()));
    		String inputLine;
    		StringBuffer response = new StringBuffer();
     
    		while ((inputLine = in.readLine()) != null) {
    			response.append(inputLine);
    		}
    		in.close();
     
    		return response.toString();
    		
    	} catch (Exception e) {
    		
    		return "ERROR";
    	}
		
    }
    
}