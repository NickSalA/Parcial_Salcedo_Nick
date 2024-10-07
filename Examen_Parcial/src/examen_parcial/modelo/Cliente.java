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
    private Contacto[] contactos;
    private int numOfertas = 0;
    private int numContacto = 0;

    public Cliente(String RUC, String nombres, String email, String telefono, String clave, int TamOferta, int TamContacto) {
        this.RUC = RUC;
        this.nombres = nombres;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new Oferta[TamOferta];
        this.contactos = new Contacto[TamContacto];
    }

    public boolean agregarOferta(Oferta oferta) {
        if (numOfertas < ofertas.length) { // Verificar si hay espacio disponible
            ofertas[numOfertas] = oferta;
            numOfertas++;
            return true;
        }
        return false;
    }

    public boolean eliminarOferta(Oferta oferta) {
        for (int i = 0; i < numOfertas; i++) {
            if (ofertas[i] == oferta) {
                for (int j = i; j < numOfertas - 1; j++) {
                    ofertas[j] = ofertas[j + 1];
                }
                ofertas[numOfertas - 1] = null;
                numOfertas--;
                return true;
            }
        }
        return false;
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }

    public boolean registrarContacto(Contacto contacto) {
        if (numContacto < contactos.length) {
            contactos[numContacto] = contacto;
            numContacto++;
            return true;
        }
        return false;
    }

    public String getRUC() {
        return RUC;
    }

    public String getNombres() {
        return nombres;
    }
}
