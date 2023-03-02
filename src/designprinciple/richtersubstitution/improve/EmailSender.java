package designprinciple.richtersubstitution.improve;

/**
 * @author fengfan
 * @date 2023/3/2 9:49
 * @since JDK1.8
 */
public class EmailSender {

    public void send(Customer customer) {
        System.out.println("发送" + customer.getName() + "邮件...");
    }
}
