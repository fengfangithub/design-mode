package mode.prototype;

import java.io.*;

/**
 * @author fengfan
 * @date 2023/3/6 15:47
 * @since JDK1.8
 */
public class DeepClone implements Serializable {
    private static final long serialVersionUID = 6319963435178724617L;
    private String name;
    private int age;
    private String color;
    private IdCard idCard;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", idCard=" + idCard +
                '}';
    }

    protected DeepClone deepClone() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                return (DeepClone) ois.readObject();
            }
        }
    }
}
