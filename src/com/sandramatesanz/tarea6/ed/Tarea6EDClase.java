/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandramatesanz.tarea6.ed; ////Para quitar el Code Smell: cambiamos el nombre del paquete.

/**
 *
 * @author Sandra
 */
public class Tarea6EDClase {
    
    
    //Para quitar el Code Smell: Realizamos una refactorización de extracción de constante para eliminar números mágicos (0.8 y 0.95).
    private static final double PORCENTAJE_DESCUENTO_CON_PRODUCTOS = 0.8;
    private static final double PORCENTAJE_DESCUENTO_SIN_PRODUCTOS = 0.95;
    
    
    //Para quitar el Code Smell: Realizamos una refactorización de de renombrado (de numeroProductos a numeroProductos).
    public void aplicarDescuento(double precioProducto, int numeroProductos) { 
        
        //Para quitar el Code Smell: Realizamos una refactorización de de renombrado (de Total a total).
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

    //Para quitar el Code Smell: Realizamos una refactorización de extracción de método mediante el método "imprimirTotal".
    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es: " + total); 
        System.out.println("Enviado");
    }
}

