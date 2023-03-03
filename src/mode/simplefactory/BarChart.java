package mode.simplefactory;

/**
 * @author fengfan
 * @date 2023/3/1 21:13
 * @since JDK1.8
 */
public class BarChart extends AbstractChart{
    @Override
    public void create() {
        System.out.println("创建柱状状图表...");
    }

    @Override
    public void display() {
        System.out.println("画柱状状图表...");
    }
}
