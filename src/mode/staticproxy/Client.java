package mode.staticproxy;

/**
 * @author fengfan
 * @date 2023/3/13 15:19
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDaoProxy(new TeacherDao());
        iTeacherDao.teach();
    }
}
