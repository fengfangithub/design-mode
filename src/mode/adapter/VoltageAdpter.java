package mode.adapter;

/**
 * @author fengfan
 * @date 2023/3/8 15:36
 * @since JDK1.8
 */
public class VoltageAdpter extends Voltage220V implements Voltage5V{
    @Override
    public int output5v() {
        int output220V = output220V();
        System.out.println("适配者将220V转换为5V输出");
        return output220V / 44;
    }
}
