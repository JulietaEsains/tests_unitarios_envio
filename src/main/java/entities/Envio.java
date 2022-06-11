package entities;

import java.util.Date;

public class Envio {
    private Integer numeroSeguimiento;
    private Integer ID_Venta;
    private Date fechaCreacion;

    public Envio(Integer numeroSeguimiento, Integer ID_Venta, Date fechaCreacion) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.ID_Venta = ID_Venta;
        this.fechaCreacion = fechaCreacion;
    }

    public Envio(Integer numeroSeguimiento,Date fechaCreacion) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(Integer numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public Integer getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(Integer ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
