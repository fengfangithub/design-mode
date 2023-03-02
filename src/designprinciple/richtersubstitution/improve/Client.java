package designprinciple.richtersubstitution.improve;

/**
 * @author fengfan
 * @date 2023/3/2 10:20
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Customer customer = new CommonCustomer();
        customer.setName("普通用户");
        EmailSender sender = new EmailSender();
        sender.send(customer);

        customer = new VIPCustomer();
        customer.setName("VIP用户");
        sender.send(customer);

    }
}
