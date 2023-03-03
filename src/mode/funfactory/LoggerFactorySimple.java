package mode.funfactory;

/**
 * @author fengfan
 * @date 2023/3/3 14:20
 * @since JDK1.8
 */
public class LoggerFactorySimple {
    public static LoggerSimple createLogger(String type) {
        if (type.equalsIgnoreCase("db")) {
            LoggerSimple logger = new DataBaseLoggerSimple();
            return logger;
        } else if (type.equalsIgnoreCase("file")) {
            LoggerSimple logger = new FileLoggerSimple();
            return logger;
        } else {
            return null;
        }
    }
}
