package mode.build;

/**
 * @author fengfan
 * @date 2023/3/7 10:06
 * @since JDK1.8
 */
public interface HeroBuild {
    void buildName();
    void buildSex();
    void buildPosition();
    Hero getResult();
}
