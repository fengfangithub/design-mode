package mode.decorator;

/**
 * @author fengfan
 * @date 2023/3/10 16:42
 * @since JDK1.8
 */
public class Decorator extends House{
    private House house;

    public Decorator(House house) {
        this.house = house;
    }

    @Override
    protected void display() {
        house.display();
    }
}
