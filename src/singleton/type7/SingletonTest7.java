package singleton.type7;

/**
 * @author fengfan
 * @date 2023/2/23 16:41
 * @since JDK1.8
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.INSTANCE;
        Sigleton sigleton1 = Sigleton.INSTANCE;
        System.out.println(sigleton == sigleton1);
        System.out.println(sigleton.hashCode());
        System.out.println(sigleton1.hashCode());
    }
}

//懒汉式，枚举类实现
enum Sigleton {
    INSTANCE;

    public void sayOk(){
        System.out.println();
    }

}

//将已有的类，通过枚举改造成单例
class Singleton {
    private Singleton() {
    }

    public static enum SingletonEnum {
        SINGLETON;
        private Singleton instance = null;

        private SingletonEnum() {
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;
        }
    }
}
