/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandramatesanz.tarea6.ed;

/**
 *
 * @author Sandra
 */
public class Tarea6EDClase {
    
    private static final double PORCENTAJE_DESCUENTO_CON_PRODUCTOS = 0.8;
    private static final double PORCENTAJE_DESCUENTO_SIN_PRODUCTOS = 0.95;
    
    
    public void aplicarDescuento(double precioProducto, int numeroProductos) {
        
        double total;

        if (numeroProductos > 3) {
            precioProducto -= 5;
        }

        if (numeroProductos != 0) {
            total = precioProducto * PORCENTAJE_DESCUENTO_CON_PRODUCTOS;
        } else {
            total = precioProducto * PORCENTAJE_DESCUENTO_SIN_PRODUCTOS;
        }
        
        imprimirTotal(total);
    }    

    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es: " + total); 
        System.out.println("Enviado");
    }
}

