/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class ArregloPostulante {

    private int indice;

    private Postulante[] postulantes;

    public ArregloPostulante(int tamano) {
        this.indice = 0;
        this.postulantes = new Postulante[tamano];
    }
    public boolean agregarPostulante(Postulante postulante){
        if (indice < postulantes.length) { 
            postulantes[indice] = postulante;
            indice++;  
            return true;  
        }
        return false;  
    }
    public boolean buscarPostulante(String DNI){
        for (int i = 0; i < indice; i++) {
            if (postulantes[i].getDNI().equalsIgnoreCase(DNI)) {
                return true;
            }
        }
        return false;
    }
    public Postulante[] getPostulantes() {
        return postulantes;
    }
    
}
