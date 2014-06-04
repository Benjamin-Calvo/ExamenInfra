/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

/**
 *
 * @author Benjamin Calvo
 */
public class proceso implements Runnable{
    
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
