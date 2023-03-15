package mode.chain;

/**
 * @author fengfan
 * @date 2023/3/15 10:15
 * @since JDK1.8
 */
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public Approver getSuccessor() {
        return successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void handleRequest(PurchaseRequest purchaseRequest);
}
