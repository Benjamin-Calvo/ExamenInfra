package exameninfra;

public class MSecundaria {

    public PaginaV PrimerNodo;
    String Nombre;

//Constructor construye una lista vacia con un nombre s
//Retorna True si Lista Vac�a
    public boolean VaciaLista() {
        return PrimerNodo == null;
    }

// Imprime el contenido de la lista
    public void Imprimir() {
        if (VaciaLista()) {
            System.out.println("vacia" + Nombre);
        } //fin del primer if
        else {
            System.out.print("La secuencia  " + Nombre + "  es:  ");
            PaginaV Actual = PrimerNodo;

            while (Actual.siguiente != PrimerNodo) {
                System.out.println(Actual.tamaño + " ");
                for (Referencia referencia_actual : Actual.referencias_contenidas) {
                    System.out.println("\t"+referencia_actual + " ");
                    
                }
                Actual = Actual.siguiente;
            }

            System.out.println();
            System.out.println();
        }
    }

    public MSecundaria(String s) {
        Nombre = s;
        PrimerNodo = null;
    }

//Constructor construye una lista vacia con un nombre de List
    public MSecundaria() {
        this("Lista");
    }

//Inserta un Elemento al Frente de la Lista
//Si esta vac�a PrimerNodo y UltimoNodo se refieren al nuevo nodo. Si no PrimerNodo se refiere al nuevo nodo.
    public void InsertaInicio(int id, int ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new PaginaV(id, ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            PaginaV Nuevo = new PaginaV(id, ElemInser);
            PaginaV Aux = PrimerNodo;
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
    public void InsertaFinal(int id,int ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = new PaginaV(id,ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            PaginaV Aux = PrimerNodo;
            while (Aux.siguiente != PrimerNodo) {
                Aux = Aux.siguiente;
            }
            PaginaV Nuevo = new PaginaV(id, ElemInser);
            Aux.siguiente = Nuevo;
            Nuevo.siguiente = PrimerNodo;   //Referencia hacia primer Nodo
        }
    }

//Inserta un Elemento en una posici�n dada
//Si esta vac�a PrimerNodo y UltimoNodo se refieren al nuevo nodo.
//Si no PrimerNodo se refiere al nuevo nodo.
    public void InsertaMedio(int id, int ElemInser, int Posicion) {
        if (VaciaLista()) {
            PrimerNodo = new PaginaV(id, ElemInser);
            PrimerNodo.siguiente = PrimerNodo;
        } else {
            if (Posicion <= 1) {
                InsertaInicio(id, ElemInser);
            } else {
                PaginaV Aux = PrimerNodo;
                int i = 2;
                while ((i != Posicion) & (Aux.siguiente != PrimerNodo)) {
                    i++;
                    Aux = Aux.siguiente;
                }
                PaginaV Nuevo = new PaginaV(id, ElemInser);
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
                PaginaV Aux = PrimerNodo;
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
                PaginaV Actual = PrimerNodo;
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
            PaginaV Aux = null;
            PaginaV Actual = PrimerNodo;
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
