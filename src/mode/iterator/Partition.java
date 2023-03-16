package mode.iterator;

import java.util.Iterator;

/**
 * @author fengfan
 * @date 2023/3/16 9:54
 * @since JDK1.8
 */
public interface Partition {
    Iterator<Commodity> createIterator();
}
