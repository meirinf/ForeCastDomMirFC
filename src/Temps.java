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


    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setTemperaturamax(String temperaturamax) {
        this.temperaturamax = temperaturamax;
    }

    public void setTemperaturamin(String temperaturamin) {
        this.temperaturamin = temperaturamin;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        System.out.println("Temps " + tiempo + " temperatura max: " + temperaturamax + " temperatura min: " + temperaturamin + " Velocidad del tiempo: " + velocidad);
        return super.toString();
    }
}
