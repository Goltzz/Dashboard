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
    public mainWindow() {
        initComponents();
        processInfo = new String();
        memoryInfo = new String();
        hardwareInfo = new String();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        memoryButton = new javax.swing.JButton();
        hardwareButton = new javax.swing.JButton();
        commandLineButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();
        fileButton = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        hardwarePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        processPanel = new javax.swing.JPanel();
        memoryPanel = new javax.swing.JPanel();
        filePanel = new javax.swing.JPanel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 150, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 860));
        jPanel1.setRequestFocusEnabled(false);

        memoryButton.setBackground(new java.awt.Color(238, 238, 228));
        memoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/memory.png"))); // NOI18N
        memoryButton.setText("Memória");
        memoryButton.setBorder(null);
        memoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryButtonActionPerformed(evt);
            }
        });

        hardwareButton.setBackground(new java.awt.Color(238, 238, 228));
        hardwareButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        hardwareButton.setText("Hardware/SO");
        hardwareButton.setBorder(null);
        hardwareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardwareButtonActionPerformed(evt);
            }
        });

        commandLineButton.setBackground(new java.awt.Color(238, 238, 228));
        commandLineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal.png"))); // NOI18N
        commandLineButton.setText("Terminal");
        commandLineButton.setBorder(null);
        commandLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandLineButtonActionPerformed(evt);
            }
        });

        processButton.setBackground(new java.awt.Color(238, 238, 228));
        processButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/process.png"))); // NOI18N
        processButton.setText("Processos");
        processButton.setBorder(null);
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        fileButton.setBackground(new java.awt.Color(238, 238, 228));
        fileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-system.png"))); // NOI18N
        fileButton.setText("Sist. de Arquivos");
        fileButton.setBorder(null);
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commandLineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(hardwareButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(processButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(fileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(hardwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(memoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commandLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout hardwarePanelLayout = new javax.swing.GroupLayout(hardwarePanel);
        hardwarePanel.setLayout(hardwarePanelLayout);
        hardwarePanelLayout.setHorizontalGroup(
            hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
            .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hardwarePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(538, Short.MAX_VALUE)))
        );
        hardwarePanelLayout.setVerticalGroup(
            hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
            .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hardwarePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab1", hardwarePanel);

        javax.swing.GroupLayout processPanelLayout = new javax.swing.GroupLayout(processPanel);
        processPanel.setLayout(processPanelLayout);
        processPanelLayout.setHorizontalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        processPanelLayout.setVerticalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab2", processPanel);

        javax.swing.GroupLayout memoryPanelLayout = new javax.swing.GroupLayout(memoryPanel);
        memoryPanel.setLayout(memoryPanelLayout);
        memoryPanelLayout.setHorizontalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        memoryPanelLayout.setVerticalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab3", memoryPanel);

        javax.swing.GroupLayout filePanelLayout = new javax.swing.GroupLayout(filePanel);
        filePanel.setLayout(filePanelLayout);
        filePanelLayout.setHorizontalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        filePanelLayout.setVerticalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab4", filePanel);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -30, 1140, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryButtonActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_memoryButtonActionPerformed

    private void hardwareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardwareButtonActionPerformed
        jTabbedPane2.setSelectedIndex(0);
        hardwareInfo = execShellCommand("lshw");
        jTextPane1.setText(hardwareInfo);
    }//GEN-LAST:event_hardwareButtonActionPerformed

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

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        jTabbedPane2.setSelectedIndex(1);
        processInfo = execShellCommand("top -b");
        jTextPane1.setText(processInfo);
    }//GEN-LAST:event_processButtonActionPerformed

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_fileButtonActionPerformed
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
    private javax.swing.JButton commandLineButton;
    private javax.swing.JButton fileButton;
    private javax.swing.JPanel filePanel;
    private javax.swing.JButton hardwareButton;
    private javax.swing.JPanel hardwarePanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton memoryButton;
    private javax.swing.JPanel memoryPanel;
    private javax.swing.JButton processButton;
    private javax.swing.JPanel processPanel;
    // End of variables declaration//GEN-END:variables
}
