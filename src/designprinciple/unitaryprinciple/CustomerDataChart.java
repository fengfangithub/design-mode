package designprinciple.unitaryprinciple;

/**
 * @author fengfan
 * @date 2023/3/1 16:21
 * @since JDK1.8
 */
public class CustomerDataChart {
    public void getConnetion(){
        System.out.println("数据库连接...");
    }

    public void findCustomers(){
        System.out.println("查询客户信息...");
    }

    public void createChart(){
        System.out.println("创建图表...");
    }

    public void displayChart(){
        System.out.println("展示图表...");
    }
}
