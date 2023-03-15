package mode.command;

/**
 * @author fengfan
 * @date 2023/3/15 14:00
 * @since JDK1.8
 */
public class LightOnCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }
}
