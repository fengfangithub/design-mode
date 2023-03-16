package mode.mediator;

/**
 * @author fengfan
 * @date 2023/3/16 14:22
 * @since JDK1.8
 */
public class Tenant extends Person{

    public Tenant(String name, String type, Mediator mediator) {
        super(name, type, mediator);
    }

    @Override
    public void constact(String message) {
        mediator.constact(message, this);
    }
}
