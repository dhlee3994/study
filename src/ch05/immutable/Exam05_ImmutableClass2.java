package ch05.immutable;

import java.util.HashMap;
import java.util.Iterator;

final class ImmutableClass {
    public final HashMap<String, Object> map;

    public ImmutableClass(HashMap<String, Object> map) {
        HashMap<String, Object> tmpMap = new HashMap<>();
        String key;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tmpMap.put(key, map.get(key));
        }
        this.map = tmpMap;
    }
}

public class Exam05_ImmutableClass2 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "dhlee");
        map.put("age", 29);

        ImmutableClass ic = new ImmutableClass(map);
        System.out.println(ic.map);

        ic.map.put("job", "programmer");
        System.out.println(ic.map);
    }
}
