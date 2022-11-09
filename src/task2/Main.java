package task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> value = new LinkedHashMap<>();
        value.put(10, "first");
        value.put(1, "second");
        value.put(9, "third");
        value.put(2, "forth");
        value.put(8, "fifth");
        value.put(3, "six");
        value.put(7, "seventh");
        value.put(4, "eighth");
        value.put(6, "ninth");
        value.put(5, "tenth");
        System.out.println("value = " + value);
        for (Map.Entry<Integer, String> integer : value.entrySet()
        ) {
            Integer keyList = integer.getKey();
            String valueList = integer.getValue();
            System.out.println(keyList+":"+valueList);
        }
    }
}
