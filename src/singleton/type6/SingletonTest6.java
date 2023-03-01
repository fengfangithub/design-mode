package singleton.type6;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getInstance();
        Sigleton sigleton1 = Sigleton.getInstance();
        System.out.println(sigleton == sigleton1);
        System.out.println(sigleton.hashCode());
        System.out.println(sigleton1.hashCode());
    }
}

//懒汉式，静态内部类
class Sigleton {

    private Sigleton() {

    }

    //使用静态内部类，实现单例模式
    //静态内部类特点：当外层类装载时，内部不会装载；调用getInstance方法时回导致静态内部类装载，类装载时线程是安全的

    private static class SigletonInstance {
        private static final Sigleton INSTANCE = new Sigleton();
    }

    public static Sigleton getInstance() {
        return SigletonInstance.INSTANCE;
    }

}
