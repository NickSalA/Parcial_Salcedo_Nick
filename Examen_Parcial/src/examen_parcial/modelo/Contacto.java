/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Contacto {

    private String DNI;
    private String nombres;
    private String apellidos;
    private String puesto;
    public Contacto(String DNI, String nombres, String apellidos, String puesto){
        this.DNI = DNI;
        this.apellidos = apellidos;
        this. nombres = nombres;
        this.puesto = puesto;
    }
    public String getDNI() {
        return DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }
}
