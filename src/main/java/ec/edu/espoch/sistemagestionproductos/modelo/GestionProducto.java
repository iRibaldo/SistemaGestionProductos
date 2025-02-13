/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestionproductos.modelo;

/**
 *
 * @author SO-LAB1-PC23
 */
public class GestionProducto {
    int tamanoVector = 5;
    Productos[] productos = new Productos[tamanoVector];
    
    public String agregarProducto(Productos producto){
        int cont=0;
        String msg= "Ingreso exitoso";
        for (int i = 0; i < productos.length; i++) {
            if (productos[i]== null) {
                productos[i].setId(i++);
                productos[i].setNombre(producto.getNombre());
                productos[i].setPrecio(producto.getPrecio());
                productos[i].setDisponibilidad(producto.getDisponibilidad());
            }else{
                cont++;
            }    
        }
        if (cont==productos.length) {
            msg="El vector esta lleno";
        }
        return msg;   
    }
    public Productos[] listarTareas(){
        
        Productos[] auxProductos = new Productos[tamanoVector];
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getDisponibilidad()) {
                auxProductos[i].setId(productos[i].getId());
                auxProductos[i].setNombre(productos[i].getNombre());
                auxProductos[i].setPrecio(productos[i].getPrecio());
                auxProductos[i].setDisponibilidad(productos[i].getDisponibilidad());
            }
        }
        return auxProductos;
    }
    
}
