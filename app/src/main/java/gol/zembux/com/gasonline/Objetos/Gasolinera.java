package gol.zembux.com.gasonline.Objetos;

/**
 * Created by zembux on 25/04/17.
 */

public class Gasolinera {
    private String Grupo;
    private int Calificacion;
    private String Direccion;
    private double PrecioMagna;
    private double PrecioPremium;
    private double PrecioDiesel;

    public Gasolinera(){

    }
    public Gasolinera(String Grupo, int Calificacion, String Direccion, double PrecioMagna, double PrecioPremium, double PrecioDiesel){
        this.setGrupo(Grupo);
        this.setCalificacion(Calificacion);
        this.setDireccion(Direccion);
        this.setPrecioMagna(PrecioMagna);
        this.setPrecioPremium(PrecioPremium);


    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setPrecioDiesel(int precioDiesel) {
        PrecioDiesel = precioDiesel;
    }

    public void setPrecioMagna(double precioMagna) {
        PrecioMagna = precioMagna;
    }

    public void setPrecioPremium(double precioPremium) {
        PrecioPremium = precioPremium;
    }

    public void setPrecioDiesel(double precioDiesel) {
        PrecioDiesel = precioDiesel;
    }
}
