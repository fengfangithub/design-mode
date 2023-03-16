package mode.mediator;

/**
 * @author fengfan
 * @date 2023/3/16 14:19
 * @since JDK1.8
 */
public abstract class Person {
    protected String name;
    protected String type;
    protected Mediator mediator;

    public Person(String name, String type, Mediator mediator) {
        this.name = name;
        this.type = type;
        this.mediator = mediator;
    }

    public abstract void constact(String message);

    public void getMessage(String message) {
        System.out.println(type + "：" + name + "，收取到消息：" + message);
    }
}
