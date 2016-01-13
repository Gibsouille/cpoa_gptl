package app;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modele.Planning;

public class Fenetre extends javax.swing.JFrame {

    private Planning modelePlanning;
    
    public Fenetre(Planning modelePlanning) {
        this.modelePlanning = modelePlanning;
        this.initComponents();  // dans planning : entourer les rsEquipe.next() par des if
        try {
            modelePlanning.charger();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanPlanning = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlanning = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabType = new javax.swing.JLabel();
        jComBoxType = new javax.swing.JComboBox<>();
        jBtnGenerer = new javax.swing.JButton();
        jPanMatchs = new javax.swing.JPanel();
        jPanPersonnel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePlanning.setModel(modelePlanning);
        jTablePlanning.setCellSelectionEnabled(true);
        jTablePlanning.getTableHeader().setResizingAllowed(false);
        jTablePlanning.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePlanning);

        jLabType.setText("Type");

        jComBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qualifications", "Tournois (simple)", "Tournois (double)" }));
        jComBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBoxTypeActionPerformed(evt);
            }
        });

        jBtnGenerer.setText("Générer Planning");
        jBtnGenerer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGenererActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnGenerer)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabType)
                    .addComponent(jComBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGenerer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanPlanningLayout = new javax.swing.GroupLayout(jPanPlanning);
        jPanPlanning.setLayout(jPanPlanningLayout);
        jPanPlanningLayout.setHorizontalGroup(
            jPanPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanPlanningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanPlanningLayout.setVerticalGroup(
            jPanPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanPlanningLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Planning", jPanPlanning);

        javax.swing.GroupLayout jPanMatchsLayout = new javax.swing.GroupLayout(jPanMatchs);
        jPanMatchs.setLayout(jPanMatchsLayout);
        jPanMatchsLayout.setHorizontalGroup(
            jPanMatchsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        jPanMatchsLayout.setVerticalGroup(
            jPanMatchsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Entraînement", jPanMatchs);

        javax.swing.GroupLayout jPanPersonnelLayout = new javax.swing.GroupLayout(jPanPersonnel);
        jPanPersonnel.setLayout(jPanPersonnelLayout);
        jPanPersonnelLayout.setHorizontalGroup(
            jPanPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        jPanPersonnelLayout.setVerticalGroup(
            jPanPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Personnel", jPanPersonnel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGenererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGenererActionPerformed
        /*try {
            jBtnGenerer.setEnabled(false);
        } catch () {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jBtnGenererActionPerformed

    private void jComBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBoxTypeActionPerformed
        if (this.jComBoxType.getSelectedItem().equals("Qualifications")) {
            this.modelePlanning.setType("Qualifications");
            this.modelePlanning.fireTableStructureChanged();
        }
        else if (this.jComBoxType.getSelectedItem().equals("Tournois (simple)")) {
            this.modelePlanning.setType("Tournois (simple)");
            this.modelePlanning.fireTableStructureChanged();
        }
        else {
            this.modelePlanning.setType("Tournois (double)");
            this.modelePlanning.fireTableStructureChanged();
        }
    }//GEN-LAST:event_jComBoxTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGenerer;
    private javax.swing.JComboBox<String> jComBoxType;
    private javax.swing.JLabel jLabType;
    private javax.swing.JPanel jPanMatchs;
    private javax.swing.JPanel jPanPersonnel;
    private javax.swing.JPanel jPanPlanning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTablePlanning;
    // End of variables declaration//GEN-END:variables
}
