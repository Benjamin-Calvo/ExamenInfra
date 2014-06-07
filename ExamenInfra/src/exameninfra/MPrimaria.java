package exameninfra;

import java.util.ArrayList;

public class MPrimaria {

    public Frame PrimerNodo;
    String Nombre;
    public Frame ultimoInsertado;

//Constructor construye una lista vacia con un nombre s
//Retorna True si Lista Vac�a
    public boolean VaciaLista() {
        return PrimerNodo == null;
    }

// Imprime el contenido de la lista
    public void ImprimirFrames() {
        if (VaciaLista()) {
            System.out.println("No hay frames");
        } //fin del primer if
        else {
            System.out.println("Frames existentes: ");
            Frame frame_actual = PrimerNodo;
            while (frame_actual.siguiente != PrimerNodo) {
                if (frame_actual.pagina_cargada != null && frame_actual.id_propietario != 0) {
                    System.out.println("El frame " + frame_actual.id_frame + " pertenece al proceso: " + frame_actual.id_propietario + "y contiene la página: " + frame_actual.pagina_cargada.id_pagina + "\n");
                } else {
                    if (frame_actual.id_propietario != 0) {
                        System.out.println("El frame " + frame_actual.id_frame + " pertenece al proceso: " + frame_actual.id_propietario + " y no tiene página cargada\n");
                    }
                    if (frame_actual.pagina_cargada != null) {
                        System.out.println("El frame " + frame_actual.id_frame + " contiene la página: " + frame_actual.pagina_cargada.id_pagina + "\n");
                    } else {
                        System.out.println("El frame " + frame_actual.id_frame + "no pertenece a ningún proceso ni tiene página cargada");
                    }
                }

                frame_actual = frame_actual.siguiente;
            }
            if (frame_actual.pagina_cargada != null && frame_actual.id_propietario != 0) {
                System.out.println("El frame " + frame_actual.id_frame + " pertenece al proceso: " + frame_actual.id_propietario + "y contiene la página: " + frame_actual.pagina_cargada.id_pagina + "\n");
            } else {
                if (frame_actual.id_propietario != 0) {
                    System.out.println("El frame " + frame_actual.id_frame + " pertenece al proceso: " + frame_actual.id_propietario + " y no tiene página cargada\n");
                }
                if (frame_actual.pagina_cargada != null) {
                    System.out.println("El frame " + frame_actual.id_frame + " contiene la página: " + frame_actual.pagina_cargada.id_pagina + "\n");
                } else {
                    System.out.println("El frame " + frame_actual.id_frame + "no pertenece a ningún proceso ni tiene página cargada");
                }
            }

            System.out.println("\n\n");
        }
    }
//Constructor construye una lista vacia con un nombre de List

    public MPrimaria(int cantMemoria) {
        this("Memoria Primaria");
        for (int i = 0; i < cantMemoria; i++) {
            this.InsertaFinal(i);
        }
    }
  
    public void liberarFrame(int porLiberar) {
        Frame aux = PrimerNodo.siguiente;
        while (!aux.equals(PrimerNodo)){
            if (porLiberar == aux.id_frame){
                aux.id_propietario = 0;
                aux.modificado = "";
                aux.pagina_cargada = null;
                break;
            }
            aux=aux.siguiente;
        }
        if (aux.equals(PrimerNodo) && aux.id_frame == porLiberar){
            aux.id_propietario = 0;
            aux.modificado = "";
            aux.pagina_cargada = null;
        }
    }
    
    public boolean hayDisponible(){
        Frame aux = this.PrimerNodo;
        for(int i=0; i < this.largoLista(); i++){
            if (aux.id_propietario == 0){
                return true;
            }
            aux=aux.siguiente;
        }
        return false;
    }
    
