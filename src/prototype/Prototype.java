package prototype;

/**
 * @author fengfan
 * @date 2023/2/28 22:01
 * @since JDK1.8
 */
public interface Prototype extends Cloneable{

    Object clone() throws CloneNotSupportedException;

    void display();
}
