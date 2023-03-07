package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:08
 * @since JDK1.8
 */
public class GailunBuilder implements HeroBuild {
    private Hero hero = new Hero();

    @Override
    public void buildName() {
        hero.setName("盖伦");
    }

    @Override
    public void buildSex() {
        hero.setSex("男");
    }

    @Override
    public void buildPosition() {
        hero.setPosition("上单");
    }

    @Override
    public Hero getResult() {
        return hero;
    }
}
