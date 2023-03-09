package mode.componet;

/**
 * @author fengfan
 * @date 2023/3/9 11:42
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile computer = new Folder("电脑文件夹");
        AbstractFile txts = new Folder("图片文件夹");
        AbstractFile imgs = new Folder("txt文件夹");

        AbstractFile img1 = new ImageFile("香蕉图片");
        AbstractFile img2 = new ImageFile("苹果图片");

        AbstractFile txt1 = new TextFile("记录文档");
        AbstractFile txt2 = new TextFile("笔记文档");

        computer.add(txts);
        computer.add(imgs);

        imgs.add(img1);
        imgs.add(img2);

        txts.add(txt1);
        txts.add(txt2);

        computer.print();
        //imgs.print();
    }
}