    public void setFramesFirstAvailable(int cantFramesRequeridos, int idProceso){
        Frame aux = PrimerNodo;
        int disponibles =0;
        ArrayList <Frame> candidatos = new ArrayList<>();
        if (hayDisponible()){
            while(disponibles != cantFramesRequeridos && aux != PrimerNodo){
                if(aux.id_propietario == 0){
                    candidatos.add(aux);
                    disponibles++;
                }
                else{
                    disponibles = 0;
                    candidatos.clear();
                }
                aux = aux.siguiente;
            }
            if (!candidatos.isEmpty()){
                for (Frame disponible_actual: candidatos){
                    disponible_actual.id_propietario = idProceso;
                    this.ultimoInsertado = disponible_actual;
                }
            }
            else{
                System.out.println("No hay espacio suficiente");
            }
        }
        else{
            System.out.println("No hay frames disponibles");
        }
    }
    
    public void setFramesNextAvailable(int cantFramesRequeridos, int idProceso){
        if (this.ultimoInsertado == null){
            setFramesFirstAvailable(cantFramesRequeridos, idProceso);
        }
        else{
            Frame aux = this.ultimoInsertado.siguiente;
            int disponibles = 0;
            ArrayList <Frame> candidatos = new ArrayList<>();
            if (hayDisponible()){
                while(disponibles < cantFramesRequeridos && aux != this.ultimoInsertado){
                    if (aux.equals(PrimerNodo)){
                        disponibles = 0;
                        candidatos.clear();
                    }
                    if(aux.id_propietario == 0){
                        candidatos.add(aux);
                        disponibles++;
                    }
                    else{
                        disponibles = 0;
                        candidatos.clear();
                    }
                    aux = aux.siguiente;
                }
                if (!candidatos.isEmpty()){
                    for (Frame disponible_actual: candidatos){
                        disponible_actual.id_propietario = idProceso;
                    }
                    this.ultimoInsertado = aux;
                }
                else{
                    System.out.println("No hay espacio suficiente");
                }
            }
            else{
                System.out.println("No hay frames disponibles");
            }
        }
    }
    /*
     //Constructor construye una lista vacia con un nombre de List
     public MPrimaria(int cantMemoria){ 
     this ("Memoria Primaria");
     if( (cantMemoria % 4)==0 ){
        
     } 
     else {
        
     }
     }
     */

    public MPrimaria(String s) {
        Nombre = s;
        PrimerNodo = null;
    }

//Constructor construye una lista vacia con un nombre de List
    public MPrimaria() {
        this("Memoria Primaria");
    }

//Inserta un Elemento al Frente de la Lista
//Si esta vac�a PrimerNodo y UltimoNodo se refieren al nuevo nodo. Si no PrimerNodo se refiere al nuevo nodo.
    public void InsertaInicio(int ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new Frame(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            Frame Nuevo = new Frame(ElemInser);
            Frame Aux = PrimerNodo;
            while (Aux.siguiente != PrimerNodo) {
                Aux = Aux.siguiente;
            }
            Aux.siguiente = Nuevo;
            Nuevo.siguiente = PrimerNodo;
            PrimerNodo = Nuevo;
        }
    }

//Inserta al Final de la Lista
//Si la lista se encuentra vac�a, el PrimerNodo y el UltimoNodo se refieren al nuevo nodo. Si no, la variable de siguiente de UltimoNodo se refiere al nuevo nodo.
    public void InsertaFinal(int ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new Frame(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            Frame Aux = PrimerNodo;
            while (Aux.siguiente != PrimerNodo) {
                Aux = Aux.siguiente;
            }
            Frame Nuevo = new Frame(ElemInser);
            Aux.siguiente = Nuevo;
            Nuevo.siguiente = PrimerNodo;   //Referencia hacia primer Nodo
        }
    }

//Inserta un Elemento en una posici�n dada
//Si esta vac�a PrimerNodo y UltimoNodo se refieren al nuevo nodo.
//Si no PrimerNodo se refiere al nuevo nodo.
    public void InsertaMedio(int ElemInser, int Posicion) {
        if (VaciaLista()) {
            PrimerNodo = new Frame(ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            if (Posicion <= 1) {
                InsertaInicio(ElemInser);
            } else {
                Frame Aux = PrimerNodo;
                int i = 2;
                while ((i != Posicion) & (Aux.siguiente != PrimerNodo)) {
                    i++;
                    Aux = Aux.siguiente;
                }
                Frame Nuevo = new Frame(ElemInser);
                Nuevo.siguiente = Aux.siguiente;
                Aux.siguiente = Nuevo;
            }
        }
    }

//Eliminar al Inicio
//Debe tomar en cuenta si la lista se encuentra vac�a y producir una excepci�n, en caso contrario si PrimerNodo y UltimoNodo referencian al mismo nodo, ambos deben ser null y sino  primernodo ser� igual a PrimerNodo.siguiente
    public void EliminaInicio() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        } else {
            if (PrimerNodo.siguiente == PrimerNodo) {
                PrimerNodo = null;
            } else {
                PrimerNodo = PrimerNodo.siguiente;
                Frame Aux = PrimerNodo;
                while (Aux.siguiente != PrimerNodo) {
                    Aux = Aux.siguiente;
                }
                Aux.siguiente = PrimerNodo;
            }
        }
    }

