package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Caja implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < this.clientes.size(); i++) {
            System.out.println("\n" + this.nombreCaja + " está atendiendo a: " + this.clientes.get(i).getNombre()+"\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clientes.get(i).run();

            System.out.println("\n" + this.nombreCaja + " ha terminado de atender a: " + this.clientes.get(i).getNombre()+"\n");
            long tiempoTranscurrido =(System.currentTimeMillis() - initialTime);
            double tiempoTranscurridoS = tiempoTranscurrido / 1000;
            DecimalFormat df = new DecimalFormat("#.##"); // Formato con 2 decimales

            System.out.println("Procesado el cliente " + clientes.get(i).getNombre() + " en " + df.format(tiempoTranscurridoS) + " segundos");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }



    }

    private static int contador = 1;
    private String nombreCaja;
    private ArrayList<Cliente> clientes;
    private long initialTime;

    public Caja(ArrayList<Cliente> cliente) {
        this.nombreCaja = "Caja " + contador;
        this.clientes = cliente;
        contador++;
    }

    public String getNombreCaja() {
        return nombreCaja;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

}
