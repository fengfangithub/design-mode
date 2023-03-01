package designprinciple.openclose.improve;

/**
 * @author fengfan
 * @date 2023/3/1 21:16
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.setAbstractChart(new BarChart());
        chartDisplay.display();

        chartDisplay.setAbstractChart(new PieChart());
        chartDisplay.display();
    }
}
