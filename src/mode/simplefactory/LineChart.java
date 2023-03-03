package mode.simplefactory;

/**
 * @author fengfan
 * @date 2023/3/1 21:13
 * @since JDK1.8
 */
public class LineChart extends AbstractChart {
    @Override
    public void create() {
        System.out.println("创建折线图表...");
    }

    @Override
    public void display() {
        System.out.println("画折线图表...");
    }
}
