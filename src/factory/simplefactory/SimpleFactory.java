package factory.simplefactory;

/**
 * @author fengfan
 * @date 2023/2/24 16:06
 * @since JDK1.8
 */
public class SimpleFactory {

    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }

}