//Eliminar al Final
//Debe tomar en cuenta si la lista se encuentra vac�a y producir una excepci�n, en caso contrario si PrimerNodo y UltimoNodo referencian al mismo nodo, ambos deben ser null y sino  ultimonodo en el campo siguiente ser� nulo
    public void EliminaFinal() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        } else {
            if (PrimerNodo == PrimerNodo.siguiente) {
                PrimerNodo = null;
            } else {
                Frame Actual = PrimerNodo;
                while (Actual.siguiente.siguiente != PrimerNodo) {
                    Actual = Actual.siguiente;
                }
                Actual.siguiente = PrimerNodo;
            }
        }

    }

//Elimina un Elemento en una posici�n dada
//Si esta vac�a PrimerNodo y UltimoNodo se refieren al nuevo nodo.
//Si no PrimerNodo se refiere al nuevo nodo.
    public void EliminaMedio(int Posicion) {
        if (VaciaLista()) {
            System.out.println("Nada");
        } else {
            Frame Aux = null;
            Frame Actual = PrimerNodo;
            int i = 1;
            while ((i != Posicion) & (Actual.siguiente != PrimerNodo)) {
                i++;
                Aux = Actual;
                Actual = Actual.siguiente;
            }
            if (i == Posicion) {
                if (Aux == null) {
                    Actual = PrimerNodo;
                    PrimerNodo = PrimerNodo.siguiente;
                } else {
                    Aux.siguiente = Actual.siguiente;
                }
            }
        }
    }
    
    public int largoLista (){
        if (!VaciaLista()){
            Frame aux = this.PrimerNodo;
            int largo = 0;
            while (aux.siguiente!=PrimerNodo){
                largo++;
                aux=aux.siguiente;
            }
            return largo+1;
        }
        else {
            return 0;   
        }
    }
// Convierte una lista Simple en Circular
//public void ConvertCircularSimple()
//{
//	if  (VaciaLista())
//		System.out.println ("La lista se encuentra vacia");
//	else
//		{
//			NodosLista Aux = PrimerNodo;
//			NodosLista Aux1 = PrimerNodo;
//			while (Aux.siguiente !=null)
//				Aux=Aux.siguiente;
//			if (Aux.siguiente ==null)
//				Aux.siguiente=Aux1;
//		}
//}
//
// Convierte una lista Doble en Circular
//
//public void ConvertCircularDoble()
//{
//	if  (VaciaLista())
//		System.out.println ("La lista se encuentra vacia");
//	else
//		{
//			NodosLista Aux = PrimerNodo;
//			NodosLista Aux1 = PrimerNodo;
//			while (Aux.siguiente !=null)
//				Aux=Aux.siguiente;
//			if (Aux.siguiente ==null)
//				Aux.siguiente.anterior=Aux1;
//		}
//}
};
