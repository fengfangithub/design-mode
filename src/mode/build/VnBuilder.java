package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:11
 * @since JDK1.8
 */
public class VnBuilder implements HeroBuild{
    private Hero hero = new Hero();

    @Override
    public void buildName() {
        hero.setName("维恩");
    }

    @Override
    public void buildSex() {
        hero.setSex("女");
    }

    @Override
    public void buildPosition() {
        hero.setPosition("下路");
    }

    @Override
    public Hero getResult() {
        return hero;
    }
}
