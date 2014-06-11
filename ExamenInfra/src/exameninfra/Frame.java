package exameninfra;
// Clase NodosLista

import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.Date;


class Frame {

    // datos amigables para que la Clase Lista Tenga un acceso directo

    int id_frame;
    int id_propietario;
    //int tiempo_referencia = 0;
    //boolean bloqueado; //true bloqueado, false desbloqueado
    boolean uso; //true bit uso = 1, false bit =0
    PaginaV pagina_cargada;
    String modificado;
    Frame siguiente;

//Construtor  Crea un nodo del tipo Object
    Frame(int id) {
        id_frame = id;
        id_propietario = 0; // Los procesos tienen id>0
        pagina_cargada = null;
        Date now = new Date();
        modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);
        siguiente = null;  //siguiente con valor de nulo
    }

//Retorna el dato que se encuentra en este nodo
    int getIdFrame() {
        return this.id_frame;
    }
    
    int getIdPaginaCargada() {
        return this.pagina_cargada.id_pagina;
    }
    PaginaV getPaginaCargada() {
        return this.pagina_cargada;
    }
    
    int getPropietario() {
        return this.id_propietario;
    }
    
    public void actualizarFrame(){
        Date now = new Date();
        this.modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);
    }
    
    public void modificarPV (){
        this.pagina_cargada.actualizar();
    }

//Retorna el siguiente nodo
    Frame getnext() {
        return siguiente;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Frame f1 = new Frame(1);
        Frame f2 = new Frame(2);
        Frame f3 = new Frame(3);
        System.out.println("Fecha inicial: "+f1.modificado);
        f2.actualizarFrame();
        sleep(5000);
        f1.actualizarFrame();
        System.out.println("Fecha posterior: "+f1.modificado);
        int comp;
        System.out.println(comp = f1.modificado.compareTo(f2.modificado));
        
        
        
        
    }

};
