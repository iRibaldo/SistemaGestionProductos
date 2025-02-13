/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestionproductos.controlador;

import ec.edu.espoch.sistemagestionproductos.modelo.Productos;
import ec.edu.espoch.sistemagestionproductos.vista.Vista;

/**
 *
 * @author Global Technology Ec
 */
public class Controlador {
    private Vista vista;
    
    public Controlador(Vista vista) {
        this.vista = vista;
    }
    
    public void agregarProducto() {

        try {
            if (this.vista != null) {
                Productos objProducto = new Productos();
                objProducto.setNombre(this.vista.getNombre());
                objProducto.setPrecio(this.vista.getPrecio());
                objProducto.setDisponibilidad(this.vista.getDisponiblidad());
                

            } else {
                vista.Error("Completa los datos!");
            }
        } catch (Exception e) {
            vista.Error("Error");
        }
    }
}
