package ch02.dataStructure;

import java.util.ArrayList;

public class Exam02_ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] arr1 = list.toArray(new String[list.size()]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        String[] arr2 = new String[list.size()];
        int cursor = 0;
        for (String str : list) {
            arr2[cursor++] = str;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
