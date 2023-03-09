package mode.adapter;

/**
 * @author fengfan
 * @date 2023/3/8 15:37
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Voltage5V voltage5V = new VoltageAdpter();
        System.out.println("转换后输出：" + voltage5V.output5v() + "V");
    }
}
