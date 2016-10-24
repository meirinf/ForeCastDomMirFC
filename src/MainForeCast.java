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

            String tiempo = temps.getElementsByTagName("symbol").item(0).getAttributes().getNamedItem("name").getTextContent();
            String temperaturamax = temps.getElementsByTagName("temperature").item(0).getAttributes().getNamedItem("max").getTextContent();
            String temperaturamin = temps.getElementsByTagName("temperature").item(0).getAttributes().getNamedItem("min").getTextContent();
            String velocidad =  temps.getElementsByTagName("windSpeed").item(0).getAttributes().getNamedItem("name").getTextContent();

            //Los trasducimos
            Traductor(tiempo);
            TraductorVelocidad(velocidad);

            //los añadimos al objeto y  a la array de objetos
            t.setTiempo(tiempo);
            t.setTemperaturamax(temperaturamax);
            t.setTemperaturamin(temperaturamin);
            t.setVelocidad(velocidad);
            tie.add(t);
       }

        System.out.println(tie.toString());

    }





    //Traductor tiempo

    public static String Traductor(String tiempo) {
        if (tiempo.equalsIgnoreCase("scattered clouds")){
            tiempo = "nuves dispersas";
        }
        if(tiempo.equalsIgnoreCase("broken clouds")){
            tiempo = "interbalos nuvosos";
        }
        if(tiempo.equalsIgnoreCase("light rain")){
            tiempo = "llovizna";
        }
        if(tiempo.equalsIgnoreCase("few clouds")){
            tiempo = "pocas nubes";
        }

        if(tiempo.equalsIgnoreCase("overcast clouds")){
            tiempo = "nublado";
        }
        if(tiempo.equalsIgnoreCase("sky is clear")){
            tiempo = "soleado";
        }
        return tiempo;
    }

    //Traductor de velocidades

    public static String TraductorVelocidad (String velocidad) {
        if(velocidad.equalsIgnoreCase("Gentle Breeze")){
            velocidad = "suave brisa";
        }
        if(velocidad.equalsIgnoreCase("Light breeze")){
            velocidad = "Brisa ligera";
        }
        if(velocidad.equalsIgnoreCase("Calm")){
            velocidad = "Calma";
        }
        if(velocidad.equalsIgnoreCase("Moderate breeze")){
            velocidad = "Brisas moderadas";
        }
        if(velocidad.equalsIgnoreCase("strong wind")){
            velocidad = "viento fuerte";
        }
        return velocidad;
    }


}
