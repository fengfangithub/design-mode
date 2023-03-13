package mode.facade;

/**
 * @author fengfan
 * @date 2023/3/13 10:05
 * @since JDK1.8
 */
public class XiaoAiFacade {
    private Air air;
    private Light light;
    private TV tv;

    public XiaoAiFacade(Air air, Light light, TV tv) {
        this.air = air;
        this.light = light;
        this.tv = tv;
    }

    public void sleep(){
        System.out.println("小爱同学，我要睡觉了");
        air.turnOff();
        light.turnOff();
        tv.turnOff();
    }

    public void getUp(){
        System.out.println("小爱同学，我起床了");
        air.turnOn();
        light.turnOn();
        tv.turnOn();
    }
}
