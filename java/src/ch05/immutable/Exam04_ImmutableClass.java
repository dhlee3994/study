package ch05.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class Exam04_ImmutableClass {
    private final int age;
    private final String name;
    private final HashMap<String, Object> map;

    public Exam04_ImmutableClass(int age, String name, HashMap<String, Object> map) {
        this.age = age;
        this.name = name;

        HashMap<String, Object> tmpMap = new HashMap<>();
        String key;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tmpMap.put(key, map.get(key));
        }
        this.map = tmpMap;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Object> getMap() {
        // return map;
        return (HashMap<String, Object>) map.clone();
    }

    public static void main(String[] args) {
        String name = "dhlee";
        int age = 27;

        HashMap<String, Object> inKorea = new HashMap<>();
        inKorea.put("age in Korea", 29);
        inKorea.put("name in Korea", "이동현");

        Exam04_ImmutableClass ic = new Exam04_ImmutableClass(age, name, inKorea);
        System.out.println("age : " + age + ", name : " + name + ", inKorea : " + inKorea);
        System.out.println("ic.age : " + ic.getAge() + ", ic.name : " + ic.getName() + ", ic.getMap : " + ic.getMap());
        System.out.println("age == ic.getAge() ? " + (age == ic.getAge()));
        System.out.println("name == ic.getName() ? " + (name == ic.getName()));
        System.out.println("inKorea == ic.getMap() ? " + (inKorea == ic.getMap()));

        System.out.println("--------------10 years later------------------------");

        age = 37;
        name = "Lee DongHyun";
        inKorea.replace("age in Korea", 39);
        inKorea.replace("name in Korea", "멋쟁이 동현");
        System.out.println("ic.age : " + ic.getAge() + ", ic.name : " + ic.getName() + ", ic.getMap : " + ic.getMap());

        System.out.println("-----------------------------------------------------");

        HashMap<String, Object> testMap = ic.getMap();
        testMap.put("job", "programmer");
        System.out.println(ic.getMap());
    }

}
