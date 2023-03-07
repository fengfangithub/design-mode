package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:11
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Hero gailun = new Director(new GailunBuilder()).construct();
        System.out.println(gailun);

        Hero vn = new Director(new VnBuilder()).construct();
        System.out.println(vn);
    }
}
