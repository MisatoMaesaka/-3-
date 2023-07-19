import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("田中");
        names.add("鈴木");
        names.add("佐藤");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(1));

        Map<String,String> userMap = new HashMap<>();
        userMap.put("田中","島根県出身。20歳です。");
        userMap.put("鈴木","大阪府出身。22歳です。");
        userMap.put("山田","東京都出身。29歳です。");

        System.out.println(userMap.get("田中"));
        System.out.println(userMap.get("鈴木"));
        System.out.println(userMap.get("山田"));
ぎt
        String name = null;
        System.out.println("nameの文字列長を表示");
        System.out.println(name.length());
        System.out.println("処理終了");

    }
}
