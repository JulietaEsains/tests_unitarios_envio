package entities;

public class Courier {

    private String nombreCourier;
    private int cantidadEnvios;

    public Courier(int envios) {
        this.cantidadEnvios = envios;
    }

    public Courier(String nombreCourier) {
        this.nombreCourier = nombreCourier;
    }

    public void setNombreCourier(String nombreCourier) {
        this.nombreCourier = nombreCourier;
    }

    public String getNombreCourier() {
        return nombreCourier;
    }

    public void setCantidadEnvios(int cantidadEnvios){
        this.cantidadEnvios = cantidadEnvios;
    }

    public int getCantidadEnvios() {
        return cantidadEnvios;
    }
}
