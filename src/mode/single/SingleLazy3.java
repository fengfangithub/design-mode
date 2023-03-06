package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:50
 * @since JDK1.8
 */
public class SingleLazy3 {
    private static SingleLazy3 singleLazy;

    private SingleLazy3() {
    }

    public static SingleLazy3 getInstance() {
        if(singleLazy == null){
            synchronized (SingleLazy3.class){
                if(singleLazy == null){
                    singleLazy = new SingleLazy3();
                }
            }
        }
        return singleLazy;
    }
}
