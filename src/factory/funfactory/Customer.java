package factory.funfactory;


/**
 * @author fengfan
 * @date 2023/2/24 16:42
 * @since JDK1.8
 */
public class Customer {
    public static void main(String[] args) {
        FunFactory factory = new FactoryBMW320();
        BMW bmw320 = factory.createBMW();

        FunFactory factory1 = new FactoryBMW523();
        BMW bmw = factory1.createBMW();

        System.out.println(bmw.getName());
    }
}
