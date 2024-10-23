/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author UNIVALLE
 */
public class HiloGrafico extends Thread {
    
    Ventana v;
    public HiloGrafico(Ventana v){
        //no se crea una new instace porque debo llamar la que ya se tiene
        this.v = v;
    }
    
    @Override
    public void run() {
        
        
        
        
        //el repaint limpia todo del contenedor
        while(true) {
            v.getContenedor().repaint(50,50,50,50);
            try {
                sleep(1000);
                //v.getContenedor().repaint(50, 100, 50, 50);
            }catch (InterruptedException ex){
            }
            v.getContenedor().repaint(50, 100, 50, 50);
            try {
                sleep(2000);
                //v.getContenedor().repaint(50, 100, 50, 50);
            }catch (InterruptedException ex){
            }
            v.getContenedor().repaint(50, 150, 50, 50);
            try {
                sleep(3000);
                //v.getContenedor().repaint(50, 100, 50, 50);
            }catch (InterruptedException ex){
            }
            
            
        }
                
    }
}

    

