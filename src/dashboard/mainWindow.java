/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gugol
 */
public class mainWindow extends javax.swing.JFrame {

    private String processInfo;
    private String memoryInfo;
    private String hardwareInfo;
    private String fileInfo;
    public mainWindow() {
        initComponents();
        processInfo = new String();
        memoryInfo = new String();
        hardwareInfo = new String();
        fileInfo = new String();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        commandLineButton = new javax.swing.JButton();
        firstQuadrantBox = new javax.swing.JComboBox<>();
        secondQuadrantBox = new javax.swing.JComboBox<>();
        thirdQuadrantBox = new javax.swing.JComboBox<>();
        fourthQuadrantBox = new javax.swing.JComboBox<>();
        bottomSplit = new javax.swing.JSplitPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        thirdQuadrantTxt = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        fourthQuadrantTxt = new javax.swing.JTextPane();
        topSplit = new javax.swing.JSplitPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        secondQuadrantTxt = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        firstQuadrantTxt = new javax.swing.JTextPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 150, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 860));
        jPanel1.setRequestFocusEnabled(false);

        commandLineButton.setBackground(new java.awt.Color(238, 238, 228));
        commandLineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal.png"))); // NOI18N
        commandLineButton.setText("Terminal");
        commandLineButton.setBorder(null);
        commandLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandLineButtonActionPerformed(evt);
            }
        });

        firstQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        firstQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        firstQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstQuadrantBoxItemStateChanged(evt);
            }
        });

        secondQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        secondQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        secondQuadrantBox.setSelectedIndex(1);
        secondQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondQuadrantBoxItemStateChanged(evt);
            }
        });

        thirdQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        thirdQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        thirdQuadrantBox.setSelectedIndex(2);
        thirdQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thirdQuadrantBoxItemStateChanged(evt);
            }
        });

        fourthQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        fourthQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        fourthQuadrantBox.setSelectedIndex(3);
        fourthQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fourthQuadrantBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commandLineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstQuadrantBox, 0, 168, Short.MAX_VALUE)
                    .addComponent(secondQuadrantBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(thirdQuadrantBox, 0, 0, Short.MAX_VALUE)
                    .addComponent(fourthQuadrantBox, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(firstQuadrantBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secondQuadrantBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(thirdQuadrantBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fourthQuadrantBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commandLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bottomSplit.setDividerLocation(571);
        bottomSplit.setDividerSize(2);

        jScrollPane7.setPreferredSize(new java.awt.Dimension(570, 430));

        thirdQuadrantTxt.setEditable(false);
        jScrollPane7.setViewportView(thirdQuadrantTxt);

        bottomSplit.setLeftComponent(jScrollPane7);

        jScrollPane5.setPreferredSize(new java.awt.Dimension(570, 430));

        fourthQuadrantTxt.setEditable(false);
        jScrollPane5.setViewportView(fourthQuadrantTxt);

        bottomSplit.setRightComponent(jScrollPane5);

        getContentPane().add(bottomSplit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 1140, 430));

        topSplit.setDividerSize(2);

        jScrollPane8.setPreferredSize(new java.awt.Dimension(570, 430));

        secondQuadrantTxt.setEditable(false);
        jScrollPane8.setViewportView(secondQuadrantTxt);

        topSplit.setRightComponent(jScrollPane8);

        jScrollPane6.setPreferredSize(new java.awt.Dimension(570, 430));

        firstQuadrantTxt.setEditable(false);
        jScrollPane6.setViewportView(firstQuadrantTxt);

        topSplit.setLeftComponent(jScrollPane6);

        getContentPane().add(topSplit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void prepareHardwareInfo(){
        StringBuilder sb = new StringBuilder(execShellCommand("lscpu | grep Architecture"));
        sb.append(execShellCommand("uname -a"));
        hardwareInfo = sb.toString();
    }
    
    private void prepareProcessInfo(){
        processInfo = execShellCommand("ps a");
    }
    
    private void prepareMemoryInfo(){
        memoryInfo = execShellCommand("less /proc/meminfo");
    }
    
    private void prepareFileInfo(){
        fileInfo = execShellCommand("ls -lh / ");
    }
    
    private void commandLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandLineButtonActionPerformed
        try{
            Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe");
            p.waitFor();
        }catch(IOException ex){
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_commandLineButtonActionPerformed

    private void firstQuadrantBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstQuadrantBoxItemStateChanged
        int index = firstQuadrantBox.getSelectedIndex();
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                firstQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                prepareProcessInfo();
                firstQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                prepareMemoryInfo();
                firstQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                prepareFileInfo();
                firstQuadrantTxt.setText(fileInfo);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_firstQuadrantBoxItemStateChanged

    private void secondQuadrantBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondQuadrantBoxItemStateChanged
        int index = secondQuadrantBox.getSelectedIndex();
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                secondQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                prepareProcessInfo();
                secondQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                prepareMemoryInfo();
                secondQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                prepareFileInfo();
                secondQuadrantTxt.setText(fileInfo);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_secondQuadrantBoxItemStateChanged

    private void thirdQuadrantBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_thirdQuadrantBoxItemStateChanged
        int index = thirdQuadrantBox.getSelectedIndex();
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                thirdQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                prepareProcessInfo();
                thirdQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                prepareMemoryInfo();
                thirdQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                prepareFileInfo();
                thirdQuadrantTxt.setText(fileInfo);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_thirdQuadrantBoxItemStateChanged

    private void fourthQuadrantBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fourthQuadrantBoxItemStateChanged
        int index = fourthQuadrantBox.getSelectedIndex();
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                fourthQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                prepareProcessInfo();
                fourthQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                prepareMemoryInfo();
                fourthQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                prepareFileInfo();
                fourthQuadrantTxt.setText(fileInfo);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_fourthQuadrantBoxItemStateChanged
    private String execShellCommand(String command){
        ProcessBuilder procBuilder = new ProcessBuilder();
        procBuilder.command("bash","-c",command);
        try{
            
            Process process = procBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
                
            while((line = reader.readLine()) != null){
                output.append(line).append("\n");
            }
            
            int exitVal = process.waitFor();
		if (exitVal == 0) {
                    return output.toString();
		} else {
                }

	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
        return "Erro!Não foi possível executar o comando desejado!";
    }
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane bottomSplit;
    private javax.swing.JButton commandLineButton;
    private javax.swing.JComboBox<String> firstQuadrantBox;
    private javax.swing.JTextPane firstQuadrantTxt;
    private javax.swing.JComboBox<String> fourthQuadrantBox;
    private javax.swing.JTextPane fourthQuadrantTxt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> secondQuadrantBox;
    private javax.swing.JTextPane secondQuadrantTxt;
    private javax.swing.JComboBox<String> thirdQuadrantBox;
    private javax.swing.JTextPane thirdQuadrantTxt;
    private javax.swing.JSplitPane topSplit;
    // End of variables declaration//GEN-END:variables
}
