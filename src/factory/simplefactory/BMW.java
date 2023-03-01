package factory.simplefactory;

/**
 * @author fengfan
 * @date 2023/2/24 16:03
 * @since JDK1.8
 */
public abstract class BMW {
    private String name;

    public BMW() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
