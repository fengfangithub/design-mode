package mode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fengfan
 * @date 2023/3/16 9:57
 * @since JDK1.8
 */
public class Vegetable implements Partition{
    private List<Commodity> commodities;

    public Vegetable() {
        commodities = new ArrayList<>();
        commodities.add(new Commodity("黄瓜"));
        commodities.add(new Commodity("南瓜"));
        commodities.add(new Commodity("土豆"));
    }

    @Override
    public Iterator<Commodity> createIterator() {
        return new VegetableIterator(commodities);
    }
}
