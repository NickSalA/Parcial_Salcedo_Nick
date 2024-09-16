/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Tarjeta;
import Modelo.Tipo_Usuario;
/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Usuario {
    String paterno;
    String materno;
    String nombres;
    String documento;
    Tarjeta tarjeta;


    Tipo_Usuario tipo;
    public Usuario(String paterno, String materno, String nombres, String documento, int numero, float saldo, String tipo_usuario, boolean activo){
        this.paterno = paterno;
        this.materno = materno;
        this.nombres= nombres;
        this.documento = documento;
        this.tarjeta = new Tarjeta(numero,saldo);
        this.tipo = new Tipo_Usuario(tipo_usuario,activo);
    }
    public boolean recargar(float monto){
        return tarjeta.recargar(monto);
    }
    public boolean consumir(float monto){
        return tarjeta.consumir(monto);
    }
    public String getNombreCompleto() {
        return this.paterno + " " + this.materno + ", " + this.nombres;
    }
    public float getSaldo(){
        return tarjeta.getSaldo();
    }
}
