package mode.flyweight;

/**
 * @author fengfan
 * @date 2023/3/13 11:41
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getInstance();

        //生成两颗黑子
        IgoChessman black1 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman black2 = igoChessmanFactory.getIgoChessman("b");
        //生成两颗白子
        IgoChessman white1 = igoChessmanFactory.getIgoChessman("w");
        IgoChessman white2 = igoChessmanFactory.getIgoChessman("w");

        //显示棋子，同时设置位置
        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        white1.display(new Coordinates(5, 6));
        white2.display(new Coordinates(7, 8));
    }
}
