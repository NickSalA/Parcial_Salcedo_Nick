/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class ArregloGradoEstudio {

    private int indice;
    private GradoEstudio[] gradoEstudios;

    public ArregloGradoEstudio(int tamano) {
        this.indice = 0;
        this.gradoEstudios = new GradoEstudio[tamano];
    }

    public boolean agregar(GradoEstudio Grado) {
        if (indice < gradoEstudios.length) {
            gradoEstudios[indice] = Grado;
            indice++;
            return true;
        }
        return false;
    }

    public boolean buscar(String criterio) {
        for (int i = 0; i < indice; i++) {
            if (gradoEstudios[i].getDescripcion().equalsIgnoreCase(criterio)) {
                return true;
            }
        }
        return false;
    }

    public GradoEstudio[] getGradoEstudios() {
        return gradoEstudios;
    }
}
