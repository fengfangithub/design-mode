package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:50
 * @since JDK1.8
 */
public class SingleLazy2 {
    private static SingleLazy2 singleLazy;

    private SingleLazy2() {
    }

    public static SingleLazy2 getInstance() {
        if(singleLazy == null){
            synchronized (SingleLazy2.class){
                singleLazy = new SingleLazy2();
            }
        }
        return singleLazy;
    }
}
