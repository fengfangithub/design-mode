package mode.simplefactory.improve;

/**
 * @author fengfan
 * @date 2023/3/3 11:35
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
