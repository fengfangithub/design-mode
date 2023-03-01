package prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * @author fengfan
 * @date 2023/2/28 22:18
 * @since JDK1.8
 */
public class SerializClone implements Serializable {
    private static final long serialVersionUID = -8769851736622702515L;
    private String name;
    private int age;
    private ArrayList<String> arrayList;

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
    public String toString() {
        return "SerializClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arrayList=" + arrayList +
                '}';
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream bao = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bao)) {
            oos.writeObject(this);
            try (ByteArrayInputStream bas = new ByteArrayInputStream(bao.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bas)) {
                return ois.readObject();
            }
        }
    }
}
