/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Postulante {

    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String fechaNacimiento;
    private String clave;
    private GradoEstudio gradoActual;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, String fechaNacimiento, String clave) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.clave = clave;
    }

    public boolean asignarGradoEstudio(GradoEstudio grado) {
        if (grado != null) {
            this.gradoActual = grado;
            return true;
        }
        return false;
    }

    public boolean postular(Oferta oferta, String glosa) {
        if (oferta != null && glosa != null && !glosa.isEmpty()) {
            Postulacion nuevaPostulacion = new Postulacion(java.time.LocalDate.now().toString(), false, false);
            return true;
        }
        return false;
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        if (postulacion != null && !postulacion.isAnulado()) {
            postulacion.setAnulado(true);
            return true;
        }
        return false;
    }

    public String getDNI() {
        return DNI;
    }
}
