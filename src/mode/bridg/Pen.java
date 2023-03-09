package mode.bridg;

/**
 * @author fengfan
 * @date 2023/3/9 10:13
 * @since JDK1.8
 */
public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void drawing();
}
