package mode.staticproxy;

/**
 * @author fengfan
 * @date 2023/3/13 15:18
 * @since JDK1.8
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理....");
        iTeacherDao.teach();
        System.out.println("结束代理....");
    }
}
