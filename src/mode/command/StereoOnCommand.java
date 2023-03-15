package mode.command;

/**
 * @author fengfan
 * @date 2023/3/15 14:21
 * @since JDK1.8
 */
public class StereoOnCommand implements Command{
    private StereoReceiver stereoReceiver;

    public StereoOnCommand(StereoReceiver stereoReceiver) {
        this.stereoReceiver = stereoReceiver;
    }

    @Override
    public void execute() {
        stereoReceiver.on();
    }
}
