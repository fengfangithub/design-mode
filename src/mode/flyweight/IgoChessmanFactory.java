package mode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengfan
 * @date 2023/3/13 11:38
 * @since JDK1.8
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    private static Map<String, IgoChessman> map;

    private IgoChessmanFactory() {
        map = new HashMap<>();
        map.put("b", new BlackIgoChessman());
        map.put("w", new WhiteIgoChessman());
    }

    public static IgoChessmanFactory getInstance(){
        return igoChessmanFactory;
    }

    public IgoChessman getIgoChessman(String color) {
        return map.get(color);
    }
}
