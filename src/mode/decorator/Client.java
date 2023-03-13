package mode.decorator;

/**
 * @author fengfan
 * @date 2023/3/10 17:01
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        House apartment = new Apartment();
        House wallDecorator = new WallDecorator(apartment);
        wallDecorator.display();
    }
}
