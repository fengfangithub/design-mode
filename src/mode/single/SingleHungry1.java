package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:32
 * @since JDK1.8
 */
public class SingleHungry1 {
    private static SingleHungry1 singleHungry1;

    static {
        singleHungry1 = new SingleHungry1();
    }

    private SingleHungry1() {
    }

    public static SingleHungry1 getInstance() {
        return singleHungry1;
    }
}
