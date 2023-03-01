package factory.abstractfactory;

/**
 * @author fengfan
 * @date 2023/2/28 17:06
 * @since JDK1.8
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();

    //制造空调
    public Aircondition createAircondition();
}
