package mode.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengfan
 * @date 2023/3/16 15:17
 * @since JDK1.8
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
