package singleton.type3;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getInstance();
        Sigleton sigleton1 = Sigleton.getInstance();
        System.out.println(sigleton == sigleton1);
        System.out.println(sigleton.hashCode());
        System.out.println(sigleton1.hashCode());
    }
}

//懒汉式（静态变量）
class Sigleton {
    private static Sigleton instance;

    private Sigleton() {

    }

    //提供一个静态的公有方法，当使用到该方法时，才回去创建instance
    //即懒汉式，线程不安全的
    public static Sigleton getInstance() {
        if(instance == null){
            instance = new Sigleton();
        }
        return instance;
    }

}
