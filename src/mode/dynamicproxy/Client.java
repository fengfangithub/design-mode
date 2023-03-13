package mode.dynamicproxy;

/**
 * @author fengfan
 * @date 2023/3/13 15:39
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = (ITeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        iTeacherDao.teach();
    }
}
