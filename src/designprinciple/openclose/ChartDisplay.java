package designprinciple.openclose;

/**
 * @author fengfan
 * @date 2023/3/1 21:14
 * @since JDK1.8
 */
public class ChartDisplay {
    public void display(String type){
        if("pie".equals(type)){
            PieChart pieChart = new PieChart();
            pieChart.display();
        }else if("bar".equals(type)){
            BarChart barChart = new BarChart();
            barChart.display();
        }
    }
}
