package mode.componet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengfan
 * @date 2023/3/9 11:38
 * @since JDK1.8
 */
public class Folder extends AbstractFile{
    private List<AbstractFile> abstractFileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    protected void add(AbstractFile abstractFile) {
        abstractFileList.add(abstractFile);
    }

    @Override
    protected void remove(AbstractFile abstractFile) {
        abstractFileList.remove(abstractFile);
    }

    @Override
    protected void print() {
        System.out.println("****文件夹名称：" + name + "****");
        for (AbstractFile abstractFile : abstractFileList){
            abstractFile.print();
        }
    }
}
