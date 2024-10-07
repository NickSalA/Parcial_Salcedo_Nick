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
    private Oferta[] ofertas;
    public Cliente(String RUC,String nombres,String email,String telefono,String clave){
         this.RUC = RUC;
         this.nombres=nombres;
         this.email = email;
         this.telefono = telefono;
         this.clave = clave;
    }

    public boolean agregarOferta(Oferta oferta){
        
    }
    public boolean eliminarOferta(Oferta oferta){
        
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }
    public 
}
