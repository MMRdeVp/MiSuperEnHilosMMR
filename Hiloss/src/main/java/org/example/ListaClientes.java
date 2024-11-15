package org.example;

import java.util.ArrayList;

public class ListaClientes {
    private ArrayList<Cliente> lista;

    public ListaClientes(ArrayList<Cliente> lista) {
        this.lista = lista;
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }
}
