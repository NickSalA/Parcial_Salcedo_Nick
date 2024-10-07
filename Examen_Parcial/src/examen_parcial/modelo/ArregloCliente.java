/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial.modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class ArregloCliente {
    private int indice;
    private Cliente[] clientes;
    public ArregloCliente(int tamano){
        this.indice = 0;
        this.clientes = new Cliente[tamano];
    }
    public boolean agregar (Cliente cliente){
        if (indice < clientes.length){
            clientes[indice] =cliente;
            indice++;
            return true;
        }
        return false;
    }
    public boolean buscarRuc (String RUC){
        for (int i = 0; i < indice; i++) {
            if (clientes[i].getRUC().equalsIgnoreCase(RUC)) {
                return true;
            }
        }
        return false;
    }
    public boolean buscarNombre (String nombre){
        for (int i = 0; i < indice; i++) {
            if (clientes[i].getNombres().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
