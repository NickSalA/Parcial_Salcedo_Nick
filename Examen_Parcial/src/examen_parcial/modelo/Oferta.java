/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Oferta {

    private String puesto;
    private String descripcion;
    private String area;
    private String fechaInicio;
    private String fechaTermino;
    private Requisito[] requisitos;
    private int indiceRequisito;

    public Oferta(String puesto, String descripcion, String area, String fechaInicio, String fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public Requisito[] getRequisitos() {
        return requisitos;
    }

    public boolean agregarRequisito(int orden, String descripcion) {
        if (indiceRequisito < requisitos.length) {
            requisitos[indiceRequisito] = new Requisito(orden, descripcion);
            indiceRequisito++;
            return true;
        }
        return false;
    }

    public boolean eliminarRequisito(int orden) {
        for (int i = 0; i < indiceRequisito; i++) {
            if (requisitos[i].getOrden() == orden) {
                requisitos[i] = null;
                for (int j = i; j < indiceRequisito - 1; j++) {
                    requisitos[j] = requisitos[j + 1];
                }
                requisitos[indiceRequisito - 1] = null;
                indiceRequisito--;
                return true;
            }
        }
        return false;
    }
}
