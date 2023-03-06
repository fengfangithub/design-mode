package mode.prototype;

import java.io.Serializable;

/**
 * @author fengfan
 * @date 2023/3/6 15:18
 * @since JDK1.8
 */
public class IdCard implements Serializable {
    private static final long serialVersionUID = 7625090532242404161L;
    private String no;
    private String address;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "no='" + no + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
