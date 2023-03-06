package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 10:10
 * @since JDK1.8
 */
public class Single {
    private Single() {

    }

    private static class SingleInstance{
        private final static Single single = new Single();
    }

    public static Single getInstance(){
        return SingleInstance.single;
    }
}
