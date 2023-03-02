package designprinciple.syntheticmultiplexing.improve;

/**
 * @author fengfan
 * @date 2023/3/2 15:25
 * @since JDK1.8
 */
public class CustomerDao  {
    private DBUtil dbUtil;

    public void addCustomer(){
        dbUtil.getConnection();
        System.out.println("添加用户信息...");
    }

    public void setDbUtil(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }
}
