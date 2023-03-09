package mode.componet;

/**
 * @author fengfan
 * @date 2023/3/9 11:35
 * @since JDK1.8
 */
public abstract class AbstractFile {
    protected abstract void add(AbstractFile abstractFile);
    protected abstract void remove(AbstractFile abstractFile);
    protected abstract void print();
}
