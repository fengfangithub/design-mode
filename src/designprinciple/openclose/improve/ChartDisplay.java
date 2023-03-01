package designprinciple.openclose.improve;

/**
 * @author fengfan
 * @date 2023/3/1 21:14
 * @since JDK1.8
 */
public class ChartDisplay {
    private AbstractChart abstractChart;

    public void setAbstractChart(AbstractChart abstractChart) {
        this.abstractChart = abstractChart;
    }

    public void display(){
       abstractChart.display();
    }
}
