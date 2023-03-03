package mode.abs;

/**
 * @author fengfan
 * @date 2023/3/3 16:58
 * @since JDK1.8
 */
public class HaierFactory implements ElecFactory{
    @Override
    public Refrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public Air createAir() {
        return new HaierAir();
    }
}
