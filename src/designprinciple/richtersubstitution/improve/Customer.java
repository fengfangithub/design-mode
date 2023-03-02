package designprinciple.richtersubstitution.improve;

/**
 * @author fengfan
 * @date 2023/3/2 9:59
 * @since JDK1.8
 */
public abstract class Customer {
    protected String name;
    protected String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
