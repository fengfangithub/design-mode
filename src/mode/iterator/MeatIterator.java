package mode.iterator;

import java.util.Iterator;

/**
 * @author fengfan
 * @date 2023/3/16 10:02
 * @since JDK1.8
 */
public class MeatIterator implements Iterator<Commodity> {
    private Commodity[] commodities;
    private int index;

    public MeatIterator(Commodity[] commodities) {
        this.commodities = commodities;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index != commodities.length;
    }

    @Override
    public Commodity next() {
        Commodity commodity = commodities[index];
        index++;
        return commodity;
    }
}
