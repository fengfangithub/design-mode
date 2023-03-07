package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:09
 * @since JDK1.8
 */
public class Director {
    private HeroBuild heroBuild;

    public Director(HeroBuild heroBuild) {
        this.heroBuild = heroBuild;
    }

    public Hero construct() {
        heroBuild.buildName();
        heroBuild.buildSex();
        heroBuild.buildPosition();
        return heroBuild.getResult();
    }
}
