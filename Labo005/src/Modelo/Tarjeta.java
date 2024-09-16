/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Tarjeta {

    int numero;
    float saldo;
    boolean activo;
    float precio;
    
    public Tarjeta(int numero, float saldo, boolean activo, float precio){
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio= precio;
    }
    public Tarjeta(int numero, float monto){
        this.numero = numero;
        this.saldo = monto;
        this.activo = true;
        this.precio = 50;
    }
    public Tarjeta(int numero){
        this.numero = numero;
        this.saldo =0;
        this.activo = true;
        this.precio = 50;
    }
    
    public boolean recargar(float monto){
        if (monto > 0 && this.activo == true && this.saldo >= monto){
            saldo-=monto;
            return true;
        }
        else{
        System.out.println("No es posible consumir el saldo.");
        return false;
        }
    }
    public boolean consumir(float monto){
        if (monto > 0 && this.activo == true && this.saldo >= monto){
            saldo-=monto;
            return true;
        }
        else{
        System.out.println("No es posible consumir el saldo.");
        return false;
        }
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
