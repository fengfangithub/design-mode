package mode.interpreter;

import java.util.Map;

/**
 * @author fengfan
 * @date 2023/3/15 15:32
 * @since JDK1.8
 */
public class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量名称，获取值
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
