/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Cliente {

    private String RUC;
    private String nombres;
    private String email;
    private String telefono;
    private String clave;
    public Cliente(String RUC,String nombres,String email,String telefono,String clave){
         this.RUC = RUC;
         this.nombres=nombres;
         this.email = email;
         this.telefono = telefono;
         this.clave = clave;
    }
    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean agregarOferta(oferta Oferta){
        
    }
    public boolean eliminarOferta(oferta Oferta){
        
    }
}
