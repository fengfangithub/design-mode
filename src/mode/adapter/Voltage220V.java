package mode.adapter;

/**
 * @author fengfan
 * @date 2023/3/8 15:34
 * @since JDK1.8
 */
public class Voltage220V {
    public int output220V(){
        System.out.println("被适配者输出："  + 220 + "V");
        return 220;
    }
}
