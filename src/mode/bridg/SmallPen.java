package mode.bridg;

/**
 * @author fengfan
 * @date 2023/3/9 10:36
 * @since JDK1.8
 */
public class SmallPen extends Pen{
    @Override
    public void drawing() {
        System.out.println("小号毛笔开始绘画");
        color.coloring();
    }
}
