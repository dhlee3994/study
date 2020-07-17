package ch02.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam01_ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"The", "URL", "of", "my", "blog", "is", "https://dhlee.dev"};

        List<String> list = java.util.Arrays.asList(arr);
        //list.add("a");
        System.out.println(list);

        List<String> list1 = new ArrayList<>(Arrays.asList(arr));
        list1.add("a");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, arr);
        list2.add("a");

        System.out.println(list2);
        List<String> list3 = new ArrayList<>();
        for (String str : arr) {
            list3.add(str);
        }
        list3.add("a");
        System.out.println(list3);
    }
}
