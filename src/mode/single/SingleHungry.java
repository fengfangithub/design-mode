package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:32
 * @since JDK1.8
 */
public class SingleHungry {
    private final static SingleHungry SINGLE_HUNGRY = new SingleHungry();

    private SingleHungry() {
    }

    public static SingleHungry getInstance() {
        return SINGLE_HUNGRY;
    }
}
