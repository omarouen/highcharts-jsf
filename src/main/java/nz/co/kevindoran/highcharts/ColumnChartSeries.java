package nz.co.kevindoran.highcharts;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class ColumnChartSeries {
   private ArrayList<ColumnData> columnData = new ArrayList<>();

   public ColumnChartSeries() {
   }
   
   public void addColumn(String columnName, Number value) {
       ColumnData d = new ColumnData(columnName, value);
       columnData.add(d);
   }
   
   public void removeAll() {
       columnData = new ArrayList<>();
   }
   
   public List<ColumnData> getColumns() {
       return columnData;
   }
}
