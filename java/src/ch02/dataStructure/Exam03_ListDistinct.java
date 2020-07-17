package ch02.dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class Exam03_ListDistinct {
    public static void main(String[] args) {
        List<String> before = new ArrayList<>();
        before.add("1");
        before.add("1");
        before.add("2");
        before.add("3");
        before.add("3");
        before.add("4");
        before.add("7");
        before.add("6");
        before.add("6");
        before.add("5");
        before.add("5");
        before.add("5");

        List<String> byLogic = getDistinctByLogic(before);
        System.out.println("byLogic : " + byLogic);
        System.out.println("-----------------");
        List<String> byHashSet = getDistinctByHashSet(before);
        System.out.println("byHashSet : " +byHashSet);
        System.out.println("-----------------");
        List<String> byTreeSet = getDistinctByTreeSet(before);
        System.out.println("byTreeSet : " + byTreeSet);
        System.out.println("-----------------");
        List<String> byStream = getDistinctByStream(before);
        System.out.println("byStream : " + byStream);
    }

    public static List<String> getDistinctByLogic(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (!result.contains(str))
                result.add(str);
        }
        return result;
    }

    public static List<String> getDistinctByHashSet(List<String> list) {
        HashSet<String> tmp = new HashSet<>(list);
        List<String> result = new ArrayList<>(tmp);
        return result;
    }
    public static List<String> getDistinctByTreeSet(List<String> list) {
        TreeSet<String> tmp = new TreeSet<>(list);
        List<String> result = new ArrayList<>(tmp);
        return result;
    }
    public static List<String> getDistinctByStream(List<String> list) {
        List<String> result = new ArrayList<>();
        //result = list.stream().distinct().collect(Collectors.toList());
        result = list.parallelStream().distinct().collect(Collectors.toList());
        return result;
    }
}
