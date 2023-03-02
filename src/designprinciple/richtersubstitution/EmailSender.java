package designprinciple.richtersubstitution;

/**
 * @author fengfan
 * @date 2023/3/2 9:49
 * @since JDK1.8
 */
public class EmailSender {

    public void send(CommonCustomer commonCustomer) {
        System.out.println("发送普通用户邮件...");
    }

    public void send(VIPCustomer vipCustomer) {
        System.out.println("发送Vip用户邮件...");
    }
}
