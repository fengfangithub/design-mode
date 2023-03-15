package mode.command;

/**
 * @author fengfan
 * @date 2023/3/15 14:03
 * @since JDK1.8
 */
public class SimpleRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public SimpleRemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
    }
}
