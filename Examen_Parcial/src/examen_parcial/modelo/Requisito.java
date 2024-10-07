/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Requisito {

    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true;
    }

    public boolean habilitar(){
       this.estado = true;
       return estado;
    }
    public boolean deshabilitar(){
        this.estado = false;
        return estado;
    }
}
