import org.xml.sax.SAXException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@WebServlet("/queryToFinance")
public class QueryToFinance extends HttpServlet {
    String[] qurensysForYahoo;
    static String xmlForParser;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        qurensysForYahoo = req.getParameterValues("group");
        xmlForParser = "https://query.yahooapis.com/v1/public/yql?q=select+*+from+yahoo.finance.xchange+where+pair+=+" +
                "\"" + qurensysForYahoo[0] + "," + qurensysForYahoo[1] + "\"" + "&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";


        Parser p = null;
        p = new Parser();
        try {
            p.makeAnswer();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        resp.getWriter().println(p.print());

    }
}
