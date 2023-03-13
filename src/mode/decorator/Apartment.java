package mode.decorator;

/**
 * @author fengfan
 * @date 2023/3/10 16:41
 * @since JDK1.8
 */
public class Apartment extends House{
    @Override
    protected void display() {
        System.out.println("别墅房子展示");
    }
}
