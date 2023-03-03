package mode.abs;

/**
 * @author fengfan
 * @date 2023/3/3 17:18
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        ElecFactory elecFactory = new HaierFactory();
        elecFactory.createAir();
        elecFactory.createRefrigerator();

        elecFactory = new XiaomiFactory();
        elecFactory.createAir();
        elecFactory.createRefrigerator();
    }
}
