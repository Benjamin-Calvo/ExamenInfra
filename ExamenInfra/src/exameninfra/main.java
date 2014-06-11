/*
Instituto Tecnológico de Costa Rica
Administración en Tecnologías de Información
Escuela de Ingeniería en Computación

Infraestructura Tecnológica I
Examén Práctico #2
Manejo de Memoria Virtual

Integrantes:
    Benjamín Calvo de León
    Alexander Durán Martínez
    Jose Pablo Matamoros Moya
    Víctor Vargas Ramírez
 */

package exameninfra;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Calvo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cantProcesos;
        cantProcesos =3;
        proceso p1;
        Thread t1 = new Thread(p1=new proceso());
        //t1.start();
        ArrayList <proceso> pr = new ArrayList<>();        
        pr.add(p1);
        
        for (proceso proceso_actual : pr){
             Thread t = new Thread()
             proceso_actual;
        }*/
        //Administrativo admin = new Administrativo();
        //admin.setVisible(true);
        MainMemory mm = new MainMemory();
        MPrimaria mp = new MPrimaria(48, mm);
        //cargar info de dos procesos
        proceso p1 = new proceso(5);
        mp.setFramesFirstAvailable(6, 5);
        p1.FramesAsignados(mp.FramesAsignados(5));
        
        p1.replaceMRU(new PaginaV(1));
        p1.replaceMRU(new PaginaV(7));
        p1.replaceMRU(new PaginaV(7));
        p1.replaceMRU(new PaginaV(7));
        p1.replaceMRU(new PaginaV(5));
        p1.replaceMRU(new PaginaV(7));
        p1.replaceMRU(new PaginaV(7));
        p1.replaceMRU(new PaginaV(7));
        
        proceso p2 = new proceso(99);
        mp.setFramesFirstAvailable(14, 99);
        p2.FramesAsignados(mp.FramesAsignados(99));
        
        proceso p3 = new proceso(12);
        mp.setFramesFirstAvailable(14, 12);
        p3.FramesAsignados(mp.FramesAsignados(12));
        
        proceso p4 = new proceso(1);
        mp.setFramesFirstAvailable(6, 1);        
        p4.FramesAsignados(mp.FramesAsignados(1));                
        p4.replaceFIFO(new PaginaV(1));
        p4.replaceFIFO(new PaginaV(2));
        p4.replaceFIFO(new PaginaV(3));
        p4.replaceFIFO(new PaginaV(4));
        p4.replaceFIFO(new PaginaV(5));
        //p4.replaceFIFO(new PaginaV(6));
        mm.setVisible(true);
        
        
    }
    
}
