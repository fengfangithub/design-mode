package factory.funfactory;

/**
 * @author fengfan
 * @date 2023/2/28 15:56
 * @since JDK1.8
 */
public class FactoryBMW320 implements FunFactory{
    @Override
    public BMW createBMW() {
        return new BMW320();
    }
}
