package org.example;

import java.util.ArrayList;

public class Cliente implements Runnable {

    private String nombre;
    private ArrayList<String> productos = new ArrayList<>(5);

    public Cliente(String nombre, ArrayList<String> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public String toString() {
        return this.nombre + "\t tiene en el carrito: " + this.productos.toString();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getProductos().get(i) + " de " + this.getNombre());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
