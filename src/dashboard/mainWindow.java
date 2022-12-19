
package dashboard;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author gugol
 */
public class mainWindow extends javax.swing.JFrame {

    private String processInfo;
    private String memoryInfo;
    private String hardwareInfo;
    private String fileInfo;
    private String diskInfo;
    private String[][] diskInfoLines;
    private int[] disks;
    private int[] parts;
    private ArrayList<ProcessInfo> processArray = new ArrayList<>();
    private Memory memory;
    private BarChart memoryChart;
    private JFreeChart diskChart;
    private JTable processTable;
    private JScrollPane tablePane = new JScrollPane();
    private final ProcessTableModel pTableModel;   
    DefaultPieDataset diskDataset = new DefaultPieDataset();
    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
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
            fourthQuadrantTxt.setVisible(false);
            //fourthQuadrantTxt.setText(memoryInfo);
        }
    };
    
    
    public mainWindow() {
        initComponents();
        processInfo = new String();
        memoryInfo = new String();
        hardwareInfo = new String();
        fileInfo = new String();
        prepareDiskInfo();
        pTableModel = new ProcessTableModel();
        processTable = new JTable(pTableModel);
        memoryChart = new BarChart("Memória RAM","X","Y");
        diskChart = ChartFactory.createPieChart(      
         "Disk",   // chart title 
         diskDataset,          // data    
         true,             // include legend   
         true, 
         false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        commandLineButton = new javax.swing.JButton();
        firstQuadrantBox = new javax.swing.JComboBox<>();
        secondQuadrantBox = new javax.swing.JComboBox<>();
        thirdQuadrantBox = new javax.swing.JComboBox<>();
        fourthQuadrantBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        thirdTabbedPane = new javax.swing.JTabbedPane();
        thirdScroll = new javax.swing.JScrollPane();
        thirdQuadrantTxt = new javax.swing.JTextPane();
        thirdPanel = new javax.swing.JPanel();
        firstTabbedPane = new javax.swing.JTabbedPane();
        firstScroll = new javax.swing.JScrollPane();
        firstQuadrantTxt = new javax.swing.JTextPane();
        firstPanel = new javax.swing.JPanel();
        secondTabbedPane = new javax.swing.JTabbedPane();
        secondScroll = new javax.swing.JScrollPane();
        secondQuadrantTxt = new javax.swing.JTextPane();
        secondPanel = new javax.swing.JPanel();
        fourthTabbedPane = new javax.swing.JTabbedPane();
        fourthScroll = new javax.swing.JScrollPane();
        fourthQuadrantTxt = new javax.swing.JTextPane();
        fourthPanel = new javax.swing.JPanel();

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

        jPanel2.setBackground(new java.awt.Color(37, 150, 190));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 40));

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
                    .addComponent(secondQuadrantBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdQuadrantBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthQuadrantBox, 0, 0, Short.MAX_VALUE)
                    .addComponent(firstQuadrantBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel4.setBackground(new java.awt.Color(37, 150, 190));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 1320, 40));

        thirdTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        thirdTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        thirdTabbedPane.setFocusable(false);

        thirdScroll.setPreferredSize(new java.awt.Dimension(571, 410));

        thirdQuadrantTxt.setEditable(false);
        thirdQuadrantTxt.setFocusable(false);
        thirdScroll.setViewportView(thirdQuadrantTxt);

        thirdTabbedPane.addTab("tab2", thirdScroll);

        thirdPanel.setPreferredSize(new java.awt.Dimension(571, 430));
        thirdPanel.setLayout(new java.awt.BorderLayout());
        thirdTabbedPane.addTab("tab1", thirdPanel);

        getContentPane().add(thirdTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 431, 570, 421));

        firstTabbedPane.setToolTipText("");
        firstTabbedPane.setFocusable(false);
        firstTabbedPane.setPreferredSize(new java.awt.Dimension(571, 430));

        firstScroll.setPreferredSize(new java.awt.Dimension(570, 430));
        firstScroll.setRequestFocusEnabled(false);

        firstQuadrantTxt.setEditable(false);
        firstScroll.setViewportView(firstQuadrantTxt);

        firstTabbedPane.addTab("tab1", firstScroll);

        firstPanel.setPreferredSize(new java.awt.Dimension(571, 430));
        firstPanel.setLayout(new java.awt.BorderLayout());
        firstTabbedPane.addTab("tab2", firstPanel);

        getContentPane().add(firstTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 12, -1, 420));

        secondTabbedPane.setFocusable(false);

        secondQuadrantTxt.setEditable(false);
        secondScroll.setViewportView(secondQuadrantTxt);

        secondTabbedPane.addTab("tab1", secondScroll);

        secondPanel.setLayout(new java.awt.BorderLayout());
        secondTabbedPane.addTab("tab2", secondPanel);

        getContentPane().add(secondTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 11, 570, 420));

        fourthTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        fourthTabbedPane.setFocusable(false);

        fourthScroll.setPreferredSize(new java.awt.Dimension(571, 430));

        fourthQuadrantTxt.setEditable(false);
        fourthScroll.setViewportView(fourthQuadrantTxt);

        fourthTabbedPane.addTab("tab2", fourthScroll);

        fourthPanel.setPreferredSize(new java.awt.Dimension(571, 430));
        fourthPanel.setLayout(new java.awt.BorderLayout());
        fourthTabbedPane.addTab("tab1", fourthPanel);

        getContentPane().add(fourthTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 431, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void prepareHardwareInfo(){
        StringBuilder sb = new StringBuilder(execShellCommand("uname -a"));
        sb.append("Processador:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("lscpu|grep -e Architecture -e CPU -e Core"));
        sb.append("Memória:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("free -h"));
        sb.append("GPU:-----------------------------------------------------------------------------------------------\n");
        String display = execShellCommand("lshw -C display");
        display = display.substring(display.indexOf("description"), display.indexOf("capabilities"));
        sb.append(display);
        sb.append("Discos:-----------------------------------------------------------------------------------------------\n");
        sb.append(execShellCommand("lsblk"));
        hardwareInfo = sb.toString();
    }
    
    private void prepareProcessInfo(){
            processInfo = execShellCommand("ps -eo pid,user,priority,nice,status,%cpu,%mem,start,time,cmd");
            processInfo = processInfo.substring(processInfo.indexOf("\n")+1);
            String[] lineProcessInfo = processInfo.split("\n");
            String[][] splitProcessInfo = new String[lineProcessInfo.length][10];
            for(int i=0;i<lineProcessInfo.length;i++){
                splitProcessInfo[i] = lineProcessInfo[i].split("\\s+");
            }
            int size = splitProcessInfo.length;
            setColumnNames();
            if(!pTableModel.getProcessArray().isEmpty()){
                if(size > pTableModel.getRowCount()){
                    int j = splitProcessInfo.length -1;
                        pTableModel.add(new ProcessInfo(splitProcessInfo[j][0],splitProcessInfo[j][1],splitProcessInfo[j][2],splitProcessInfo[j][3],splitProcessInfo[j][4],splitProcessInfo[j][5],splitProcessInfo[j][6],
                                    splitProcessInfo[j][7],splitProcessInfo[j][8],splitProcessInfo[j][9]));

                }
                else if(size < pTableModel.getRowCount()){ 
                    removeProcess(splitProcessInfo);
                }
                pTableModel.update(splitProcessInfo);
            }
            else{
                fillProcessArray(splitProcessInfo);
            }
            //processTable.setModel(pTableModel);
    }
    
    private void removeProcess(String[][] splitProcessInfo) {
        int i =0, j=0;
        while( i<pTableModel.getRowCount()){
            String value = pTableModel.getValueAt(i, 0);
            if(!pTableModel.getValueAt(i, 0).equals(splitProcessInfo[i][0]))
                pTableModel.remove(pTableModel.getProcessInfoAt(i));
            i++;
        }
    }
    
    private void fillProcessArray(String[][] splitProcessInfo) {
        int numLinhas = splitProcessInfo.length;
        for(int i = 0; i<numLinhas;i++){
            ProcessInfo pi = new ProcessInfo(splitProcessInfo[i][0],splitProcessInfo[i][1],splitProcessInfo[i][2],splitProcessInfo[i][3],splitProcessInfo[i][4],splitProcessInfo[i][5],splitProcessInfo[i][6],
                                splitProcessInfo[i][7],splitProcessInfo[i][8],splitProcessInfo[i][9]);
            pTableModel.add(pi);
        }    
    }
    
    private void prepareMemoryInfo(){
        memoryInfo = execShellCommand("free");
        memoryInfo = memoryInfo.substring(memoryInfo.indexOf("Mem:"));
        String[] splitMemoryInfo = memoryInfo.split("\\s+");
        StringBuilder sb = new StringBuilder(String.format("\t%-10s %-10s %-10s %-20s %-20s %-10s","TOTAL","USADA","LIVRE","COMPARTILHADA","BUFF/CACHE","DISPONÍVEL"));
        if(memory != null){
            rewriteMemoryInfo(splitMemoryInfo);
            dataSet.setValue(Integer.valueOf(memory.getTotalMemory()),"Total","Mem");
            dataSet.setValue(Integer.valueOf(memory.getFreeMemory()), "Livre","Mem");
            dataSet.setValue(Integer.valueOf(memory.getTotalSwap()), "Total","Swap");
            dataSet.setValue(Integer.valueOf(memory.getFreeSwap()), "Livre","Swap");
        }else{
            memory = new Memory(splitMemoryInfo[1],splitMemoryInfo[2],splitMemoryInfo[3],splitMemoryInfo[4],splitMemoryInfo[5],splitMemoryInfo[6],splitMemoryInfo[8],
                                splitMemoryInfo[9],splitMemoryInfo[10]);
            dataSet.addValue(Integer.valueOf(memory.getTotalMemory()), "Total","Mem");
            dataSet.addValue(Integer.valueOf(memory.getFreeMemory()), "Livre","Mem");
            dataSet.addValue(Integer.valueOf(memory.getTotalSwap()), "Total","Swap");
            dataSet.addValue(Integer.valueOf(memory.getFreeSwap()), "Livre","Swap");
            memoryChart.setDataSet(dataSet);
            memoryChart.createChart();
        }
        memory.formatMemLine(sb);
        memoryInfo = sb.toString();
    }
    
private void prepareDiskInfo(){
        diskInfo = execShellCommand("lsblk -b");
        diskInfo = diskInfo.replaceAll("└─", "");
        diskInfo = diskInfo.replaceAll("├─", "");
        
        Scanner scanner = new Scanner(diskInfo);
        int sz=0;
        int ndisks=0;
        int nparts=0;
        int ndiskparts=0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            sz++;
        }
        scanner.close();
        scanner = new Scanner(diskInfo);
        scanner.nextLine();
        sz--;

        diskInfoLines = new String[sz][7];
        for(int i = 0; i<sz; i ++){
            diskInfoLines[i]=scanner.nextLine().split("\\s+");
        }
        
        int line = 0;
        while(line < diskInfoLines.length){
            if(diskInfoLines[line][5].contains("disk")){
                ndisks++;                
                firstQuadrantBox.addItem("Disco " + diskInfoLines[line][0]);
                secondQuadrantBox.addItem("Disco " + diskInfoLines[line][0]);
                thirdQuadrantBox.addItem("Disco " + diskInfoLines[line][0]);
                fourthQuadrantBox.addItem("Disco " + diskInfoLines[line][0]);
            }
            line++;
        }
        
        line=0;
        disks= new int[ndisks];
        ndisks=0;
        while(line < diskInfoLines.length){
            if(line<diskInfoLines.length && diskInfoLines[line][5].contains("disk")){  
                disks[ndisks]=line;
                ndisks++;
                line++;
                if(line<diskInfoLines.length && diskInfoLines[line][5].contains("part"))
                {
                    nparts++;
                    while(line<diskInfoLines.length && diskInfoLines[line][5].contains("part")){
                        line++;
                    }
                }
            }else{
                    line++;
            }
        }
        
        line=0;
        parts= new int[nparts];
        nparts=-1;
        while(line < diskInfoLines.length){
            if(line<diskInfoLines.length && diskInfoLines[line][5].contains("disk")){  
                ndiskparts=0;
                line++;
                if(line<diskInfoLines.length && diskInfoLines[line][5].contains("part"))
                {
                    nparts++;
                    while(line<diskInfoLines.length && diskInfoLines[line][5].contains("part")){
                        ndiskparts++;
                        line++;
                    }
                }
                parts[nparts]=ndiskparts;
            }else{
                    line++;
            }
        }   
    }
    
    private void updateDiskInfo(int disk){
        int i = disks[disk];
        diskChart.setTitle(diskInfoLines[i][0]);
        diskDataset.clear();
        for(int j=1; j<=parts[i];j++){
            diskDataset.setValue(diskInfoLines[disks[i]+j][0], Long.valueOf(diskInfoLines[disks[i]+j][3]));
        }
    }
    
    private void prepareFileInfo(){
        fileInfo = execShellCommand("ls -lh / ");
    }
    
    private void commandLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandLineButtonActionPerformed
        try{
            Process p = Runtime.getRuntime().exec("x-terminal-emulator");//trocar para abrir linha do linux
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
                firstPanel.removeAll();
                firstPanel.add(new JScrollPane(processTable));
                firstPanel.validate();
            }
        };
        tt1memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                ChartPanel myChart = new ChartPanel(memoryChart.getBarChart());
                myChart.setPreferredSize(new Dimension(570,430));
                firstPanel.removeAll();
                firstPanel.add(myChart);
                firstPanel.validate();
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                firstTabbedPane.setSelectedIndex(0);
                firstQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                firstTabbedPane.setSelectedIndex(1);
                t1.schedule(tt1process,new Date(), 1000);

            }
            case 2 -> {
                //fazer a thread (timer) aqui e em todos as outras chamadas de prepareMemoryInfo() que estão nas funções que tratam de cada quadrante;
                firstTabbedPane.setSelectedIndex(1);
                t1.schedule(tt1memory,new Date(),500);
                //prepareMemoryInfo();
                //firstQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                firstTabbedPane.setSelectedIndex(0);
                prepareFileInfo();
                firstQuadrantTxt.setText(fileInfo);
            }
            case 4 -> {
                firstTabbedPane.setSelectedIndex(1);
                updateDiskInfo(index - 4);
                ChartPanel myChart = new ChartPanel(diskChart);
                myChart.setPreferredSize(new Dimension(570, 430));
                firstPanel.removeAll();
                firstPanel.add(myChart);
                firstPanel.validate();
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
                secondPanel.removeAll();
                secondPanel.add(new JScrollPane(processTable));
                secondPanel.validate();
            }
        };
        tt2memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                ChartPanel myChart = new ChartPanel(memoryChart.getBarChart());
                myChart.setPreferredSize(new Dimension(570,430));
                secondPanel.removeAll();
                secondPanel.add(myChart);
                secondPanel.validate();
            }
        };
        switch (index) {
            case 0 -> {
                prepareHardwareInfo();
                secondTabbedPane.setSelectedIndex(0);
                secondQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                secondTabbedPane.setSelectedIndex(1);
                t2.schedule(tt2process,new Date(),1000);
            }
            case 2 -> {
                secondTabbedPane.setSelectedIndex(1);
                t2.schedule(tt2memory,new Date(),500);
                
            }
            case 3 -> {
                secondTabbedPane.setSelectedIndex(0);
                prepareFileInfo();
                secondQuadrantTxt.setText(fileInfo);
            }
            case 4 -> {
                secondTabbedPane.setSelectedIndex(1);
                updateDiskInfo(index - 4);
                ChartPanel myChart = new ChartPanel(diskChart);
                myChart.setPreferredSize(new Dimension(570, 430));
                secondPanel.removeAll();
                secondPanel.add(myChart);
                secondPanel.validate();
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
                thirdPanel.removeAll();
                thirdPanel.add(new JScrollPane(processTable));
                thirdPanel.validate();
            }
        };
        tt3memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                ChartPanel myChart = new ChartPanel(memoryChart.getBarChart());
                myChart.setPreferredSize(new Dimension(570,430));
                thirdPanel.removeAll();
                thirdPanel.add(myChart);
                thirdPanel.validate();
            }
        };
        switch (index) {
            case 0 -> {
                thirdTabbedPane.setSelectedIndex(0);
                prepareHardwareInfo();
                thirdQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                thirdTabbedPane.setSelectedIndex(1);
                t3.schedule(tt3process,new Date(),1000);
                //prepareProcessInfo();
                //thirdQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                thirdTabbedPane.setSelectedIndex(1);
                t3.schedule(tt3memory,new Date(),500);
                //prepareMemoryInfo();
                //thirdQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                thirdTabbedPane.setSelectedIndex(0);
                prepareFileInfo();
                thirdQuadrantTxt.setText(fileInfo);
            }
            case 4 -> {
                thirdTabbedPane.setSelectedIndex(1);
                updateDiskInfo(index - 4);
                ChartPanel myChart = new ChartPanel(diskChart);
                myChart.setPreferredSize(new Dimension(570, 430));
                thirdPanel.removeAll();
                thirdPanel.add(myChart);
                thirdPanel.validate();
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
                fourthPanel.removeAll();
                fourthPanel.add(new JScrollPane(processTable));
                fourthPanel.validate();
            }
        };
        tt4memory = new TimerTask(){
            @Override
            public void run(){
                prepareMemoryInfo();
                ChartPanel myChart = new ChartPanel(memoryChart.getBarChart());
                myChart.setPreferredSize(new Dimension(570,430));
                fourthPanel.removeAll();
                fourthPanel.add(myChart);
                fourthPanel.validate();
            }
        };
        switch (index) {
            case 0 -> {
                fourthTabbedPane.setSelectedIndex(0);
                prepareHardwareInfo();
                fourthQuadrantTxt.setText(hardwareInfo);
            }
            case 1 -> {
                fourthTabbedPane.setSelectedIndex(1);
                t4.schedule(tt4process,new Date(),1000);
                //prepareProcessInfo();
                //fourthQuadrantTxt.setText(processInfo);
            }
            case 2 -> {
                fourthTabbedPane.setSelectedIndex(1);
                t4.schedule(tt4memory,new Date(),500);
                //prepareMemoryInfo();
                //fourthQuadrantTxt.setText(memoryInfo);
            }
            case 3 -> {
                fourthTabbedPane.setSelectedIndex(0);
                prepareFileInfo();
                fourthQuadrantTxt.setText(fileInfo);
            }
            case 4 -> {
                fourthTabbedPane.setSelectedIndex(1);
                updateDiskInfo(index - 4);
                ChartPanel myChart = new ChartPanel(diskChart);
                myChart.setPreferredSize(new Dimension(570, 430));
                fourthPanel.removeAll();
                fourthPanel.add(myChart);
                fourthPanel.validate();
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
    private javax.swing.JPanel firstPanel;
    private javax.swing.JComboBox<String> firstQuadrantBox;
    private javax.swing.JTextPane firstQuadrantTxt;
    private javax.swing.JScrollPane firstScroll;
    private javax.swing.JTabbedPane firstTabbedPane;
    private javax.swing.JPanel fourthPanel;
    private javax.swing.JComboBox<String> fourthQuadrantBox;
    private javax.swing.JTextPane fourthQuadrantTxt;
    private javax.swing.JScrollPane fourthScroll;
    private javax.swing.JTabbedPane fourthTabbedPane;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JComboBox<String> secondQuadrantBox;
    private javax.swing.JTextPane secondQuadrantTxt;
    private javax.swing.JScrollPane secondScroll;
    private javax.swing.JTabbedPane secondTabbedPane;
    private javax.swing.JPanel thirdPanel;
    private javax.swing.JComboBox<String> thirdQuadrantBox;
    private javax.swing.JTextPane thirdQuadrantTxt;
    private javax.swing.JScrollPane thirdScroll;
    private javax.swing.JTabbedPane thirdTabbedPane;
    // End of variables declaration//GEN-END:variables

    
    private void removeProcess(String[] splitProcessInfo) {
        int i =0, j=0;
        while( i<pTableModel.getRowCount()){
            String value = pTableModel.getValueAt(i, 0);
            if(pTableModel.getValueAt(i, 0).equals(splitProcessInfo[j]))
                pTableModel.remove(pTableModel.getProcessInfoAt(i));
            i++;
            j += pTableModel.getColumnCount();
        }
    }


    private void fillProcessArray(String[] splitProcessInfo) {
        int numLinhas = splitProcessInfo.length/10, coluna = 0;
        for(int i = 0; i<numLinhas;i++){
            int j = i + coluna;
            ProcessInfo pi = new ProcessInfo(splitProcessInfo[j],splitProcessInfo[j+1],splitProcessInfo[j+2],splitProcessInfo[j+3],splitProcessInfo[j+4],splitProcessInfo[j+5],splitProcessInfo[j+6],
                                splitProcessInfo[j+7],splitProcessInfo[j+8],splitProcessInfo[j+9]);
            pTableModel.add(pi);
            coluna+=9;
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

    private void setColumnNames() {
        processTable.getColumnModel().getColumn(0).setHeaderValue("PID");
        processTable.getColumnModel().getColumn(1).setHeaderValue("USER");
        processTable.getColumnModel().getColumn(2).setHeaderValue("PRIO");
        processTable.getColumnModel().getColumn(3).setHeaderValue("NICE");
        processTable.getColumnModel().getColumn(4).setHeaderValue("S");
        processTable.getColumnModel().getColumn(5).setHeaderValue("%CPU");
        processTable.getColumnModel().getColumn(6).setHeaderValue("%MEM");
        processTable.getColumnModel().getColumn(7).setHeaderValue("START");
        processTable.getColumnModel().getColumn(8).setHeaderValue("TIME");
        processTable.getColumnModel().getColumn(9).setHeaderValue("CMD");
    }
}
