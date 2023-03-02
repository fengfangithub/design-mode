package designprinciple.intfisolation;

/**
 * @author fengfan
 * @date 2023/3/2 14:28
 * @since JDK1.8
 */
public class ConcreteClass implements CustomerDataDisplay{
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

    @Override
    public void createReport() {
        System.out.println("创建报表...");
    }

    @Override
    public void displayReport() {
        System.out.println("展示报表...");
    }
}
