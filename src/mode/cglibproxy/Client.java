package mode.cglibproxy;

/**
 * @author fengfan
 * @date 2023/3/13 16:20
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        teacherDao.teach();
    }
}
