package mode.adapter;

/**
 * @author fengfan
 * @date 2023/3/8 15:36
 * @since JDK1.8
 */
public class VoltageObjectAdpter implements Voltage5V{
    private Voltage220V voltage220V;

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int output220V = voltage220V.output220V();
        System.out.println("适配者将220V转换为5V输出");
        return output220V / 44;
    }
}
