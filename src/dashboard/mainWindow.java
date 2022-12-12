/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author gugol
 */
public class mainWindow extends javax.swing.JFrame {

    private String processInfo;
    private String memoryInfo;
    private String hardwareInfo;
    private String fileInfo;
    private String formatInfo;
    private ArrayList<ProcessInfo> processArray = new ArrayList<>();
    private Memory memory;
    Timer t1 = new Timer();
    Timer t2 = new Timer();
    Timer t3 = new Timer();
    Timer t4 = new Timer();
    TimerTask tt1process = new TimerTask(){
        @Override
        public void run(){
            prepareProcessInfo();
            firstQuadrantTxt.setText(processInfo);
        }
    };
    TimerTask tt1memory = new TimerTask(){
        @Override
        public void run(){
            prepareMemoryInfo();
            firstQuadrantTxt.setText(memoryInfo);
        }
    };
    TimerTask tt2process = new TimerTask(){
        @Override
        public void run(){
            prepareProcessInfo();
            secondQuadrantTxt.setText(processInfo);
        }
    };
    TimerTask tt2memory = new TimerTask(){
        @Override
        public void run(){
            prepareMemoryInfo();
            secondQuadrantTxt.setText(memoryInfo);
        }
    };
    TimerTask tt3process = new TimerTask(){
        @Override
        public void run(){
            prepareProcessInfo();
            thirdQuadrantTxt.setText(processInfo);
        }
    };
    TimerTask tt3memory = new TimerTask(){
        @Override
        public void run(){
            prepareMemoryInfo();
            thirdQuadrantTxt.setText(memoryInfo);
        }
    };
    TimerTask tt4process = new TimerTask(){
        @Override
        public void run(){
            prepareProcessInfo();
            fourthQuadrantTxt.setText(processInfo);
        }
    };
    TimerTask tt4memory = new TimerTask(){
        @Override
        public void run(){
            prepareMemoryInfo();
            fourthQuadrantTxt.setText(memoryInfo);
        }
    };
    
    
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
        firstQuadrantBox.setSelectedIndex(-1);
        firstQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstQuadrantBoxItemStateChanged(evt);
            }
        });

        secondQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        secondQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        secondQuadrantBox.setSelectedIndex(-1);
        secondQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondQuadrantBoxItemStateChanged(evt);
            }
        });

        thirdQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        thirdQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        thirdQuadrantBox.setSelectedIndex(-1);
        thirdQuadrantBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thirdQuadrantBoxItemStateChanged(evt);
            }
        });

        fourthQuadrantBox.setBackground(new java.awt.Color(238, 238, 228));
        fourthQuadrantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware/SO", "Processos", "Memória", "Sist. de Arquivos" }));
        fourthQuadrantBox.setSelectedIndex(-1);
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

        topSplit.setDividerLocation(571);
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
        StringBuilder sb = new StringBuilder(execShellCommand("uname -a"));
        sb.append("Processador:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("lscpu|grep -e Architecture -e CPU -e Core"));
        sb.append("Memória:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("free -h"));
        sb.append("GPU:-----------------------------------------------------------------------------------------------\n");
        sb.append("Discos:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("lsblk"));
        hardwareInfo = sb.toString();
    }
    
    private void prepareProcessInfo(){
        if(processInfo != null){
            processInfo = " ";
        }
        processInfo = execShellCommand("top -b -n 1");
        processInfo = processInfo.substring(processInfo.indexOf("PID"));
        processInfo = processInfo.substring(processInfo.indexOf("\n"));
        String[] splitProcessInfo = processInfo.split("\\s+");
        StringBuilder sb = new StringBuilder(String.format("%-8s %-10s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s","PID","USUARIO","PR","NI","VIRT","RES","SHR","S","%CPU","%MEM","TEMPO+","COMANDO"));
        if(!processArray.isEmpty()){
            rewriteProcessArray(splitProcessInfo);
        }
        else{
            fillProcessArray(splitProcessInfo);
        }
        for(int i=0;i< processArray.size();i++){
            sb.append(System.lineSeparator());
            sb.append(processArray.get(i).formatLine());
        }
        processInfo = sb.toString();
    }
    
    private void prepareMemoryInfo(){
        memoryInfo = execShellCommand("free -h");
        memoryInfo = memoryInfo.substring(memoryInfo.indexOf("Mem:"));
        String[] splitMemoryInfo = memoryInfo.split("\\s+");
        StringBuilder sb = new StringBuilder(String.format("\t%-10s %-10s %-10s %-20s %-20s %-10s","TOTAL","USADA","LIVRE","COMPARTILHADA","BUFF/CACHE","DISPONÍVEL"));
        if(memory != null){
            rewriteMemoryInfo(splitMemoryInfo);
        }else{
            memory = new Memory(splitMemoryInfo[1],splitMemoryInfo[2],splitMemoryInfo[3],splitMemoryInfo[4],splitMemoryInfo[5],splitMemoryInfo[6],splitMemoryInfo[8],
                                splitMemoryInfo[9],splitMemoryInfo[10]);
        }
        memory.formatMemLine(sb);
        memoryInfo = sb.toString();
    }
    
    private void prepareFileInfo(){
        fileInfo = execShellCommand("ls -lh / ");
    }
    
    private void commandLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandLineButtonActionPerformed
        try{
            Process p = Runtime.getRuntime().exec("/lucas/bin/x-terminal-emulator");//trocar para abrir linha do linux
            p.waitFor();
        }catch(IOException ex){
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_commandLineButtonActionPerformed

    private void firstQuadrantBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstQuadrantBoxItemStateChanged
        int index = firstQuadrantBox.getSelectedIndex();
        tt1process.cancel();
        tt1memory.cancel();
        t1.purge();
        tt1process = new TimerTask(){
            @Override
            public void run(){
                prepareProcessInfo();
                firstQuadrantTxt.setText(processInfo);
            }
        };
        tt1memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                firstQuadrantTxt.setText(memoryInfo);
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                firstQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                //fazer a thread (timer) aqui e em todos as outras chamadas de prepareProcessInfo();
                t1.schedule(tt1process,new Date(),500);
                //prepareProcessInfo();
                //firstQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                //fazer a thread (timer) aqui e em todos as outras chamadas de prepareMemoryInfo() que estão nas funções que tratam de cada quadrante;
                t1.schedule(tt1memory,new Date(),500);
                //prepareMemoryInfo();
                //firstQuadrantTxt.setText(memoryInfo);
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
        tt2process.cancel();
        tt2memory.cancel();
        t2.purge();
        tt2process = new TimerTask(){
            @Override
            public void run(){
                prepareProcessInfo();
                secondQuadrantTxt.setText(processInfo);
            }
        };
        tt2memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                secondQuadrantTxt.setText(memoryInfo);
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                secondQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                t2.schedule(tt2process,new Date(),500);
                //prepareProcessInfo();
                //secondQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                t2.schedule(tt2memory,new Date(),500);
                //prepareMemoryInfo();
                //secondQuadrantTxt.setText(memoryInfo);
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
        tt3process.cancel();
        tt3memory.cancel();
        t3.purge();
        tt3process = new TimerTask(){
            @Override
            public void run(){
                prepareProcessInfo();
                thirdQuadrantTxt.setText(processInfo);
            }
        };
        tt3memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                thirdQuadrantTxt.setText(memoryInfo);
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                thirdQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                t3.schedule(tt3process,new Date(),500);
                //prepareProcessInfo();
                //thirdQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                t3.schedule(tt3memory,new Date(),500);
                //prepareMemoryInfo();
                //thirdQuadrantTxt.setText(memoryInfo);
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
        tt4process.cancel();
        tt4memory.cancel();
        t4.purge();
        tt4process = new TimerTask(){
            @Override
            public void run(){
                prepareProcessInfo();
                fourthQuadrantTxt.setText(processInfo);
            }
        };
        tt4memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                fourthQuadrantTxt.setText(memoryInfo);
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                fourthQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                t4.schedule(tt4process,new Date(),500);
                //prepareProcessInfo();
                //fourthQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                t4.schedule(tt4memory,new Date(),500);
                //prepareMemoryInfo();
                //fourthQuadrantTxt.setText(memoryInfo);
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
                output.append(line.stripIndent()).append(System.lineSeparator());
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

    private void fillProcessArray(String[] splitProcessInfo) {
        int numLinhas = splitProcessInfo.length/12, coluna = 0;
        for(int i = 0; i<numLinhas;i++){
            int j = i+ coluna;
            ProcessInfo pi = new ProcessInfo(splitProcessInfo[j+1],splitProcessInfo[j+2],splitProcessInfo[j+3],splitProcessInfo[j+4],splitProcessInfo[j+5],splitProcessInfo[j+6],splitProcessInfo[j+7],
            splitProcessInfo[j+8],splitProcessInfo[j+9],splitProcessInfo[j+10],splitProcessInfo[j+11],splitProcessInfo[j+12]);
            processArray.add(pi);
            coluna+=11;
        }    
    }
    private void rewriteProcessArray(String[] splitProcessInfo){
        for(int i=0;i<processArray.size();i++){
            for(int j = 0; j<splitProcessInfo.length;j+=11){
                processArray.get(i).setPid(splitProcessInfo[1]);
                processArray.get(i).setUser(splitProcessInfo[2]);
                processArray.get(i).setPriority(splitProcessInfo[3]);
                processArray.get(i).setNice(splitProcessInfo[4]);
                processArray.get(i).setVirtual(splitProcessInfo[5]);
                processArray.get(i).setResident(splitProcessInfo[6]);
                processArray.get(i).setShared(splitProcessInfo[7]);
                processArray.get(i).setStatus(splitProcessInfo[8]);
                processArray.get(i).setCpu(splitProcessInfo[9]);
                processArray.get(i).setMem(splitProcessInfo[10]);
                processArray.get(i).setTime(splitProcessInfo[11]);
                processArray.get(i).setCommand(splitProcessInfo[12]);
            }
        }
    }

    private void rewriteMemoryInfo(String[] splitMemoryInfo) {
        memory.setTotalMemory(splitMemoryInfo[1]);
        memory.setAvailableMemory(splitMemoryInfo[2]);
        memory.setFreeMemory(splitMemoryInfo[3]);
        memory.setUsedMemory(splitMemoryInfo[4]);
        memory.setChachedMemory(splitMemoryInfo[5]);
        memory.setSharedMemory(splitMemoryInfo[6]);
        memory.setTotalSwap(splitMemoryInfo[8]);
        memory.setUsedSwap(splitMemoryInfo[9]);
        memory.setFreeSwap(splitMemoryInfo[10]);
    }
}
