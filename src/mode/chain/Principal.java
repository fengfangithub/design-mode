package mode.chain;

/**
 * @author fengfan
 * @date 2023/3/15 10:16
 * @since JDK1.8
 */
public class Principal extends Approver {

    public Principal(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmt() >= 500000) {
            System.out.println("校长：" + name + "审批了单号" + purchaseRequest.getNumber() + "的采购单");
        } else {
            System.out.println("审批出错，请检查审批金额");
        }
    }
}
