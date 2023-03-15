package mode.command;

/**
 * @author fengfan
 * @date 2023/3/15 14:22
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        StereoReceiver stereoReceiver = new StereoReceiver();
        Command lightOn = new LightOnCommand(lightReceiver);
        Command lightOff = new LightOffCommand(lightReceiver);
        Command stereoOn = new StereoOnCommand(stereoReceiver);
        Command stereoOff = new StereoOffCommand(stereoReceiver);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(0, lightOn, lightOff);
        simpleRemoteControl.setCommand(1,stereoOn, stereoOff);

        simpleRemoteControl.onButtonWasPushed(0);
        simpleRemoteControl.offButtonWasPushed(0);

        simpleRemoteControl.onButtonWasPushed(1);
        simpleRemoteControl.offButtonWasPushed(1);

    }
}
