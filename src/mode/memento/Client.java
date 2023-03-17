package mode.memento;

/**
 * @author fengfan
 * @date 2023/3/16 15:21
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("状态满血");
        Caretaker caretaker = new Caretaker();
        caretaker.add(originator.saveState());

        //打怪掉血了
        originator.setState("状态半血");
        System.out.println("打怪后的状态....");
        System.out.println(originator);

        //恢复
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复后状态....");
        System.out.println(originator);
    }
}
