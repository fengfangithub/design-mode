package mode.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author fengfan
 * @date 2023/3/16 10:02
 * @since JDK1.8
 */
public class VegetableIterator implements Iterator<Commodity> {
    private List<Commodity> commodities;
    private int index;

    public VegetableIterator(List<Commodity> commodities) {
        this.commodities = commodities;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index != commodities.size();
    }

    @Override
    public Commodity next() {
        Commodity commodity = commodities.get(index);
        index++;
        return commodity;
    }
}
