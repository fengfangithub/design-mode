package mode.funfactory.improve;

/**
 * @author fengfan
 * @date 2023/3/3 14:37
 * @since JDK1.8
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        System.out.println("文件Logger创建...");
        return new FileLogger();
    }
}
