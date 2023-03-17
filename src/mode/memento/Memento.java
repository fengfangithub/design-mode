package mode.memento;

/**
 * @author fengfan
 * @date 2023/3/16 15:14
 * @since JDK1.8
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
