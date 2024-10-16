/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elecciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author UNIVALLE
 */
public class Interfaz extends javax.swing.JPanel implements ActionListener{

    public Interfaz(JComboBox<String> cbxascensos, JRadioButton rdbtndoctorado, JRadioButton rdbtnespecialista, JRadioButton rdbtnmagister, JRadioButton rdbtnprofesional, JRadioButton rdbtntecnico, JRadioButton rdbtntecnologo, JTextField txtdocumento, JTextField txtnombre, JTextArea txtresultado, JTextField txttiemposervicio) {
        this.cbxascensos = cbxascensos;
        this.rdbtndoctorado = rdbtndoctorado;
        this.rdbtnespecialista = rdbtnespecialista;
        this.rdbtnmagister = rdbtnmagister;
        this.rdbtnprofesional = rdbtnprofesional;
        this.rdbtntecnico = rdbtntecnico;
        this.rdbtntecnologo = rdbtntecnologo;
        this.txtdocumento = txtdocumento;
        this.txtnombre = txtnombre;
        this.txtresultado = txtresultado;
        
    }

    public ArrayList<String> getResultado() {
        return resultado;
    }

    public void setResultado(ArrayList<String> resultado) {
        this.resultado = resultado;
    }

    public ButtonGroup getBtngroup() {
        return btngroup;
    }

    public void setBtngroup(ButtonGroup btngroup) {
        this.btngroup = btngroup;
    }

    public JComboBox<String> getCbxtiemposervicio() {
        return cbxtiemposervicio;
    }

    public void setCbxtiemposervicio(JComboBox<String> cbxtiemposervicio) {
        this.cbxtiemposervicio = cbxtiemposervicio;
    }

    public Interfaz(ButtonGroup btngroup, JComboBox<String> cbxascensos, JComboBox<String> cbxtiemposervicio) {
        this.btngroup = btngroup;
        this.cbxascensos = cbxascensos;
        this.cbxtiemposervicio = cbxtiemposervicio;
    }
    ArrayList<String> resultado = new ArrayList<String>();
    
    

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public ButtonGroup getButtonGroup1() {
        return btngroup;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.btngroup = buttonGroup1;
    }
    

    public JComboBox<String> getCbxascensos() {
        return cbxascensos;
    }

    public void setCbxascensos(JComboBox<String> cbxascensos) {
        this.cbxascensos = cbxascensos;
    }

    public JRadioButton getRdbtndoctorado() {
        return rdbtndoctorado;
    }

    public void setRdbtndoctorado(JRadioButton rdbtndoctorado) {
        this.rdbtndoctorado = rdbtndoctorado;
    }

    public JRadioButton getRdbtnespecialista() {
        return rdbtnespecialista;
    }

    public void setRdbtnespecialista(JRadioButton rdbtnespecialista) {
        this.rdbtnespecialista = rdbtnespecialista;
    }

    public JRadioButton getRdbtnmagister() {
        return rdbtnmagister;
    }

    public void setRdbtnmagister(JRadioButton rdbtnmagister) {
        this.rdbtnmagister = rdbtnmagister;
    }

    public JRadioButton getRdbtnprofesional() {
        return rdbtnprofesional;
    }

    public void setRdbtnprofesional(JRadioButton rdbtnprofesional) {
        this.rdbtnprofesional = rdbtnprofesional;
    }

    public JRadioButton getRdbtntecnico() {
        return rdbtntecnico;
    }

    public void setRdbtntecnico(JRadioButton rdbtntecnico) {
        this.rdbtntecnico = rdbtntecnico;
    }

    public JRadioButton getRdbtntecnologo() {
        return rdbtntecnologo;
    }

    public void setRdbtntecnologo(JRadioButton rdbtntecnologo) {
        this.rdbtntecnologo = rdbtntecnologo;
    }

    public JTextField getTxtdocumento() {
        return txtdocumento;
    }

