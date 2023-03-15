package mode.chain;

/**
 * @author fengfan
 * @date 2023/3/15 10:13
 * @since JDK1.8
 */
public class PurchaseRequest {
    private String purpose;
    private int amt;
    private int number;

    public PurchaseRequest(String purpose, int amt, int number) {
        this.purpose = purpose;
        this.amt = amt;
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
