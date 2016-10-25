/**
 * Created by 53638138e on 24/10/16.
 */
public class Temps {
    public String tiempo;
    public String temperaturamax;
    public String temperaturamin;
    public String velocidad;
    public String viento;

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

    public String getViento() {
        return viento;
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

    public void setViento(String viento) {
        if(viento.equalsIgnoreCase("Gentle Breeze")){
            viento = "suave brisa";
        }
        if(viento.equalsIgnoreCase("Light breeze")){
            viento = "Brisa ligera";
        }
        if(viento.equalsIgnoreCase("Calm")){
            viento = "Calma";
        }
        if(viento.equalsIgnoreCase("Moderate breeze")){
            viento = "Brisas moderadas";
        }
        if(viento.equalsIgnoreCase("strong wind")){
           viento = "viento fuerte";
        }
        this.viento = viento;
    }

    public void setTemperaturamax(String temperaturamax) {
         this.temperaturamax = temperaturamax;
    }

    public void setTemperaturamin(String temperaturamin) {
        this.temperaturamin = temperaturamin;
    }
    //Traduce nada mas pasado el objeto
    public void setVelocidad(String velocidad) {
            double ms=  Double.parseDouble(velocidad);
            ms = ms * 3.6;
            ms =Math.round(ms*100d)/100d;
            velocidad = Double.toString(ms);
        this.velocidad = velocidad;
    }
}
