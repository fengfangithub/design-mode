package mode.flyweight;

/**
 * @author fengfan
 * @date 2023/3/13 11:30
 * @since JDK1.8
 */
public abstract class IgoChessman {
    public abstract String getColor();
    public void display(Coordinates coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );
    }
}
