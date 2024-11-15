package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Cristian", new ArrayList<String>(5));
        cl1.setProductos(productosAlAzar(cl1.getProductos()));

        Cliente cl2 = new Cliente("Javier", new ArrayList<String>(5));
        cl2.setProductos(productosAlAzar(cl2.getProductos()));

        Cliente cl3 = new Cliente("Pablo", new ArrayList<String>(5));
        cl3.setProductos(productosAlAzar(cl3.getProductos()));

        Cliente cl4 = new Cliente("Jorge", new ArrayList<String>(5));
        cl4.setProductos(productosAlAzar(cl4.getProductos()));

        Cliente cl5 = new Cliente("Carlos", new ArrayList<String>(5));
        cl5.setProductos(productosAlAzar(cl5.getProductos()));

        ListaClientes lista1 = new ListaClientes(new ArrayList<Cliente>(5));
        ListaClientes lista2 = new ListaClientes(new ArrayList<Cliente>(5));

        lista1.getLista().add(cl1);
        lista1.getLista().add(cl2);
        lista2.getLista().add(cl3);
        lista2.getLista().add(cl4);
        lista2.getLista().add(cl5);

        Caja c1 = new Caja(lista1.getLista());
        Caja c2 = new Caja(lista2.getLista());

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();



    }

    private static ArrayList<String> productosAlAzar(ArrayList<String> p) {

        ArrayList<String> productos = new ArrayList<>();

        productos.add("Pan");
        productos.add("Leche");
        productos.add("Huevos");
        productos.add("Mantequilla");
        productos.add("Queso");
        productos.add("Yogur");
        productos.add("Manzanas");
        productos.add("Naranjas");
        productos.add("Plátanos");
        productos.add("Uvas");
        productos.add("Carne de res");
        productos.add("Pechuga de pollo");
        productos.add("Pescado");
        productos.add("Arroz");
        productos.add("Pasta");
        productos.add("Harina");
        productos.add("Azúcar");
        productos.add("Sal");
        productos.add("Aceite de oliva");
        productos.add("Aceite vegetal");
        productos.add("Café");
        productos.add("Té");
        productos.add("Cereales");
        productos.add("Galletas");
        productos.add("Chocolate");
        productos.add("Atún enlatado");
        productos.add("Sardinas enlatadas");
        productos.add("Sopa instantánea");
        productos.add("Tomates");
        productos.add("Cebollas");
        productos.add("Zanahorias");
        productos.add("Lechuga");
        productos.add("Pimientos");
        productos.add("Papas");
        productos.add("Detergente");
        productos.add("Papel higiénico");
        productos.add("Jabón");
        productos.add("Pasta de dientes");
        productos.add("Shampoo");

        for (int i = 0; i < 5; i++) {
            int n = (int) (Math.random() * 5)+1;
            p.add(n + " de " + (productos.get((int) (Math.random() * (productos.size() - 1)))));
        }
        return p;
    }
}