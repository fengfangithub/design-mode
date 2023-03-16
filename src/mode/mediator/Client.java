package mode.mediator;

/**
 * @author fengfan
 * @date 2023/3/16 14:27
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Person hso = new HouseOwner("张三", "房主", mediator);
        Person tenant = new Tenant("李四", "租客", mediator);

        mediator.setTenant(tenant);
        mediator.setHoseOwner(hso);

        tenant.constact("租客想租一个套一");
        hso.constact("房主这里没有套一");
    }
}
