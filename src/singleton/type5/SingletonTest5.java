package singleton.type5;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getInstance();
        Sigleton sigleton1 = Sigleton.getInstance();
        System.out.println(sigleton == sigleton1);
        System.out.println(sigleton.hashCode());
        System.out.println(sigleton1.hashCode());
    }
}

//懒汉式，双重检查
class Sigleton {
    private static volatile Sigleton instance;

    private Sigleton() {

    }

    //提供一个静态的公有方法，当使用到该方法时，才回去创建instance
    //双重检查，解决线程安全问题
    public static Sigleton getInstance() {
        if(instance == null){
            synchronized (Sigleton.class){
                if(instance == null){
                    instance = new Sigleton();
                }
            }
        }
        return instance;
    }

}
