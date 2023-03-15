package mode.chain;

/**
 * @author fengfan
 * @date 2023/3/15 10:40
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest("电脑", 250000, 1);

        Director director = new Director("张三");
        Dean dean = new Dean("李四");
        VicePresident vicePresident = new VicePresident("王五");
        Principal principal = new Principal("赵六");

        director.setSuccessor(dean);
        dean.setSuccessor(vicePresident);
        vicePresident.setSuccessor(principal);

        director.handleRequest(purchaseRequest);
    }
}
