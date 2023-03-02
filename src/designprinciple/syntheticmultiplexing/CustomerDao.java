package designprinciple.syntheticmultiplexing;

/**
 * @author fengfan
 * @date 2023/3/2 15:25
 * @since JDK1.8
 */
public class CustomerDao extends DBUtil{
    public void addCustomer(){
        super.getConnection();
        System.out.println("添加用户信息...");
    }
}
