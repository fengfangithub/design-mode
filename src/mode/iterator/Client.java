package mode.iterator;

import java.util.Iterator;

/**
 * @author fengfan
 * @date 2023/3/16 10:12
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("=====输入肉类分区的商品==========");
        Partition meat = new Meat();
        Iterator<Commodity> meatIterator = meat.createIterator();
        while(meatIterator.hasNext()){
            System.out.println(meatIterator.next().getName());
        }
        System.out.println("=====输入蔬菜分区的商品==========");
        Partition vegetable = new Vegetable();
        Iterator<Commodity> vagetableIterator = vegetable.createIterator();
        while (vagetableIterator.hasNext()){
            System.out.println(vagetableIterator.next().getName());
        }
    }
}
