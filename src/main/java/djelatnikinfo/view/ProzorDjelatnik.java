/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package djelatnikinfo.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import djelatnikinfo.controller.ObradaDjelatnik;
import djelatnikinfo.model.Djelatnik;
import djelatnikinfo.util.AppException;
import djelatnikinfo.util.Pomocno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Alen
 */
public class ProzorDjelatnik extends javax.swing.JFrame {

    private ObradaDjelatnik obrada;
    private int selectedIndex;

    /**
     * Creates new form ProzorDjelatnici
     */
    public ProzorDjelatnik() {
        initComponents();
        obrada = new ObradaDjelatnik();
        selectedIndex = 0;
        postavke();
        ucitaj();
    }

    private void postavke() {
        setTitle(Pomocno.NAZIV_APLIKACIJE + " Djelatnici");
      //  btnObrisi.setVisible(false);
        prilagodiDatePicker();

    }

    private void prilagodiDatePicker() {
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra(Pomocno.FORMAT_DATUMA);
        dps.setTranslationClear("Ocisti");
        dps.setTranslationToday("Danas");
        dpPocetakRada.setSettings(dps);

    }

    private void ucitaj() {
        // DefaultListModel<Djelatnik> m = new DefaultListModel<>();
        //  m.addAll(obrada.read());
        //  lstEntiteti.setModel(m);
        lstEntiteti.setModel(new DjelatnikListModel<>(obrada.read()));
        if (lstEntiteti.getModel().getSize() > 0) {
            lstEntiteti.setSelectedIndex(selectedIndex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKontakt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLoyalityKartica = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRadnaOdjecaObuca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUgovor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtZavrsenoZanimanje = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObriši = new javax.swing.JButton();
        txtDovuciOib = new javax.swing.JButton();
        dpPocetakRada = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("OIB");

        jLabel4.setText("Kontakt");

        jLabel5.setText("Email");

        jLabel6.setText("Početak rada");

        jLabel7.setText("Loyality kartica");

        jLabel8.setText("Radna  odjeća i  obuća");

        jLabel9.setText("Ugovor");

        jLabel10.setText("Završeno zanimanje");

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

        btnObriši.setText("Obriši");
        btnObriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiActionPerformed(evt);
            }
        });

        txtDovuciOib.setText("Dovuci Oib");
        txtDovuciOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDovuciOibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(60, 60, 60)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnObriši))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtKontakt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dpPocetakRada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                    .addGap(85, 85, 85)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDovuciOib)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(txtLoyalityKartica, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(txtEmail))))
                            .addComponent(txtRadnaOdjecaObuca, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtUgovor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZavrsenoZanimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDovuciOib))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpPocetakRada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoyalityKartica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRadnaOdjecaObuca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUgovor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtZavrsenoZanimanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObriši))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstEntiteti.getSelectedValue());
        popuniView();
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Djelatnik());
        popuniModel();
        try {
            obrada.create();
            selectedIndex = lstEntiteti.getModel().getSize();
            ucitaj();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite  stavku za  promjenu");
            return;
        }

        popuniModel();

        try {
            obrada.update();
            selectedIndex = lstEntiteti.getSelectedIndex();
            ucitaj();
        } catch (AppException ex) {
            obrada.refresh();
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }

    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiActionPerformed
        if (lstEntiteti.getSelectedValue()==null || obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo  odaberite  stavku");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(rootPane, "Sigurno obrisati djelatnika " + obrada.getEntitet().getIme()+ " " + obrada.getEntitet().getPrezime(),
                                                   "Brisanje djelatnika ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        try {
            obrada.delete();
            selectedIndex = lstEntiteti.getSelectedIndex() - 1;
            if (selectedIndex < 0) {
                selectedIndex = 0;
            }
            ucitaj();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());

        }

    }//GEN-LAST:event_btnObrišiActionPerformed

    private void txtDovuciOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDovuciOibActionPerformed
        txtOib.setText(Pomocno.dovuciOib());
    }//GEN-LAST:event_txtDovuciOibActionPerformed

    private void popuniModel() {
        var s = obrada.getEntitet();
        s.setIme(txtIme.getText());
        s.setPrezime(txtPrezime.getText());
        s.setOib(txtOib.getText());
        s.setKontakt(txtKontakt.getText());
        s.setEmail(txtEmail.getText());
        s.setPocetakRada(dpPocetakRada.getDate() != null
                ? Date.from(dpPocetakRada.getDate()
                        .atStartOfDay()
                        .atZone(ZoneId.systemDefault())
                        .toInstant()
                ) : null
        );
        s.setLoyalityKartica(txtLoyalityKartica.getText());
        s.setRadnaOdjecaObuca(txtRadnaOdjecaObuca.getText());
        s.setUgovor(txtUgovor.getText());
        s.setZavrsenoZanimanje(txtZavrsenoZanimanje.getText());

    }

    private void popuniView() {
        var s = obrada.getEntitet();
        txtIme.setText(s.getIme());
        txtPrezime.setText(s.getPrezime());
        txtOib.setText(s.getOib());
        txtKontakt.setText(s.getKontakt());
        txtEmail.setText(s.getEmail());
        // Datum u  LocalDate
        //Date input = s.getPocetakRada();
        //LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //dpPocetakRada.setDate(date);
        Pomocno.postaviDatum(dpPocetakRada, s.getPocetakRada());
        txtLoyalityKartica.setText(s.getLoyalityKartica());
        txtRadnaOdjecaObuca.setText(s.getRadnaOdjecaObuca());
        txtUgovor.setText(s.getUgovor());
        txtZavrsenoZanimanje.setText(s.getZavrsenoZanimanje());

      //  btnObrisi.setVisible(s.isDeletable()); 
        
        
       // btnObrisi.setVisible(s.getMobiteli() == null || s.getMobiteli().isEmpty());  
        //btnObrisi.setVisible(s.getSanitarneiskaznice() == null || s.getSanitarneiskaznice().isEmpty());
       // btnObrisi.setVisible(s.getDjelatniciNaEdukacijama() == null || s.getDjelatniciNaEdukacijama().isEmpty());
       //btnObrisi.setVisible((s.getMobiteli() == null || s.getMobiteli().isEmpty()) && 
                          // (s.getSanitarneiskaznice() == null || s.getSanitarneiskaznice().isEmpty())&& 
                          // (s.getDjelatniciNaEdukacijama() == null || s.getDjelatniciNaEdukacijama().isEmpty()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObriši;
    private javax.swing.JButton btnPromjeni;
    private com.github.lgooddatepicker.components.DatePicker dpPocetakRada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Djelatnik> lstEntiteti;
    private javax.swing.JButton txtDovuciOib;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKontakt;
    private javax.swing.JTextField txtLoyalityKartica;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtRadnaOdjecaObuca;
    private javax.swing.JTextField txtUgovor;
    private javax.swing.JTextField txtZavrsenoZanimanje;
    // End of variables declaration//GEN-END:variables
}
