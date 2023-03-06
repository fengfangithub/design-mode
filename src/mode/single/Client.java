package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 10:19
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        SingleEnum singleEnum = SingleEnum.INSTANCE;
        SingleEnum singleEnum1 = SingleEnum.INSTANCE;
        System.out.println(singleEnum1 == singleEnum);
        singleEnum.hello();
    }
}
