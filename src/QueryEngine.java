/**
 * [code]QueryEngine[/code] base class that starts 
 * google searching due to internal parameters
 * 
 * 
 * 
 * @author jarad
 * @version 0.2
 */

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import jersey.repackaged.com.google.common.io.ByteStreams;

/**
 * Servlet implementation class QueryEngine
 */

@WebServlet("/query")
public class QueryEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryEngine() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		//ByteArrayInputStream
		ServletInputStream sistream = request.getInputStream();
		//Enumeration<String> en = request.getHeaderNames();
		//request.getParameterValues("textQuerySrc")[0]
		
		//		String s = "";
		//s.getBytes(charsetName)
		//String utf8String= new String(cp1251String.getBytes("Cp1251"), "UTF-8");
		//ByteArrayInputStream istream = new ByteArrayInputStream((InputStream)ServletInputStream);
		String textQuerySrc 	= request.getParameter("textQuerySrc");
		String textQueryDst 	= request.getParameter("textQueryDst");
		//String encoding = "";
		
		Cookie[] cc = request.getCookies();
		
		
		
		
		
		//encoding = request.getCharacterEncoding();
		int v;
		InputStream istream = request.getInputStream();
		
		String ur = request.getRequestURI();
		StringBuilder sb = new StringBuilder();
		while (   (v = istream.read()) != -1) {
			
			sb.append(Integer.toHexString(v) + " " + (char)v + "\n");
		}
		
		
		
		
		PrintWriter pw = response.getWriter();
		
		String textQuerySrcEnc   = URLEncoder.encode(textQuerySrc, "UTF-8");
		String textQueryDstEnc   = URLEncoder.encode(textQueryDst, "UTF-8");
		
		
		final String GOOGLE_PATH = "http://maps.googleapis.com/maps/api/directions/json?";
		
		String params = GOOGLE_PATH + "origin="+textQuerySrcEnc+"&destination="+textQueryDstEnc+"&oe=utf-8&language=uk&region=ua"; 
		//&oe=cp1251
		URL url = new URL(params);
		URLConnection conn = url.openConnection();
		InputStream iStream = conn.getInputStream();
		//BufferedReader br = new BufferedReader(new InputStreamReader(iStream,Charset.forName("UTF-8")));
		BufferedReader br = new BufferedReader(new InputStreamReader(iStream,Charset.forName("UTF-8")));
		String s;
		StringBuilder sb1 = new StringBuilder();
		while ((s = br.readLine()) != null) {
			sb1.append(s);
		}
		
		//marshalling Object -> XML/JSON
		//unmarshalling XML/JSON -> Object
		
		
		
		
		JSONObject jObject = new JSONObject(sb1.toString());
		String queryResult = jObject.getString("status");
		//pw.write(queryResult);
		JSONArray routeData = jObject.getJSONArray("routes");
		//c
		JSONObject boundsData = routeData.getJSONObject(0);
		pw.write(boundsData.toString());
		JSONObject legsData = routeData.getJSONObject(1);
		pw.write(legsData.toString());
		
	}

}
