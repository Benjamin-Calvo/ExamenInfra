/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

/**
 *
 * @author AlexanderDM
 */
class Referencia {
    int direccion;
    String contenido;
    
    Referencia(int dir, String cont){
        this.direccion = dir;
        this.contenido = cont;
    }
    public int getDireccion(){
        return this.direccion;
    }
    public String getContenido(){
        return this.contenido;
    }
}
