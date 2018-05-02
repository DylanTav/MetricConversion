/*
This program was created by Dylan T
It was created on May 1st, 2018
This program is a converts Imperial to Metric
 */

package MetricConversion;


public class MetricConversion extends javax.swing.JFrame {

    
    public MetricConversion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        labelInchesToCenti = new javax.swing.JLabel();
        labelFeetToCenti = new javax.swing.JLabel();
        labelYardsToMetres = new javax.swing.JLabel();
        labelMilestoKilo = new javax.swing.JLabel();
        labelConvertMethod = new javax.swing.JLabel();
        labelDataEntry = new javax.swing.JLabel();
        textConvertMet = new javax.swing.JTextField();
        textData = new javax.swing.JTextField();
        buttonConvert = new javax.swing.JButton();
        labelOutputMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelHeader.setText("Metric Conversion");

        labelInchesToCenti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelInchesToCenti.setText("1. Inches to Centimeters");

        labelFeetToCenti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFeetToCenti.setText("2. Feet to Centimeters ");

        labelYardsToMetres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelYardsToMetres.setText("3. Yards to Meters");

        labelMilestoKilo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMilestoKilo.setText("4. Miles to Kilometers");

        labelConvertMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelConvertMethod.setText("Enter the Conversion Method (1-4):");

        labelDataEntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataEntry.setText("Enter Value to be Converted:");

        textConvertMet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConvertMetActionPerformed(evt);
            }
        });

        buttonConvert.setText("Convert");
        buttonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertActionPerformed(evt);
            }
        });

        labelOutputMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelConvertMethod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDataEntry)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textData, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(textConvertMet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonConvert)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(labelOutputMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelInchesToCenti)
                            .addComponent(labelHeader)
                            .addComponent(labelFeetToCenti)
                            .addComponent(labelYardsToMetres)
                            .addComponent(labelMilestoKilo))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInchesToCenti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFeetToCenti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelYardsToMetres)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMilestoKilo)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textConvertMet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelConvertMethod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(buttonConvert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelOutputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textConvertMetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConvertMetActionPerformed
    
    }//GEN-LAST:event_textConvertMetActionPerformed

    private void buttonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertActionPerformed
    int convertMethod;
    double value;
    convertMethod = Integer.parseInt(textConvertMet.getText());
    
    value = Double.parseDouble(textData.getText());
    
    if (convertMethod == 1){
        labelOutputMessage.setText(value + "Inches is equal to " + inchesToCentimetres(value) + " Centimeters");
    }
    
    if(convertMethod == 2){
        labelOutputMessage.setText(value + "Feet is equal to " + feetToCentimetres(value) + "Centimetres");
    }
    
    }//GEN-LAST:event_buttonConvertActionPerformed

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
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetricConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetricConversion().setVisible(true);
            }
        });
    }
    
    /**
     * Converts from inches to centimeters
     * Pre: none
     * Post: outputMessage returned
     */
    private double inchesToCentimetres(double value){
              
        double answer;
        answer = value * 2.54;
                
        return answer;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelConvertMethod;
    private javax.swing.JLabel labelDataEntry;
    private javax.swing.JLabel labelFeetToCenti;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelInchesToCenti;
    private javax.swing.JLabel labelMilestoKilo;
    private javax.swing.JLabel labelOutputMessage;
    private javax.swing.JLabel labelYardsToMetres;
    private javax.swing.JTextField textConvertMet;
    private javax.swing.JTextField textData;
    // End of variables declaration//GEN-END:variables
}
