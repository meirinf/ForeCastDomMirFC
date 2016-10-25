import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by 53638138e on 20/10/16.
 */
public class MainForeCast {
    //Variables

    private static ArrayList <Temps> tie = new ArrayList<>();


    public static void main(String[]args) throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {

        File imputFile = new File ("forecast.xml");
        DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(imputFile);

        System.out.println("Root element:"+doc.getDocumentElement().getNodeName());
        NodeList nlocation = doc.getElementsByTagName("location");

        Element localizacion = (Element)nlocation.item(0);


        NodeList nList = doc.getElementsByTagName("time");



        for (int i = 0 ; i < nList.getLength();i++){

            Element temps = (Element)nList.item(i);
            Temps t = new Temps();
            String Resum;

            String tiempo = temps.getElementsByTagName("symbol").item(0).getAttributes().getNamedItem("name").getTextContent();
            String temperaturamax = temps.getElementsByTagName("temperature").item(0).getAttributes().getNamedItem("max").getTextContent();
            String temperaturamin = temps.getElementsByTagName("temperature").item(0).getAttributes().getNamedItem("min").getTextContent();
            String velocidad =  temps.getElementsByTagName("windSpeed").item(0).getAttributes().getNamedItem("mps").getTextContent();
            String viento = temps.getElementsByTagName("windSpeed").item(0).getAttributes().getNamedItem("name").getTextContent();
            


            //los añadimos al objeto y  a la array de objetos
            t.setTiempo(tiempo);
            t.setTemperaturamax(temperaturamax);
            t.setTemperaturamin(temperaturamin);
            t.setViento(viento);
            t.setVelocidad(velocidad);
            tie.add(t);

            System.out.println("El tiempo es: " + t.getTiempo()+ " || La temperatura max: " + t.getTemperaturamax() + " || La temperatura min es: " + t.getTemperaturamin() +" || viento  "+t.getViento()+ " || La velocidad del viento: " + t.getVelocidad());


       }






    }



}
