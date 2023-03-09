package mode.componet;

/**
 * @author fengfan
 * @date 2023/3/9 13:45
 * @since JDK1.8
 */
public class TextFile extends AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    protected void add(AbstractFile abstractFile) {
        System.out.println("不支持该操作");
    }

    @Override
    protected void remove(AbstractFile abstractFile) {
        System.out.println("不支持该操作");
    }

    @Override
    protected void print() {
        System.out.println("TxT名称：" + name + ".jpg");
    }
}
