/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.reparacion.Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author UNIVALLE
 */
public class VistaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
        initComponents();
        setVisible(true);
        
    }

    public VistaRegistro(JButton btnactualizarEquipos, JButton btnactualizarReparacion, JButton btnbuscarEquipos, JButton btnbuscarReparacion, JButton btnregistrarEquipos, JButton btnregistrarReparacion, JButton btnserialBusqued, JButton btntecnicoBusqueda, JComboBox<String> cbxestado, JComboBox<String> cbxestadoBusqueda, JTextArea txtareaBusqueda, JTextArea txtareadiagnostico, JTextArea txtarearealizado, JTextField txtcodigoreparacion, JTextField txtfechaingreso, JTextField txtfechasalida, JTextField txtmarca, JTextField txtmodelo, JTextField txtprocesador, JTextField txtram, JTextField txtserial, JTextField txtserialBusqueda, JTextField txttecnico, JTextField txttecnicoBusqueda) {
        this.btnactualizarEquipos = btnactualizarEquipos;
        this.btnactualizarReparacion = btnactualizarReparacion;
        this.btnbuscarEquipos = btnbuscarEquipos;
        this.btnbuscarReparacion = btnbuscarReparacion;
        this.btnregistrarEquipos = btnregistrarEquipos;
        this.btnregistrarReparacion = btnregistrarReparacion;
        this.btnserialBusqued = btnserialBusqued;
        this.btntecnicoBusqueda = btntecnicoBusqueda;
        this.cbxestado = cbxestado;
        this.cbxestadoBusqueda = cbxestadoBusqueda;
        this.txtareaBusqueda = txtareaBusqueda;
        this.txtareadiagnostico = txtareadiagnostico;
        this.txtarearealizado = txtarearealizado;
        this.txtcodigoreparacion = txtcodigoreparacion;
        this.txtfechaingreso = txtfechaingreso;
        this.txtfechasalida = txtfechasalida;
        this.txtmarca = txtmarca;
        this.txtmodelo = txtmodelo;
        this.txtprocesador = txtprocesador;
        this.txtram = txtram;
        this.txtserial = txtserial;
        this.txtserialBusqueda = txtserialBusqueda;
        this.txttecnico = txttecnico;
        this.txttecnicoBusqueda = txttecnicoBusqueda;
    }

    @Override
    public String toString() {
        return "VistaRegistro{" + "btnactualizarEquipos=" + btnactualizarEquipos + ", btnactualizarReparacion=" + btnactualizarReparacion + ", btnbuscarEquipos=" + btnbuscarEquipos + ", btnbuscarReparacion=" + btnbuscarReparacion + ", btnregistrarEquipos=" + btnregistrarEquipos + ", btnregistrarReparacion=" + btnregistrarReparacion + ", btnserialBusqued=" + btnserialBusqued + ", btntecnicoBusqueda=" + btntecnicoBusqueda + ", cbxestado=" + cbxestado + ", cbxestadoBusqueda=" + cbxestadoBusqueda + ", cbxtipo=" + cbxtipo + ", txtareaBusqueda=" + txtareaBusqueda + ", txtareadiagnostico=" + txtareadiagnostico + ", txtarearealizado=" + txtarearealizado + ", txtcodigoreparacion=" + txtcodigoreparacion + ", txtfechaingreso=" + txtfechaingreso + ", txtfechasalida=" + txtfechasalida + ", txtmarca=" + txtmarca + ", txtmodelo=" + txtmodelo + ", txtprocesador=" + txtprocesador + ", txtram=" + txtram + ", txtserial=" + txtserial + ", txtserialBusqueda=" + txtserialBusqueda + ", txttecnico=" + txttecnico + ", txttecnicoBusqueda=" + txttecnicoBusqueda + '}';
    }

    public JButton getBtnactualizarEquipos() {
        return btnactualizarEquipos;
    }

    public void setBtnactualizarEquipos(JButton btnactualizarEquipos) {
        this.btnactualizarEquipos = btnactualizarEquipos;
    }

    public JButton getBtnactualizarReparacion() {
        return btnactualizarReparacion;
    }

    public void setBtnactualizarReparacion(JButton btnactualizarReparacion) {
        this.btnactualizarReparacion = btnactualizarReparacion;
    }

    public JButton getBtnbuscarEquipos() {
        return btnbuscarEquipos;
    }

    public void setBtnbuscarEquipos(JButton btnbuscarEquipos) {
        this.btnbuscarEquipos = btnbuscarEquipos;
    }

    public JButton getBtnbuscarReparacion() {
        return btnbuscarReparacion;
    }

    public void setBtnbuscarReparacion(JButton btnbuscarReparacion) {
        this.btnbuscarReparacion = btnbuscarReparacion;
    }

    public JButton getBtnregistrarEquipos() {
        return btnregistrarEquipos;
    }

    public void setBtnregistrarEquipos(JButton btnregistrarEquipos) {
        this.btnregistrarEquipos = btnregistrarEquipos;
    }

    public JButton getBtnregistrarReparacion() {
        return btnregistrarReparacion;
    }

    public void setBtnregistrarReparacion(JButton btnregistrarReparacion) {
        this.btnregistrarReparacion = btnregistrarReparacion;
    }

    public JButton getBtnserialBusqued() {
        return btnserialBusqued;
    }

    public void setBtnserialBusqued(JButton btnserialBusqued) {
        this.btnserialBusqued = btnserialBusqued;
    }

    public JButton getBtntecnicoBusqueda() {
        return btntecnicoBusqueda;
    }

    public void setBtntecnicoBusqueda(JButton btntecnicoBusqueda) {
        this.btntecnicoBusqueda = btntecnicoBusqueda;
    }

    public JComboBox<String> getCbxestado() {
        return cbxestado;
    }

    public void setCbxestado(JComboBox<String> cbxestado) {
        this.cbxestado = cbxestado;
    }

    public JComboBox<String> getCbxestadoBusqueda() {
        return cbxestadoBusqueda;
    }

    public void setCbxestadoBusqueda(JComboBox<String> cbxestadoBusqueda) {
        this.cbxestadoBusqueda = cbxestadoBusqueda;
    }

    public JComboBox<String> getCbxtipo() {
        return cbxtipo;
    }

    public void setCbxtipo(JComboBox<String> cbxtipo) {
        this.cbxtipo = cbxtipo;
    }

    public JTextArea getTxtareaBusqueda() {
        return txtareaBusqueda;
    }

    public void setTxtareaBusqueda(JTextArea txtareaBusqueda) {
        this.txtareaBusqueda = txtareaBusqueda;
    }

    public JTextArea getTxtareadiagnostico() {
        return txtareadiagnostico;
    }

    public void setTxtareadiagnostico(JTextArea txtareadiagnostico) {
        this.txtareadiagnostico = txtareadiagnostico;
    }

    public JTextArea getTxtarearealizado() {
        return txtarearealizado;
    }

    public void setTxtarearealizado(JTextArea txtarearealizado) {
        this.txtarearealizado = txtarearealizado;
    }

    public JTextField getTxtcodigoreparacion() {
        return txtcodigoreparacion;
    }

    public void setTxtcodigoreparacion(JTextField txtcodigoreparacion) {
        this.txtcodigoreparacion = txtcodigoreparacion;
    }

    public JTextField getTxtfechaingreso() {
        return txtfechaingreso;
    }

    public void setTxtfechaingreso(JTextField txtfechaingreso) {
        this.txtfechaingreso = txtfechaingreso;
    }

    public JTextField getTxtfechasalida() {
        return txtfechasalida;
    }

    public void setTxtfechasalida(JTextField txtfechasalida) {
        this.txtfechasalida = txtfechasalida;
    }

    public JTextField getTxtmarca() {
        return txtmarca;
    }
                 
    public void setTxtmarca(JTextField txtmarca) {
        this.txtmarca = txtmarca;
    }

    public JTextField getTxtmodelo() {
        return txtmodelo;
    }

    public void setTxtmodelo(JTextField txtmodelo) {
        this.txtmodelo = txtmodelo;
    }

    public JTextField getTxtprocesador() {
        return txtprocesador;
    }

    public void setTxtprocesador(JTextField txtprocesador) {
        this.txtprocesador = txtprocesador;
    }

    public JTextField getTxtram() {
        return txtram;
    }

    public void setTxtram(JTextField txtram) {
        this.txtram = txtram;
    }

    public JTextField getTxtserial() {
        return txtserial;
    }

    public void setTxtserial(JTextField txtserial) {
        this.txtserial = txtserial;
    }

    public JTextField getTxtserialBusqueda() {
        return txtserialBusqueda;
    }

    public void setTxtserialBusqueda(JTextField txtserialBusqueda) {
        this.txtserialBusqueda = txtserialBusqueda;
    }

    public JTextField getTxttecnico() {
        return txttecnico;
    }

    public void setTxttecnico(JTextField txttecnico) {
        this.txttecnico = txttecnico;
    }

    public JTextField getTxttecnicoBusqueda() {
        return txttecnicoBusqueda;
    }

    public void setTxttecnicoBusqueda(JTextField txttecnicoBusqueda) {
        this.txttecnicoBusqueda = txttecnicoBusqueda;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtserial = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtprocesador = new javax.swing.JTextField();
        cbxtipo = new javax.swing.JComboBox<>();
        txtram = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnregistrarEquipos = new javax.swing.JButton();
        btnbuscarEquipos = new javax.swing.JButton();
        btnactualizarEquipos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaBusqueda = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtcodigoreparacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnactualizarReparacion = new javax.swing.JButton();
        btnregistrarReparacion = new javax.swing.JButton();
        btnbuscarReparacion = new javax.swing.JButton();
        cbxestado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarearealizado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareadiagnostico = new javax.swing.JTextArea();
        txttecnico = new javax.swing.JTextField();
        txtfechasalida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtfechaingreso = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbxestadoBusqueda = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        btntecnicoBusqueda = new javax.swing.JButton();
        btnserialBusqued = new javax.swing.JButton();
        txttecnicoBusqueda = new javax.swing.JTextField();
        txtserialBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Gestión Equipos");

        txtserial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserialActionPerformed(evt);
            }
        });

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });

        txtprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprocesadorActionPerformed(evt);
            }
        });

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", " " }));

        txtram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtramActionPerformed(evt);
            }
        });

        jLabel3.setText("Serial:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Marca:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Ram:");

        jLabel8.setText("Procesador:");

        btnregistrarEquipos.setText("Registrar");

        btnbuscarEquipos.setText("Buscar");
        btnbuscarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarEquiposActionPerformed(evt);
            }
        });

        btnactualizarEquipos.setText("Actualizar");
        btnactualizarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarEquiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtserial)
                                    .addComponent(txtmarca)
                                    .addComponent(txtmodelo)
                                    .addComponent(cbxtipo, 0, 101, Short.MAX_VALUE))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnregistrarEquipos)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarEquipos)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnactualizarEquipos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarEquipos)
                    .addComponent(btnbuscarEquipos))
                .addGap(18, 18, 18)
                .addComponent(btnactualizarEquipos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtareaBusqueda.setColumns(20);
        txtareaBusqueda.setRows(5);
        jScrollPane2.setViewportView(txtareaBusqueda);

        jLabel1.setText("Registro de reparación:");

        jLabel9.setText("Gestión reparaciones");

        txtcodigoreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoreparacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Código Reparación:");

        jLabel11.setText("Fecha Ingreso");

        jLabel12.setText("Tecnico asignado:");

        jLabel13.setText("Equipo:");

        jLabel14.setText("Diagnostico");

        jLabel15.setText("Trabajo realizado:");

        jLabel16.setText("Estado:");

        btnactualizarReparacion.setText("Actualizar");
        btnactualizarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarReparacionActionPerformed(evt);
            }
        });

        btnregistrarReparacion.setText("Registrar");

        btnbuscarReparacion.setText("Buscar");
        btnbuscarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarReparacionActionPerformed(evt);
            }
        });

        cbxestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso", "Realizado", "Cancelado" }));
        cbxestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadoActionPerformed(evt);
            }
        });

        txtarearealizado.setColumns(20);
        txtarearealizado.setRows(5);
        jScrollPane1.setViewportView(txtarearealizado);

        txtareadiagnostico.setColumns(20);
        txtareadiagnostico.setRows(5);
        jScrollPane3.setViewportView(txtareadiagnostico);

        txttecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttecnicoActionPerformed(evt);
            }
        });

        txtfechasalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechasalidaActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha Salida");

        txtfechaingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaingresoActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(209, 209, 209)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigoreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnbuscarReparacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnactualizarReparacion)))
                        .addGap(170, 170, 170))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(btnregistrarReparacion)
                    .addContainerGap(354, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGap(280, 280, 280)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigoreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizarReparacion)
                    .addComponent(btnbuscarReparacion))
                .addGap(4, 4, 4))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(304, Short.MAX_VALUE)
                    .addComponent(btnregistrarReparacion)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Busqueda reparaciones:");

        jLabel19.setText("Serial equipo: ");

        jLabel20.setText("Tecnico:");

        jLabel21.setText("Estado");

        cbxestadoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso", "Realizado", "Cancelado" }));
        cbxestadoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadoBusquedaActionPerformed(evt);
            }
        });

        jButton7.setText("...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btntecnicoBusqueda.setText("...");
        btntecnicoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntecnicoBusquedaActionPerformed(evt);
            }
        });

        btnserialBusqued.setText("...");
        btnserialBusqued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserialBusquedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(352, 352, 352)
                            .addComponent(jLabel18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtserialBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnserialBusqued, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttecnicoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntecnicoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(cbxestadoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(cbxestadoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(btntecnicoBusqueda)
                    .addComponent(btnserialBusqued)
                    .addComponent(txttecnicoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtserialBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtserialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserialActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void txtprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprocesadorActionPerformed

    private void txtramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtramActionPerformed

    private void btnbuscarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarEquiposActionPerformed

    private void btnactualizarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarEquiposActionPerformed

    private void btnbuscarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarReparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarReparacionActionPerformed

    private void btnactualizarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarReparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarReparacionActionPerformed

    private void txtcodigoreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoreparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoreparacionActionPerformed

    private void cbxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestadoActionPerformed

    private void txttecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttecnicoActionPerformed

    private void txtfechasalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechasalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechasalidaActionPerformed

    private void txtfechaingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaingresoActionPerformed

    private void cbxestadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestadoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestadoBusquedaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btntecnicoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntecnicoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntecnicoBusquedaActionPerformed

    private void btnserialBusquedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserialBusquedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnserialBusquedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarEquipos;
    private javax.swing.JButton btnactualizarReparacion;
    private javax.swing.JButton btnbuscarEquipos;
    private javax.swing.JButton btnbuscarReparacion;
    private javax.swing.JButton btnregistrarEquipos;
    private javax.swing.JButton btnregistrarReparacion;
    private javax.swing.JButton btnserialBusqued;
    private javax.swing.JButton btntecnicoBusqueda;
    private javax.swing.JComboBox<String> cbxestado;
    private javax.swing.JComboBox<String> cbxestadoBusqueda;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtareaBusqueda;
    private javax.swing.JTextArea txtareadiagnostico;
    private javax.swing.JTextArea txtarearealizado;
    private javax.swing.JTextField txtcodigoreparacion;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txtfechasalida;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtprocesador;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txtserial;
    private javax.swing.JTextField txtserialBusqueda;
    private javax.swing.JTextField txttecnico;
    private javax.swing.JTextField txttecnicoBusqueda;
    // End of variables declaration//GEN-END:variables
}
