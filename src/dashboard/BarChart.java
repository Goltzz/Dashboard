/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author gugol
 */
class BarChart {
    private String titulo;
    private JFreeChart barChart;
    private DefaultCategoryDataset dataSet;
    private String txtEixoX;
    private String txtEixoY;

    public BarChart(String titulo, String txtEixoX, String txtEixoY) {
        this.titulo = titulo;
        this.txtEixoX = txtEixoX;
        this.txtEixoY = txtEixoY;
    }

    public void setDataSet(DefaultCategoryDataset dataSet) {
        this.dataSet = dataSet;
    }

    public void createChart() {
        this.barChart = ChartFactory.createBarChart(titulo, txtEixoY, txtEixoX, dataSet, PlotOrientation.HORIZONTAL, true, true, false);
    }

    public JFreeChart getBarChart() {
        return barChart;
    }
    
    
}
