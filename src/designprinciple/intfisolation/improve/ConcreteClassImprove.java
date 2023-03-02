package designprinciple.intfisolation.improve;

/**
 * @author fengfan
 * @date 2023/3/2 14:28
 * @since JDK1.8
 */
public class ConcreteClassImprove implements DataHanler, ChartHandler {
    @Override
    public void dataRead() {
        System.out.println("数据读取...");
    }

    @Override
    public void createChart() {
        System.out.println("创建图表...");
    }

    @Override
    public void displayChart() {
        System.out.println("展示图表...");
    }
}
