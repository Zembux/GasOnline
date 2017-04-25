package gol.zembux.com.gasonline.Objetos;

/**
 * Created by zembux on 25/04/17.
 */

public class Gasolinera {
    private String Grupo;
    private int Calificacion;
    private String Direccion;
    private int PrecioMagna;
    private int PrecioPremium;
    private int PrecioDiesel;

    public Gasolinera(){

    }
    public Gasolinera(String Grupo, int Calificacion){
        this.setGrupo(Grupo);
        this.setCalificacion(Calificacion);
        this.setDireccion(Direccion);

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

    public int getPrecioMagna() {
        return PrecioMagna;
    }

    public void setPrecioMagna(int precioMagna) {
        PrecioMagna = precioMagna;
    }

    public int getPrecioPremium() {
        return PrecioPremium;
    }

    public void setPrecioPremium(int precioPremium) {
        PrecioPremium = precioPremium;
    }

    public int getPrecioDiesel() {
        return PrecioDiesel;
    }

    public void setPrecioDiesel(int precioDiesel) {
        PrecioDiesel = precioDiesel;
    }
}
