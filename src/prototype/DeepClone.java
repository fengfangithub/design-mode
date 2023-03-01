package prototype;

import java.util.ArrayList;

/**
 * @author fengfan
 * @date 2023/2/28 22:13
 * @since JDK1.8
 */
public class DeepClone implements Prototype{
    private String name;
    private int age;
    private ArrayList<String> arrayList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = null;
        deepClone = (DeepClone) super.clone();
        deepClone.setArrayList((ArrayList<String>) getArrayList().clone());
        return deepClone;
    }

    @Override
    public void display() {
        System.out.println();
    }
}
