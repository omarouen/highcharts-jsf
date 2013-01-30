/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.kevindoran.highcharts.example;

import javax.faces.bean.ManagedBean;
import nz.co.kevindoran.highcharts.ColumnChartSeries;

/**
 *
 * @author kevin
 */
// Obviously, inheritence, or some other resue mechanism would typically be used
// other than just copying the class code.
@ManagedBean
public class NZEthnicPopulation2006 {
    private ColumnChartSeries nzEuropeanSeries = new ColumnChartSeries();
    private ColumnChartSeries maoriSeries = new ColumnChartSeries();
    private ColumnChartSeries pacificSeries = new ColumnChartSeries();
    private ColumnChartSeries asianSeries = new ColumnChartSeries();

    private static String[] ageGroups = {"0-14", "15-39", "40-64", "65 and Over", "All ages"};
    private static int[] nzEuropeanData = {73, 71, 81, 91, 77};
    private static int[] maoriData = {24, 17, 10, 5, 15};
    private static int[] asianData = {9, 13, 8, 4, 10};
    private static int[] pacificData = {12, 8, 5, 2, 7};
    
    public NZEthnicPopulation2006() {
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