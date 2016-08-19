/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author jtorres61
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroUno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbOperacion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel1.setText("SUMAS DE DOS NUMEROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setText("Numero Uno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNumeroUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, -1));

        jLabel3.setText("Numero Dos ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtNumeroDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDosActionPerformed(evt);
            }
        });
        txtNumeroDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, -1));

        jLabel4.setText("Resultado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        txtResultado.setEditable(false);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel5.setText("Operación");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        String  num1, num2, res;
        double n1,n2,resultado = 0;
        int op = 0;
        
        
        if (txtNumeroUno.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el numero uno", "Error",JOptionPane.ERROR_MESSAGE);
        txtNumeroUno.requestFocusInWindow();
        } else if (txtNumeroDos.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el numero dos", "Error",JOptionPane.ERROR_MESSAGE);
        txtNumeroDos.requestFocusInWindow();
        
        
        }else {
        
            
        
        n1= Double.parseDouble(txtNumeroUno.getText());
        n2 =Double.parseDouble(txtNumeroDos.getText());
        op = cmbOperacion.getSelectedIndex();
        
        if (op ==3 && n2 == 0){
          JOptionPane.showMessageDialog(this, "No digite cero en el segundo número", "Error",JOptionPane.ERROR_MESSAGE); 
            txtNumeroDos.requestFocusInWindow();
            txtNumeroDos.selectAll();
        } else {
        switch (op){
            case 0:
                resultado = n1 + n2;
                
                break;
                
            case 1:
                
                resultado = n1-n2;
                
                break;
                
            case 2:
                resultado = n1*n2;
                
                break;
             
            case 4:
                resultado = n1/n2;
                
                break;
    
    }
        }
         res= String.valueOf(resultado);
         txtResultado.setText(res);
        } 
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
        
        txtNumeroUno.setText("");
        txtNumeroDos.setText("");
        txtResultado.setText("");
        
        txtNumeroUno.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        
       
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeroUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroUnoKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
          } 
    }//GEN-LAST:event_txtNumeroUnoKeyTyped

    private void txtNumeroDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDosActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_txtNumeroDosActionPerformed

    private void txtNumeroDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDosKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtNumeroDosKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumeroDos;
    private javax.swing.JTextField txtNumeroUno;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
