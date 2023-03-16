package mode.interpreter;

import java.util.Map;

/**
 * @author fengfan
 * @date 2023/3/15 15:41
 * @since JDK1.8
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
