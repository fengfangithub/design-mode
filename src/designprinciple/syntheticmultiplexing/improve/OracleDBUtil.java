package designprinciple.syntheticmultiplexing.improve;

/**
 * @author fengfan
 * @date 2023/3/2 15:38
 * @since JDK1.8
 */
public class OracleDBUtil extends DBUtil{
    @Override
    public void getConnection() {
        System.out.println("获取oracle数据库连接...");
    }
}
