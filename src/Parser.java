import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Parser {

    ArrayList<Rates> dataFromYahoo = new ArrayList<>();



    public void makeAnswer() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(QueryToFinance.xmlForParser);


        Element query = doc.getDocumentElement();
        NodeList nodeList = query.getElementsByTagName("rate");
        int length = nodeList.getLength();


        for (int i = 0; i < length; i++) {
            Rates currency = new Rates();

            Element name = (Element) query.getElementsByTagName("Name").item(i);
            Element rate = (Element) query.getElementsByTagName("Rate").item(i);
            Element date = (Element) query.getElementsByTagName("Date").item(i);
            Element time = (Element) query.getElementsByTagName("Time").item(i);
            Element ask = (Element) query.getElementsByTagName("Ask").item(i);
            Element bid = (Element) query.getElementsByTagName("Bid").item(i);
            currency.setName(name.getTextContent());
            currency.setRate(rate.getTextContent());
            currency.setDate(date.getTextContent());
            currency.setTime(time.getTextContent());
            currency.setAsk(ask.getTextContent());
            currency.setBid(bid.getTextContent());

            dataFromYahoo.add(currency);
        }
    }

    public String print(){
        Iterator iter=dataFromYahoo.iterator();
        String response = "";
        if(iter.hasNext()){
            response = response + dataFromYahoo.toString();
        }
        return response;
    }
}
