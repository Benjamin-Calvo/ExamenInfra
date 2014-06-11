package exameninfra;
// Clase NodosLista

import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame {

    // datos amigables para que la Clase Lista Tenga un acceso directo
    public int id_frame;
    public int id_propietario;
    //int tiempo_referencia = 0;
    //boolean bloqueado; //true bloqueado, false desbloqueado
    boolean uso; //true bit uso = 1, false bit =0
    public PaginaV pagina_cargada;
    public String modificado;

    public JLabel lblFrame;
    public JLabel lblProceso;
    public JLabel lblPagina;
    public JPanel pnl;

    Frame siguiente;

//Construtor  Crea un nodo del tipo Object
    Frame(int id) {
        id_frame = id;
        id_propietario = 0; // Los procesos tienen id>0
        pagina_cargada = null;
        Date now = new Date();
        modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);
        siguiente = null;  //siguiente con valor de nulo
        
        pnl = new JPanel();
        int[] posicion = getPosicion(id);
        pnl.setBounds(posicion[0], posicion[1], 45, 45);
        pnl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        lblFrame = new JLabel("" + id);
        lblProceso = new JLabel("");
        lblPagina = new JLabel("");
        pnl.add(lblFrame);
        pnl.add(lblProceso);
        pnl.add(lblPagina);
        lblFrame.setLocation(2, 2);
        lblProceso.setLocation(2, 18);
        lblFrame.setLocation(2, 33);
        pnl.setVisible(true);
    }

    public int[] getPosicion(int id){
        int x = 10;
        int y = 15;
        for (int i = 0;i<id;i++){
            x+= 50;
            if ((i % 9) == 0){
                y+=50;
            }
        }
        int [] resu = {x,y};
        return resu;
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

    public void actualizarFrame() {
        Date now = new Date();
        this.modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);
    }

    public void modificarPV() {
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
        System.out.println("Fecha inicial: " + f1.modificado);
        f2.actualizarFrame();
        sleep(1000);
        f1.actualizarFrame();
        System.out.println("Fecha posterior: " + f1.modificado);
        int comp;
        System.out.println(comp = f1.modificado.compareTo(f2.modificado));

    }

};
