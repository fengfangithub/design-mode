package mode.funfactory;

/**
 * @author fengfan
 * @date 2023/3/3 14:24
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        LoggerSimple loggerSimple = LoggerFactorySimple.createLogger("db");
        loggerSimple.wirteLog();
    }
}
