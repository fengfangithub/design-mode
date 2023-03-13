package mode.decorator;

/**
 * @author fengfan
 * @date 2023/3/10 16:45
 * @since JDK1.8
 */
public class WallDecorator extends Decorator{
    public WallDecorator(House house) {
        super(house);
    }

    @Override
    protected void display() {
        super.display();
        painting();
    }

    public void painting(){
        System.out.println("刷墙开始");
    }

}
