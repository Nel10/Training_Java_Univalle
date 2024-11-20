/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reparacion.Controlador;

import com.mycompany.reparacion.Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author UNIVALLE
 */
public class ControladorGestionReparacion implements ActionListener{
    VistaRegistro vista;

    public ControladorGestionReparacion() {
        String codigoReparacion = vista.getTxtcodigoreparacion().getText();
        String fechaIngreso = vista.getTxtfechaingreso().getText();
        String fechaSalida = vista.getTxtfechasalida().getText();
        //String pc = vista.ge
        String diagnostico = vista.getTxtareadiagnostico().getText();
        String trabajoRealizado = vista.getTxtarearealizado().getText();
        String tecnico = vista.getTxttecnico().getText();
        //String estado = vista.getCbxestado();
        vista.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
