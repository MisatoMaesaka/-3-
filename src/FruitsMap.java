import java.util.HashMap;
import java.util.Map;

public class FruitsMap {
    public static Map<String, String> getFruitsMap() {

        Map map = new HashMap();

        map.put("apple", "リンゴ");
        map.put("banana", "バナナ");
        map.put("orange", "オレンジ");

        return map;
    }
}
