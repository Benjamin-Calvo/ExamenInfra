package exameninfra;
// Clase NodosLista

class Frame {

    // datos amigables para que la Clase Lista Tenga un acceso directo

    int id_frame;
    int id_propietario;
    //int tiempo_referencia = 0;
    //boolean bloqueado; //true bloqueado, false desbloqueado
    //boolean uso; //true bit uso = 1, false bit =0
    PaginaV pagina_cargada;

    Frame siguiente;

//Construtor  Crea un nodo del tipo Object
    Frame(int id) {
        id_frame = id;
        id_propietario = 0; // Los procesos tienen id>0
        pagina_cargada = null;
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
    

//Retorna el siguiente nodo
    Frame getnext() {
        return siguiente;
    }

};
