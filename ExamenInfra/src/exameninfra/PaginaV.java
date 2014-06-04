package exameninfra;
// Clase NodosLista

import java.util.ArrayList;

class PaginaV {

    // datos amigables para que la Clase Lista Tenga un acceso directo

    int id;
    int tamaño;
    ArrayList<Referencia> referencias_contenidas = new ArrayList<>();

    PaginaV siguiente;

//Construtor  Crea un nodo del tipo Object
    PaginaV(int id, int tam) {
        this.id= id;
        tamaño = tam;
        siguiente = null;  //siguiente con valor de nulo
    }

    public void agregarReferencias(ArrayList<Referencia> refs) {
        for (Referencia referencia_actual : refs) {
            this.referencias_contenidas.add(referencia_actual);
        }
    }

// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
    PaginaV(int valor, PaginaV signodo) {
        tamaño = valor;
        siguiente = signodo; //siguiente se refiere al siguiente nodo
    }

//Retorna el dato que se encuentra en este nodo
    int getTamaño() {
        return tamaño;
    }

    ArrayList<Referencia> getReferencias() {
        return referencias_contenidas;
    }

//Retorna el siguiente nodo
    PaginaV getnext() {
        return siguiente;
    }

};
