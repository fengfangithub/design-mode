package singleton.type2;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getInstance();
        Sigleton sigleton1 = Sigleton.getInstance();
        System.out.println(sigleton == sigleton1);
    }
}

//饿汉式（静态变量）
class Sigleton {
    private static Sigleton instance;

    static {
        //在静态代码块中创建单例对象
        instance = new Sigleton();
    }

    private Sigleton() {

    }

    public static Sigleton getInstance() {
        return instance;
    }

}
