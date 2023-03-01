package factory.simplefactory;

/**
 * @author fengfan
 * @date 2023/2/24 16:42
 * @since JDK1.8
 */
public class Customer {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        BMW bmw320 = simpleFactory.createBMW(320);
        BMW bmw523 = simpleFactory.createBMW(523);
        System.out.println(bmw320);
        System.out.println(bmw523);
    }
}