    public void setTxtdocumento(JTextField txtdocumento) {
        this.txtdocumento = txtdocumento;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextArea getTxtresultado() {
        return txtresultado;
    }

    public void setTxtresultado(JTextArea txtresultado) {
        this.txtresultado = txtresultado;
    }


    @Override
    public String toString() {
        return "Interfaz{" + "cbxascensos=" + cbxascensos + ", rdbtndoctorado=" + rdbtndoctorado + ", rdbtnespecialista=" + rdbtnespecialista + ", rdbtnmagister=" + rdbtnmagister + ", rdbtnprofesional=" + rdbtnprofesional + ", rdbtntecnico=" + rdbtntecnico + ", rdbtntecnologo=" + rdbtntecnologo + ", txtdocumento=" + txtdocumento + ", txtnombre=" + txtnombre + ", txtresultado=" + txtresultado + ", txttiemposervicio=" + txttiemposervicio + '}';
    }

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        rdbtntecnico = new javax.swing.JRadioButton();
        rdbtntecnologo = new javax.swing.JRadioButton();
        rdbtnprofesional = new javax.swing.JRadioButton();
        rdbtnespecialista = new javax.swing.JRadioButton();
        rdbtnmagister = new javax.swing.JRadioButton();
        rdbtndoctorado = new javax.swing.JRadioButton();
        cbxascensos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();
        cbxtiemposervicio = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("EMPRESA S.A.S");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nombre:");

        jLabel3.setText("N° Documento:");

        jLabel4.setText("Tiempo servicio:");

        jLabel5.setText("Nivel estudio:");

        jLabel6.setText("Cantidad ascensos:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Resultado:");

        txtnombre.setActionCommand("nombre");

        btngroup.add(rdbtntecnico);
        rdbtntecnico.setText("Técnico");
        rdbtntecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtntecnicoActionPerformed(evt);
            }
        });

        btngroup.add(rdbtntecnologo);
        rdbtntecnologo.setText("Tecnólogo");

        btngroup.add(rdbtnprofesional);
        rdbtnprofesional.setText("Profesional");

        btngroup.add(rdbtnespecialista);
        rdbtnespecialista.setText("Especialista");

        btngroup.add(rdbtnmagister);
        rdbtnmagister.setText("Magister");

        btngroup.add(rdbtndoctorado);
        rdbtndoctorado.setText("Doctorado");

        cbxascensos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1 - 2", "3 o más" }));
        cbxascensos.setActionCommand("cantidadascensos");

        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane1.setViewportView(txtresultado);

        cbxtiemposervicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxtiemposervicio.setActionCommand("tiemposervice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxascensos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxtiemposervicio, 0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtntecnico)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtntecnologo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnprofesional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnespecialista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnmagister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtndoctorado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxtiemposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtntecnico)
                    .addComponent(rdbtntecnologo)
                    .addComponent(rdbtnprofesional)
                    .addComponent(rdbtnespecialista)
                    .addComponent(rdbtnmagister)
                    .addComponent(rdbtndoctorado)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxascensos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Elección de candidatos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtntecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtntecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtntecnicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JComboBox<String> cbxascensos;
    private javax.swing.JComboBox<String> cbxtiemposervicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbtndoctorado;
    private javax.swing.JRadioButton rdbtnespecialista;
    private javax.swing.JRadioButton rdbtnmagister;
    private javax.swing.JRadioButton rdbtnprofesional;
    private javax.swing.JRadioButton rdbtntecnico;
    private javax.swing.JRadioButton rdbtntecnologo;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextArea txtresultado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        int count = 0;
        if(e.getActionCommand().equals("nombre")){
            resultado.add(e);
            JOptionPane.showConfirmDialog(txtnombre, e);
            //agregar a la arraylist
        }
        if(e.getActionCommand().equals("documento")){
            resultado.add(e);
            //agregar a la arraylist
        }
        if(e.getActionCommand().equals("tiemposervice")){
            //e*2; multiplicar el resultado por 2
            resultado.add(e);
        }
        if(e.getSource().equals(btngroup)){
            if(rdbtntecnico.isSelected()){
                count=2;
                //agregar a la arraylist
            }
            if(rdbtntecnologo.isSelected()){
                count=4;
                //agregar a la arraylist
            }
            if(rdbtnprofesional.isSelected()){
                count=8;
                //agregar a la arraylist
            }
            if(rdbtnespecialista.isSelected()){
                count=10;
                //agregar a la arraylist
            }
            if(rdbtnmagister.isSelected()){
                count=12;
                //agregar a la arraylist
            }
            if(rdbtndoctorado.isSelected()){
                count=15;
                //agregar a la arraylist
            }
            //si se selecciona 1..
        }
        if(e.getActionCommand().equals("cantidadascensos")){
            resultado.add(e);
            
        }
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
