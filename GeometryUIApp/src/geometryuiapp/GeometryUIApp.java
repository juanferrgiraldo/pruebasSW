/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryuiapp;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author juan.giraldo49
 */
public class GeometryUIApp extends javax.swing.JFrame {

   CheckShape shape = new CheckShape();
    
    public GeometryUIApp() {
        initComponents();
        setTitle ("Figuras Geométricas");
        this.setResizable(false);
        side1.setEditable(false);
        side2.setEditable(false);
        side3.setEditable(false);
        side4.setEditable(false);
        result.setVisible(false);
        checkButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side1 = new javax.swing.JTextField();
        side2 = new javax.swing.JTextField();
        side3 = new javax.swing.JTextField();
        side4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        triangleSelector = new javax.swing.JRadioButton();
        squareSelector = new javax.swing.JRadioButton();
        checkButton = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clean = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side1.setPreferredSize(new java.awt.Dimension(60, 27));
        side1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                side1ActionPerformed(evt);
            }
        });

        side3.setPreferredSize(new java.awt.Dimension(60, 27));

        side4.setPreferredSize(new java.awt.Dimension(60, 27));

        jLabel1.setText("Lado 1");

        jLabel2.setText("Lado 2");

        jLabel3.setText("Lado 3");

        jLabel4.setText("Lado 4");

        triangleSelector.setText("Triángulo");
        triangleSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleSelectorActionPerformed(evt);
            }
        });

        squareSelector.setText("Cuadrado");
        squareSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareSelectorActionPerformed(evt);
            }
        });

        checkButton.setText("Verificar");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Resultado");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Seleccione una figura e ingrese");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("el tamaño de los lados");

        clean.setText("Limpiar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("en números enteros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(triangleSelector)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(squareSelector))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel7))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkButton)
                                .addGap(45, 45, 45)
                                .addComponent(clean))
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triangleSelector)
                    .addComponent(squareSelector))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkButton)
                    .addComponent(clean))
                .addGap(30, 30, 30)
                .addComponent(result)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void side1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_side1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_side1ActionPerformed

    private void triangleSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleSelectorActionPerformed
        // TODO add your handling code here:        
        isSelected(triangleSelector, squareSelector, 3);
        checkButton.setEnabled(true);
    }//GEN-LAST:event_triangleSelectorActionPerformed

    private void squareSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareSelectorActionPerformed
        // TODO add your handling code here:       
        isSelected(squareSelector, triangleSelector, 4);
        checkButton.setEnabled(true);
    }//GEN-LAST:event_squareSelectorActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        try {
            int [] sidesVec;
            int length;
            String shapeType = "Es: ";
            if(!squareSelector.isSelected() && !triangleSelector.isSelected()) {
                JOptionPane.showMessageDialog(null, "Asegúrate de seleccionar una figura", "Tipo de figura no seleccionada", JOptionPane.INFORMATION_MESSAGE);
            //deleteAll()
               return;
            } else if(squareSelector.isSelected()) {
                length = 4;
                sidesVec = new int[length];
                sidesVec = getValues(length);
                shapeType = shapeType + shape.isCuadrilateral(sidesVec);
            } else if(triangleSelector.isSelected()) {
                length = 3;
                sidesVec = new int[length];
                sidesVec = getValues(length);
                shape.isTriangle(sidesVec);
                shapeType = shapeType + shape.isTriangle(sidesVec);
            }
            checkButton.setEnabled(false);
            squareSelector.setEnabled(false);
            triangleSelector.setEnabled(false);
            blockTextInput();
            result.setVisible(true);
            result.setText(shapeType);   
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Los caracteres ingresados nos son permitidos " + e.getMessage(), "Campos no válidos", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_checkButtonActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        // TODO add your handling code here:
        deleteAll();
        blockTextInput();
        reset();
    }//GEN-LAST:event_cleanActionPerformed

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
            java.util.logging.Logger.getLogger(GeometryUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeometryUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeometryUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeometryUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeometryUIApp().setVisible(true);                
            }
        });
    }
    
    public void deleteAll() {        
        side1.setText(null);
        side2.setText(null);
        side3.setText(null);
        side4.setText(null);        
    }
    
    public void isSelected(JRadioButton selectedB, JRadioButton notSelectedButton, int sides) {
        if(selectedB.isSelected()) {
            side1.setEditable(true);
            side2.setEditable(true);
            side3.setEditable(true);
            if(sides == 4) {
             side4.setEditable(true);   
            }            
            notSelectedButton.setEnabled(false);
        }
        if(!selectedB.isSelected()){
            notSelectedButton.setEnabled(true);
            side1.setEditable(false);
            side2.setEditable(false);
            side3.setEditable(false);
            side4.setEditable(false);            
        }
    }
    
    public int[] getValues(int length) {
        int[] sidesVec;       
        sidesVec = new int[length];
        sidesVec[0] = Integer.parseInt(side1.getText());
        sidesVec[1] = Integer.parseInt(side2.getText());
        sidesVec[2] = Integer.parseInt(side3.getText());
        if(length == 4) {
            sidesVec[3] = Integer.parseInt(side4.getText());   
        }
        return sidesVec;
        
    }
    
    public void reset() {
        triangleSelector.setSelected(false);
        triangleSelector.setEnabled(true);
        squareSelector.setSelected(false);
        squareSelector.setEnabled(true);
        result.setText(null);
        result.setVisible(false);        
    }
    
    public void blockTextInput(){        
        side1.setEditable(false);
        side2.setEditable(false);
        side3.setEditable(false);
        side4.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JButton clean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel result;
    private javax.swing.JTextField side1;
    private javax.swing.JTextField side2;
    private javax.swing.JTextField side3;
    private javax.swing.JTextField side4;
    private javax.swing.JRadioButton squareSelector;
    private javax.swing.JRadioButton triangleSelector;
    // End of variables declaration//GEN-END:variables
}
