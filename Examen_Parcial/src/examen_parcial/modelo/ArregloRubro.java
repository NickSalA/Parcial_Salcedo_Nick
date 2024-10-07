/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class ArregloRubro {

    private int indice;
    private final Rubro[] rubros;

    public ArregloRubro(int indice, Rubro[] rubros) {
        this.indice = indice;
        this.rubros = rubros;
    }

    public ArregloRubro(int tamano) {
        this.indice = 0;
        this.rubros = new Rubro[tamano];
    }

    public boolean agregar(Rubro rubro) {
        if (indice < rubros.length) { 
            rubros[indice] = rubro;
            indice++;  
            return true;  
        }
        return false;  
    }

    public boolean buscar(String nombreRubro){
        for (int i = 0; i < indice; i++) {  
            if (rubros[i].getNombre().equalsIgnoreCase(nombreRubro)) {  
                return true;  
            }
        }
        return false; 
    }
}