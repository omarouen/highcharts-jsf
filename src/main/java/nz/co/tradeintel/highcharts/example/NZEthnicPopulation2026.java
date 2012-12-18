/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.tradeintel.highcharts.example;

import javax.faces.bean.ManagedBean;
import nz.co.tradeintel.highcharts.ColumnChartSeries;

/**
 * Creates a column chart representing the projected New Zealand population 
 * makeup in 2026.
 * 
 * @author Kevin Doran
 */
@ManagedBean
public class NZEthnicPopulation2026 {
    private ColumnChartSeries nzEuropeanSeries = new ColumnChartSeries();
    private ColumnChartSeries maoriSeries = new ColumnChartSeries();
    private ColumnChartSeries pacificSeries = new ColumnChartSeries();
    private ColumnChartSeries asianSeries = new ColumnChartSeries();

    private static String[] ageGroups = {"0-14", "15-39", "40-64", "65 and Over", "All ages"};
    private static int[] nzEuropeanData = {66, 64, 70, 82, 70};
    private static int[] maoriData = {28, 19, 12, 7, 16};
    private static int[] asianData = {18, 19, 16, 9, 16};
    private static int[] pacificData = {18, 12, 7, 3, 10};
    
    public NZEthnicPopulation2026() {
        populateSeries();
    }

    // Populate as in fill.
    private void populateSeries() {
        for(int i=0; i<ageGroups.length; i++) {
            nzEuropeanSeries.addColumn(ageGroups[i], nzEuropeanData[i]);
            maoriSeries.addColumn(ageGroups[i], maoriData[i]);
            pacificSeries.addColumn(ageGroups[i], pacificData[i]);
            asianSeries.addColumn(ageGroups[i], asianData[i]);
        }
    }

    public ColumnChartSeries getNzEuropeanSeries() {
        return nzEuropeanSeries;
    }

    public ColumnChartSeries getMaoriSeries() {
        return maoriSeries;
    }

    public ColumnChartSeries getPacificSeries() {
        return pacificSeries;
    }

    public ColumnChartSeries getAsianSeries() {
        return asianSeries;
    }
}
