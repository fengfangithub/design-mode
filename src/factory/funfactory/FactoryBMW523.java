package factory.funfactory;

/**
 * @author fengfan
 * @date 2023/2/28 15:57
 * @since JDK1.8
 */
public class FactoryBMW523 implements FunFactory{
    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
