import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //　正常に動いているか確認

        int count = 5;
        Map<String, String> map = FruitsMap.getFruitsMap();

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



