package mode.facade;

/**
 * @author fengfan
 * @date 2023/3/13 10:08
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        XiaoAiFacade xiaoAiFacade = new XiaoAiFacade(new Air(), new Light(), new TV());
        xiaoAiFacade.sleep();
        xiaoAiFacade.getUp();
    }
}
