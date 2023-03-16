package mode.mediator;

/**
 * @author fengfan
 * @date 2023/3/16 14:23
 * @since JDK1.8
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, String type, Mediator mediator) {
        super(name, type, mediator);
    }

    @Override
    public void constact(String message) {
        mediator.constact(message, this);
    }
}
