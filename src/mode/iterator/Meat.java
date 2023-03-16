package mode.iterator;

import java.util.Iterator;

/**
 * @author fengfan
 * @date 2023/3/16 9:57
 * @since JDK1.8
 */
public class Meat implements Partition{
    private Commodity[] commodities;

    public Meat() {
        commodities = new Commodity[3];
        commodities[0] = new Commodity("鱼肉");
        commodities[1] = new Commodity("鸡肉");
        commodities[2] = new Commodity("佩奇肉");
    }

    @Override
    public Iterator<Commodity> createIterator() {
        return new MeatIterator(commodities);
    }
}
