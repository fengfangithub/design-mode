package prototype;

import java.util.ArrayList;

/**
 * 浅拷贝
 *
 * @author fengfan
 * @date 2023/2/28 21:44
 * @since JDK1.8
 */
public class ShallowClone implements Prototype{
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
        return super.clone();
    }

    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arrayList=" + arrayList +
                '}';
    }
}
