package designprinciple.openclose.improve;

/**
 * @author fengfan
 * @date 2023/3/1 21:13
 * @since JDK1.8
 */
public class BarChart extends AbstractChart {
    @Override
    public void display() {
        System.out.println("画柱状图表...");
    }
}
