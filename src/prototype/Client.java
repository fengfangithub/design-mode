package prototype;

import java.util.ArrayList;

/**
 * @author fengfan
 * @date 2023/2/28 22:09
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) throws Exception{
//        ShallowClone shallowClone = new ShallowClone();
//        shallowClone.setName("张三");
//        shallowClone.setAge(100);
//        shallowClone.setArrayList(new ArrayList<>());
//        System.out.println(shallowClone);
//
//        ShallowClone shallowClone1 = (ShallowClone) shallowClone.clone();
//        System.out.println(shallowClone1);
//
//        System.out.println(shallowClone == shallowClone1);
//        System.out.println(shallowClone.getArrayList() == shallowClone1.getArrayList());

//        DeepClone deepClone = new DeepClone();
//        deepClone.setName("张三");
//        deepClone.setAge(100);
//        deepClone.setArrayList(new ArrayList<>());
//        System.out.println(deepClone);
//
//        DeepClone deepClone1 = (DeepClone) deepClone.clone();
//        System.out.println(deepClone1);
//
//        System.out.println(deepClone == deepClone1);
//        System.out.println(deepClone.getArrayList() == deepClone1.getArrayList());

        SerializClone serializClone = new SerializClone();
        serializClone.setName("张三");
        serializClone.setAge(100);
        serializClone.setArrayList(new ArrayList<>());
        System.out.println(serializClone);

        SerializClone serializClone1 = (SerializClone) serializClone.deepClone();
        System.out.println(serializClone1);
        System.out.println(serializClone == serializClone1);
        System.out.println(serializClone.getArrayList() == serializClone1.getArrayList());



    }
}
