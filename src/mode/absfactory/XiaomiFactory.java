package mode.absfactory;

/**
 * @author fengfan
 * @date 2023/3/3 16:59
 * @since JDK1.8
 */
public class XiaomiFactory implements ElecFactory{
    @Override
    public Refrigerator createRefrigerator() {
        return new XiaomiRefrigerator();
    }

    @Override
    public Air createAir() {
        return new XiaomiAir();
    }
}
