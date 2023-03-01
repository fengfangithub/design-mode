package singleton.type1;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getInstance();
        Sigleton sigleton1 = Sigleton.getInstance();
        System.out.println(sigleton == sigleton1);
    }
}

//饿汉式（静态变量）
class Sigleton {
    private final static Sigleton INSTANCE = new Sigleton();

    private Sigleton() {
    }

    public static Sigleton getInstance() {
        return INSTANCE;
    }

}
