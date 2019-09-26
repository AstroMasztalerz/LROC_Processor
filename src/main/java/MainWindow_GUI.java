
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tomasz Masztalerz
 */
public class MainWindow_GUI extends javax.swing.JFrame {

    public BufferedImage temp;
    public int zoom = 100;
    public File rawFile;

    /**
     * Creates new form MainWindow_GUI
     */
    public MainWindow_GUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrevLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CH5Button = new javax.swing.JRadioButton();
        CH4Button = new javax.swing.JRadioButton();
        CH3Button = new javax.swing.JRadioButton();
        CH2Button = new javax.swing.JRadioButton();
        CH1Button = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadPNGButton = new javax.swing.JMenuItem();
        SaveAllButton = new javax.swing.JMenuItem();
        ReloadButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AlignChannelsCheckBox = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 55, 55));
        setForeground(java.awt.Color.darkGray);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        PrevLabel.setBackground(new java.awt.Color(90, 90, 90));
        PrevLabel.setForeground(new java.awt.Color(255, 255, 255));
        PrevLabel.setText("AWAITING IMAGE TO BE LOADED");
        PrevLabel.setOpaque(true);
        jScrollPane1.setViewportView(PrevLabel);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        CH5Button.setBackground(new java.awt.Color(90, 90, 90));
        buttonGroup1.add(CH5Button);
        CH5Button.setForeground(new java.awt.Color(255, 255, 255));
        CH5Button.setText("CH5");
        CH5Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20), 2));
        CH5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH5ButtonActionPerformed(evt);
            }
        });

        CH4Button.setBackground(new java.awt.Color(90, 90, 90));
        buttonGroup1.add(CH4Button);
        CH4Button.setForeground(new java.awt.Color(255, 255, 255));
        CH4Button.setText("CH4");
        CH4Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20), 2));
        CH4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH4ButtonActionPerformed(evt);
            }
        });

        CH3Button.setBackground(new java.awt.Color(90, 90, 90));
        buttonGroup1.add(CH3Button);
        CH3Button.setForeground(new java.awt.Color(255, 255, 255));
        CH3Button.setText("CH3");
        CH3Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20), 2));
        CH3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH3ButtonActionPerformed(evt);
            }
        });

        CH2Button.setBackground(new java.awt.Color(90, 90, 90));
        buttonGroup1.add(CH2Button);
        CH2Button.setForeground(new java.awt.Color(255, 255, 255));
        CH2Button.setText("CH2");
        CH2Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20), 2));
        CH2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH2ButtonActionPerformed(evt);
            }
        });

        CH1Button.setBackground(new java.awt.Color(90, 90, 90));
        buttonGroup1.add(CH1Button);
        CH1Button.setForeground(new java.awt.Color(255, 255, 255));
        CH1Button.setText("CH1");
        CH1Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20), 2));
        CH1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH1ButtonActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CH3Button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CH1Button))
                    .addComponent(CH4Button)
                    .addComponent(CH2Button)
                    .addComponent(CH5Button)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CH1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CH2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CH3Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CH4Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CH5Button))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(55, 55, 55));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(90, 90, 90));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");
        jMenu1.setOpaque(true);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        LoadPNGButton.setText("LoadPNG");
        LoadPNGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadPNGButtonActionPerformed(evt);
            }
        });
        jMenu1.add(LoadPNGButton);

        SaveAllButton.setText("Save Channels to folder");
        SaveAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAllButtonActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAllButton);

        ReloadButton.setText("ReloadFile");
        ReloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadButtonActionPerformed(evt);
            }
        });
        jMenu1.add(ReloadButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(90, 90, 90));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Settings");
        jMenu2.setOpaque(true);

        AlignChannelsCheckBox.setSelected(true);
        AlignChannelsCheckBox.setText("Align channels");
        AlignChannelsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlignChannelsCheckBoxActionPerformed(evt);
            }
        });
        jMenu2.add(AlignChannelsCheckBox);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadPNGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadPNGButtonActionPerformed
        LoadPNGButton.setText("");
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this); //value for opening of file
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if opening was OK
            File file = fileChooser.getSelectedFile(); //Creates file from path
            rawFile=file;
            try {
                Main.process(ImageIO.read(file));
            } catch (IOException ex) {
                Logger.getLogger(MainWindow_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_LoadPNGButtonActionPerformed
    }
    private void CH1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH1ButtonActionPerformed
        PrevLabel.setIcon(new ImageIcon(Main.channels[0]));
        temp = Main.channels[0];
    }//GEN-LAST:event_CH1ButtonActionPerformed

    private void CH2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH2ButtonActionPerformed
        PrevLabel.setIcon(new ImageIcon(Main.channels[1]));
        temp = Main.channels[1];
    }//GEN-LAST:event_CH2ButtonActionPerformed

    private void CH3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH3ButtonActionPerformed
        PrevLabel.setIcon(new ImageIcon(Main.channels[2]));
        temp = Main.channels[2];// TODO add your handling code here:
    }//GEN-LAST:event_CH3ButtonActionPerformed

    private void CH4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH4ButtonActionPerformed
        PrevLabel.setIcon(new ImageIcon(Main.channels[3]));
        temp = Main.channels[3];// TODO add your handling code here:
    }//GEN-LAST:event_CH4ButtonActionPerformed

    private void CH5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH5ButtonActionPerformed
        PrevLabel.setIcon(new ImageIcon(Main.channels[4]));
        temp = Main.channels[4];// TODO add your handling code here:
    }//GEN-LAST:event_CH5ButtonActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void SaveAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAllButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       // System.out.println("DONE");
        jfc.showSaveDialog(null);
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

            String path = jfc.getSelectedFile().getAbsolutePath();
            try {
                Main.saveChannels(path);
            } catch (IOException ex) {
                Logger.getLogger(MainWindow_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SaveAllButtonActionPerformed

    private void AlignChannelsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlignChannelsCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlignChannelsCheckBoxActionPerformed

    private void ReloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadButtonActionPerformed
        try {
            Main.process(ImageIO.read(rawFile));
        } catch (IOException ex) {
            Logger.getLogger(MainWindow_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReloadButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBoxMenuItem AlignChannelsCheckBox;
    public static javax.swing.JRadioButton CH1Button;
    private javax.swing.JRadioButton CH2Button;
    private javax.swing.JRadioButton CH3Button;
    private javax.swing.JRadioButton CH4Button;
    private javax.swing.JRadioButton CH5Button;
    private javax.swing.JMenuItem LoadPNGButton;
    public static javax.swing.JLabel PrevLabel;
    private javax.swing.JMenuItem ReloadButton;
    private javax.swing.JMenuItem SaveAllButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
