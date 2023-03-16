package mode.mediator;

/**
 * @author fengfan
 * @date 2023/3/16 14:24
 * @since JDK1.8
 */
public class MediatorStructure implements Mediator {
    private Person hoseOwner;
    private Person tenant;

    public Person getHoseOwner() {
        return hoseOwner;
    }

    public void setHoseOwner(Person hoseOwner) {
        this.hoseOwner = hoseOwner;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == hoseOwner) {
            //如果是房主，则租房者获得信息
            tenant.getMessage(message);
        } else {
            //反正则是房主获得信息
            hoseOwner.getMessage(message);
        }
    }
}
