/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Producto;
import Vista.GestionProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author UNIVALLE
 */
public class ControlProducto implements ActionListener {
    
    Producto p;
    String nombre;
    //vista de gestion productos JFRAME
    GestionProducto gp;
    //Array con los productos que se crearan
    ArrayList<Producto> productos = new ArrayList<Producto>();

    public ControlProducto() {
        gp = new GestionProducto();
        gp.setVisible(true);
        gp.getBtnbuscar().addActionListener(this);
        gp.getBtnedicion().addActionListener(this);
        gp.getBtnregistro().addActionListener(this);
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("registro producto")){    
            String nombre = gp.getTxtnombre().getText();//llamar al metodo gettext 
            int precio = Integer.parseInt(gp.getTxtprecio().getText());
            int stock = Integer.parseInt(gp.getTxtstock().getText());
            
            p = new Producto(nombre,precio,stock); //creo el producto
            productos.add(p);//lo agrego al arraylist
            
            //mostrar en el text area el listado
            gp.getTxtlistado().setText(productos.toString());
            
        }
        if(e.getActionCommand().equals("buscar producto")){
            nombre = gp.getTxtnombre().getText();
            for(Producto pr : productos){
                if(nombre.equals(pr.getNombre())){
                    //valueof por el tipo de dato int
                    gp.getTxtprecio().setText(String.valueOf(pr.getPrecio()));
                    gp.getTxtstock().setText(String.valueOf(pr.getStock()));
                }
            }
        }
        if(e.getActionCommand().equals("edicion producto")){
            String n = gp.getTxtnombre().getText();
            int precio = Integer.parseInt(gp.getTxtprecio().getText());
            int stock = Integer.parseInt(gp.getTxtstock().getText());
            
            for(Producto pr : productos){
                if(nombre.equals(pr.getNombre())){
                    pr.setNombre(n);
                    pr.setPrecio(precio);
                    pr.setStock(stock);
                }
            }
            gp.getTxtlistado().setText(productos.toString());
        }
        
    }
}
