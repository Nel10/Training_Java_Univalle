/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reparacion.Controlador;

import com.mycompany.reparacion.Modelo.ModeloGestionEquipos;
import com.mycompany.reparacion.Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author UNIVALLE
 */
public class ControladorGestionEquipos implements ActionListener {
    VistaRegistro vista;
    ModeloGestionEquipos modeloGEquipos;
    ArrayList<String> gestionEquipos;

    public ControladorGestionEquipos() {
        vista.setVisible(true);
        String serial = vista.getTxtserial().getText();
        String marca = vista.getTxtmarca().getText();
        String modelo = vista.getTxtmodelo().getText();
        String Tipo = vista.getCbxtipo().getItemAt(0);
        //int ram = String.valueOf(vista.getTxtram());
        String procesador = vista.getTxtprocesador().getText();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Registrar")){
            System.out.println("registro");
        }

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
