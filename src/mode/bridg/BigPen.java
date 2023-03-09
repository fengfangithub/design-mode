package mode.bridg;

/**
 * @author fengfan
 * @date 2023/3/9 10:23
 * @since JDK1.8
 */
public class BigPen extends Pen{

    @Override
    public void drawing() {
        System.out.println("大号毛笔开始绘画");
        color.coloring();
    }
}
