import javax.swing.text.html.HTMLEditorKit;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/*
<html>
<head>
<title>Find a book</title>
</head>
<body>
<a href="http://localhost:8080/MapQuery/index.htm">Home page</a><br>
<h3 style="height: 28px; ">Map query project<br></h3>Enter login and password:
<form action=http://localhost:8080/MapQuery/login method=Post>
<input type=Text name=login> <br>
<input type="password" name=password><br> <input type=Submit value=login><br>
</form>
</body>
</html>
*/

public class HTMLCreator {
	public String body; 

	HTMLCreator(String userData) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Find an address("+userData+")</title>");
		sb.append("</head>");
		sb.append("<h3 style=\"height: 28px; \">Map query project<br></h3><br>");
		sb.append("User: "+userData+"<br>");
		sb.append("Enter query:<br>");
		sb.append("<form action=http://localhost:8080/MapQuery/query method=Post accept-charset=\"UTF-8\">");
		sb.append("<input type=Text name=textQuerySrc> <br>");
		sb.append("<input type=Text name=textQueryDst> <br>");
		sb.append("<input type=Submit value=send><br>");
		sb.append("</form>");
		sb.append("</body>");
		sb.append("</html>");
		body = sb.toString();
	}
	
	
}
