package mode.interpreter;

import java.util.Map;

/**
 * @author fengfan
 * @date 2023/3/15 15:31
 * @since JDK1.8
 */
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
