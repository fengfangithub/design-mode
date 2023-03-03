package mode.funfactory.improve;

/**
 * @author fengfan
 * @date 2023/3/3 14:39
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.wirteLog();

        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.wirteLog();

    }
}
