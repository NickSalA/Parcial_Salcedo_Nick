/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class ArregloEstadoEtapa {

    private int indice;
    private EstadoEtapa[] estadoEtapa;

    public ArregloEstadoEtapa( int tamano) {
        this.indice = 0;
        this.estadoEtapa =new EstadoEtapa[tamano];
    }
    public boolean Agregar(EstadoEtapa Etapa){
        if (indice < estadoEtapa.length){
            estadoEtapa[indice] =Etapa;
            indice++;
            return true;
        }
        return false;
    }
}
