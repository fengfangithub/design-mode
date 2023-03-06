package mode.single;

/**
 * @author fengfan
 * @date 2023/3/6 10:17
 * @since JDK1.8
 */
public enum SingleEnum {
    /**
     * 属性
     */
    INSTANCE;
    public void hello(){
        System.out.println("hello word");
    }
}
