import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsMap {
    public static void main(String[] args) {

        int count = 5;

        // Mapの宣言
        Map<String, String> map = new HashMap<>();

        // Mapにキーと値を格納
        map.put("apple", "リンゴ");
        map.put("banana", "バナナ");
        map.put("orange", "オレンジ");

        // Mapからデータを取得
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        // Listを宣言し、valuesメソッドを使用してMapの値を取得する
        List<String> list = new ArrayList<>(map.values());

        for (int i = 0; i <= count; i++) {
            try {
                // 要素を指定してListの値を取得
                System.out.println(list.get(i));
            } catch (Exception e) {
                System.out.println("例外処理になります。");
            }
        }
    }
}



