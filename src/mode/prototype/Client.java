package mode.prototype;

import java.io.IOException;

/**
 * @author fengfan
 * @date 2023/3/6 15:19
 * @since JDK1.8
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
//        Student student = new Student();
//        student.setName("张三");
//        student.setAge(18);
//        IdCard idCard = new IdCard();
//        idCard.setNo("123");
//        idCard.setAddress("四川");
//        student.setIdCard(idCard);
//        System.out.println(student);
//
//        Student student1 = (Student) student.clone();
//        System.out.println(student1);
//
//        System.out.println(student == student1);
//        System.out.println(student.getIdCard() == student1.getIdCard());

        DeepClone deepClone = new DeepClone();
        deepClone.setName("张三");
        deepClone.setAge(18);
        IdCard idCard = new IdCard();
        idCard.setNo("123");
        idCard.setAddress("四川");
        deepClone.setIdCard(idCard);
        System.out.println(deepClone);

        DeepClone deepClone1 = deepClone.deepClone();
        System.out.println(deepClone1);

        System.out.println(deepClone == deepClone1);
        System.out.println(deepClone.getIdCard() == deepClone1.getIdCard());
    }
}
