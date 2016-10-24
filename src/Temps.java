/**
 * Created by 53638138e on 24/10/16.
 */
public class Temps {
    public String tiempo;
    public String temperaturamax;
    public String temperaturamin;
    public String velocidad;

    public Temps() {
    }

    //getters

    public String getTiempo() {
        return tiempo;
    }

    public String getTemperaturamax() {
        return temperaturamax;
    }

    public String getTemperaturamin() {
        return temperaturamin;
    }

    public String getVelocidad() {
        return velocidad;
    }

    //setters

    //Traduce nada mas pasado el objeto
    public void setTiempo(String tiempo) {
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
        this.tiempo = tiempo;
    }

    public void setTemperaturamax(String temperaturamax) {
         this.temperaturamax = temperaturamax;
    }

    public void setTemperaturamin(String temperaturamin) {
        this.temperaturamin = temperaturamin;
    }
    //Traduce nada mas pasado el objeto
    public void setVelocidad(String velocidad) {

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
        this.velocidad = velocidad;
    }
}
