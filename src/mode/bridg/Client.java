package mode.bridg;

/**
 * @author fengfan
 * @date 2023/3/9 10:38
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Pen bigPen = new BigPen();
        bigPen.setColor(new RedColor());
        bigPen.drawing();
    }
}
