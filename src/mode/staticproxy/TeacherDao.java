package mode.staticproxy;

/**
 * @author fengfan
 * @date 2023/3/13 15:17
 * @since JDK1.8
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师开始教学");
    }
}
