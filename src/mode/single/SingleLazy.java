package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 9:50
 * @since JDK1.8
 */
public class SingleLazy {
    private static SingleLazy singleLazy;

    private SingleLazy() {
    }

    public static SingleLazy getInstance() {
        if(singleLazy == null){
            singleLazy = new SingleLazy();
        }
        return singleLazy;
    }
}
