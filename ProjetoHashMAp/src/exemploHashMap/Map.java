package exemploHashMap;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        HashMap<String, Integer> funcId = new HashMap<>();

        funcId.put("Helena", 12345);
        funcId.put("Leticia", 54321);
        funcId.put("Leandro", 67890);
        funcId.put("Michelle", 98765);

        System.out.println(funcId);
        System.out.println(funcId.get("Helena"));
        System.out.println(funcId.containsKey("Robson"));
        System.out.println(funcId.containsValue(54321));

        funcId.replace("Leandro", 109874);
        System.out.println(funcId);

        funcId.putIfAbsent("Lenice", 325412);
        System.out.println(funcId);

        funcId.remove("Michelle");
        System.out.println(funcId);
    }
}
