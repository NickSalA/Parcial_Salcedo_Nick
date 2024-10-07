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
    private Rubro[] rubros;

    public ArregloRubro(int indice, Rubro[] rubros) {
        this.indice = indice;
        this.rubros = rubros;
    }

    public ArregloRubro(Rubro[] rubros) {
        this.rubros = rubros;
    }

    public boolean agregar(Rubro rubro) {
        boolean insertado = false;
        for (int i = 0; i < rubros.length; i++) {
            if (rubros[i] == null) {
                rubros[i] = rubro;
                insertado = true;
                break;
            }
        }
        return insertado;
    }

    public boolean buscar(String nombreRubro)
        
    }
