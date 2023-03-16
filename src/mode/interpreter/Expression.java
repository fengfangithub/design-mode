package mode.interpreter;

import java.util.Map;

/**
 * @author fengfan
 * @date 2023/3/15 15:15
 * @since JDK1.8
 */
public abstract class Expression {
    public abstract int interpreter(Map<String, Integer> var);
}
