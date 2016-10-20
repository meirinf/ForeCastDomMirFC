import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by 53638138e on 20/10/16.
 */
public class MainForeCast {
    public static void main(String[]args) throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {

        File imputFile = new File ("forecast.xml");
        DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(imputFile);

        System.out.println("Root element:"+doc.getDocumentElement().getNodeName());
        NodeList nlocation = doc.getElementsByTagName("location");

        Element localizacion = (Element)nlocation.item(0);
        System.out.println(localizacion.getElementsByTagName("name").item(0).getAttributes());

        NodeList nList = doc.getElementsByTagName("time");
        System.out.println("Hi ha "+nList.getLength()+"temps");


        for (int i = 0 ; i < nList.getLength();i++){

            Element temps = (Element)nList.item(i);

            String Tiempo = temps.getElementsByTagName("symbol").item(0).getAttributes().getNamedItem("name").getTextContent();
            String Temperatura;
            String Velocidad;


           // System.out.println("El llibre amb totiol"+ llibre.getElementsByTagName("titulo").item(0).getTextContent()+
                    //"te com autor "+llibre.getElementsByTagName("autor").item(0).getTextContent()+"i va ser publicat l'any "+llibre.getElementsByTagName("fecha").item(0).getTextContent()+".");
       }

    }
}
