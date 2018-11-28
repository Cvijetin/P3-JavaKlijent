/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaOperater;
import ffos.model.Operater;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tjakopec
 */
public class FormaOperateri extends javax.swing.JFrame {

    private ObradaOperater obrada;
    private Operater operater;

    /**
     * Creates new form FormaOperateri
     */
    public FormaOperateri() {
        initComponents();
        obrada = new ObradaOperater();
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOperateri = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        txtLokacija = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOsoba = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Temperatura");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lstOperateri.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOperateriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstOperateri);

        jLabel2.setText("Lokacija");

        jLabel3.setText("Datum");

        jLabel6.setText("Osoba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtLokacija)
                    .addComponent(jLabel3)
                    .addComponent(txtDatum)
                    .addComponent(jLabel4)
                    .addComponent(txtTemperatura)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(29, 29, 29)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(txtOsoba))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(txtOsoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstOperateriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOperateriValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        operater = (Operater) lstOperateri.getSelectedValue();
        if (operater == null) {
            return;
        }
        txtLokacija.setText(operater.getLokacija());
        txtDatum.setText(operater.getDatum() + "");
        txtTemperatura.setText(operater.getTemperatura()+"");
        txtOsoba.setText(operater.getOsoba());
        


    }//GEN-LAST:event_lstOperateriValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        operater = new Operater();
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        operater.setLokacija(txtLokacija.getText());
        try {
            operater.setDatum(df.parse(txtDatum.getText()));
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(getRootPane(), "Niste unijeli dobar datum");
        }
        operater.setTemperatura(Integer.parseInt(txtTemperatura.getText()));
       operater.setOsoba(txtOsoba.getText());
        
        obrada.dodajOperatera(operater);
        ucitaj();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        operater.setLokacija(txtLokacija.getText());
        try {
            operater.setDatum(df.parse(txtDatum.getText()));
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(getRootPane(), "Niste unijeli dobar datum");
        }
        operater.setTemperatura(Integer.parseInt(txtTemperatura.getText()));
       operater.setOsoba(txtOsoba.getText());
        

        obrada.promijeniOperatera(operater);
        ucitaj();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        obrada.obrisiOperatera(operater);
        ucitaj();
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstOperateri;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtLokacija;
    private javax.swing.JTextField txtOsoba;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        DefaultListModel<Operater> m = new DefaultListModel<>();
        obrada.getOperateri().stream().forEach((o) -> {
            m.addElement(o);
        });
        lstOperateri.setModel(m);
    }

    private void trazi(String uvjet) {
        DefaultListModel<Operater> m = new DefaultListModel<>();
        obrada.getOperateri(uvjet).stream().forEach((o) -> {
            m.addElement(o);
        });
        lstOperateri.setModel(m);
    }
}
