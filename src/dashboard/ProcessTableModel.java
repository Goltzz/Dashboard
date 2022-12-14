/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProcessTableModel extends AbstractTableModel {
    protected static final String COLUMN_NAMES[] = {"PID","USUARIO","PR","NI","S","%CPU","%MEM","START","TIME","COMANDO"};
    private List<ProcessInfo> processArray;
    
    public ProcessTableModel(){
        processArray = new ArrayList<>();
    }
    
    public void add(ProcessInfo pInfo){
        processArray.add(pInfo);
    }
    
    public void remove(ProcessInfo pInfo){
        int row = processArray.indexOf(pInfo);
        if (row >= 0) {
            processArray.remove(pInfo);
            fireTableRowsDeleted(row, row);
        }
    }
    
    public void update(String[][] splitProcessInfo) {
        int coluna = 0;
        for(int row = 0; row < processArray.size();row++){
            processArray.get(row).setPid(splitProcessInfo[row][0]);
            processArray.get(row).setUser(splitProcessInfo[row][1]);
            processArray.get(row).setPriority(splitProcessInfo[row][2]);
            processArray.get(row).setNice(splitProcessInfo[row][3]);
            processArray.get(row).setStatus(splitProcessInfo[row][4]);
            processArray.get(row).setCpu(splitProcessInfo[row][5]);
            processArray.get(row).setMem(splitProcessInfo[row][6]);
            processArray.get(row).setStart(splitProcessInfo[row][7]);
            processArray.get(row).setTime(splitProcessInfo[row][8]);
            processArray.get(row).setCommand(splitProcessInfo[row][9]);
        }
    }

    public ProcessInfo getProcessInfoAt(int row) {
        return processArray.get(row);
    }
    @Override
    public int getRowCount() {
       return processArray.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    public List<ProcessInfo> getProcessArray() {
        return processArray;
    }
    
    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        String value = null;
        ProcessInfo pInfo = getProcessInfoAt(rowIndex);
        switch (columnIndex) {
            case 0:
                value = pInfo.getPid();
                break;
            case 1:
                value = pInfo.getUser();
                break;
            case 2:
                value = pInfo.getPriority();
                break;
            case 3:
                value = pInfo.getNice();
                break;
            case 4:
                value = pInfo.getStatus();
                break;
            case 5:
                value = pInfo.getCpu();
                break;
            case 6:
                value = pInfo.getMem();
                break;
            case 7:
                value = pInfo.getStart();
                break;
            case 8:
                value = pInfo.getTime();
                break;
            case 9:
                value = pInfo.getCommand();
                break;
        }
        return value;
    }
}
