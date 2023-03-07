package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:05
 * @since JDK1.8
 */
public class Hero {
    private String name;
    private String sex;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
