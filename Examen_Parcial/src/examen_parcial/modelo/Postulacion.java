/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Postulacion {

    private String fecha;
    private boolean anulado;
    private boolean fechaAnulacion;

    public Postulacion(String fecha, boolean anulado, boolean fechaAnulacion) {
        this.fecha = fecha;
        this.anulado = anulado;
        this.fechaAnulacion = fechaAnulacion;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public boolean isFechaAnulacion() {
        return fechaAnulacion;
    }
}
