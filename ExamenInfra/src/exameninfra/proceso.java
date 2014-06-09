/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Calvo
 */
public class proceso extends Frame implements Runnable{
    
    int id;
    ArrayList<Frame> frames_asignados;
    Frame puntero;
    
    public proceso(int id) {
        super(id);
    }
    
    public void FramesAsignados(ArrayList<Frame> framesPorAsignar){
        this.frames_asignados = framesPorAsignar;
        puntero = null;
    }
    
    
    /*El proceso es ubicado en el primer espacio en memoria principal lo
	suficientemente grande para albergarlo desde el principio*/
    public void firstAvailable(){
        
    }
    
    /*El proceso es ubicado en el primer espacio en memoria principal lo suficientemente 
    grande para albergarlo desde el último proceso ubicado*/
    public void nextAvailable(){
        
    }

    @Override
    public void run() {
        System.out.println("lol");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
