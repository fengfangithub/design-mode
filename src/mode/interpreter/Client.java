package mode.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author fengfan
 * @date 2023/3/15 15:48
 * @since JDK1.8
 */
public class Client {
    public static Expression calculator(String expStr) { // expStr = a+b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();// [a, +, b]
        Expression left = null;
        Expression right = null;
        //遍历我们的字符数组， 即遍历 [a, +, b]
        //针对不同的情况，做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //
                    left = stack.pop();// 从 stack 取出 left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i]));// 取出右表达式 "b"
                    stack.push(new AddExpression(left, right));// 然后根据得到 left 和 right 构建 AddExpresson 加入stack
                    break;
                case '-': //
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并 push 到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后，stack 就得到最后 Expression
        return stack.pop();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + ch + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String expStr = "b+c-a";
        Expression expression = calculator(expStr);
        System.out.println(expression.interpreter(getValue(expStr)));
    }

}
