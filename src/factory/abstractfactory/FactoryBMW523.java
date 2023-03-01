package factory.abstractfactory;

/**
 * @author fengfan
 * @date 2023/2/28 17:06
 * @since JDK1.8
 */
public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
