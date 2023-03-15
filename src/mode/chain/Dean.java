package mode.chain;

/**
 * @author fengfan
 * @date 2023/3/15 10:16
 * @since JDK1.8
 */
public class Dean extends Approver {

    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmt() >= 50000 && purchaseRequest.getAmt() < 100000) {
            System.out.println("院长：" + name + "审批了单号" + purchaseRequest.getNumber() + "的采购单");
        } else {
            successor.handleRequest(purchaseRequest);
        }
    }
}
