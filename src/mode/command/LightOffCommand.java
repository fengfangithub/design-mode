package mode.command;

/**
 * @author fengfan
 * @date 2023/3/15 14:00
 * @since JDK1.8
 */
public class LightOffCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }
}
