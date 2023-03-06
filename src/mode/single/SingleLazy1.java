package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:50
 * @since JDK1.8
 */
public class SingleLazy1 {
    private static SingleLazy1 singleLazy;

    private SingleLazy1() {
    }

    public static synchronized SingleLazy1 getInstance() {
        if(singleLazy == null){
            singleLazy = new SingleLazy1();
        }
        return singleLazy;
    }
}
