/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Rubro {

    private String nombre;
    private boolean estado;

    public Rubro(String nombre) {
        this.nombre = nombre;
        this.estado = true;
    }

    public boolean habilitar() {
        this.estado = true;
        return estado;
    }

    public boolean deshabilitar() {
        this.estado = false;
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
