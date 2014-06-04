package exameninfra;
// Clase NodosLista
class PaginaV {
 // datos amigables para que la Clase Lista Tenga un acceso directo
     int datos;
     PaginaV siguiente;

//Construtor  Crea un nodo del tipo Object
 PaginaV (int  valor)
  {  datos =valor;
     siguiente = null;  //siguiente con valor de nulo
  }

// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
PaginaV (int valor, PaginaV signodo)
{   datos = valor;
    siguiente = signodo; //siguiente se refiere al siguiente nodo
}

//Retorna el dato que se encuentra en este nodo
int getint() {return datos; }

//Retorna el siguiente nodo
PaginaV getnext() {return siguiente; }

};