package mode.funfactory.improve;

/**
 * @author fengfan
 * @date 2023/3/3 14:20
 * @since JDK1.8
 */
public class DataBaseLogger implements Logger {
    @Override
    public void wirteLog() {
        System.out.println("数据库日志写入...");
    }
}
