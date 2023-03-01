package designprinciple.unitaryprinciple.improve;

/**
 * @author fengfan
 * @date 2023/3/1 20:35
 * @since JDK1.8
 */
public class CustomerDao {
    private DBUtil dbUtil;

    public void findCustomers() {
        System.out.println("查询客户信息...");
    }
}
