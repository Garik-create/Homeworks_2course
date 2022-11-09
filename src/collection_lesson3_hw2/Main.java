package collection_lesson3_hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> strings = new HashMap<>();

        List<Integer> list1 = new ArrayList<>(3);
        list1 = makeRandomList();
        System.out.println("list1 = " + list1);
        int sumList1 = calculateListSum(list1);
//        System.out.println("sumList1 = " + sumList1);

        List<Integer> list2 = new ArrayList<>(3);
        list2 = makeRandomList();
        System.out.println("list2 = " + list2);
        int sumList2 = calculateListSum(list2);
//        System.out.println("sumList2 = " + sumList2);

        List<Integer> list3 = new ArrayList<>(3);
        list3 = makeRandomList();
        System.out.println("list3 = " + list3);
        int sumList3 = calculateListSum(list3);
//        System.out.println("sumList3 = " + sumList3);

        List<Integer> list4 = new ArrayList<>(3);
        list4 = makeRandomList();
        System.out.println("list4 = " + list4);
        int sumList4 = calculateListSum(list4);
//        System.out.println("sumList4 = " + sumList4);

        List<Integer> list5 = new ArrayList<>(3);
        list5 = makeRandomList();
        System.out.println("list5 = " + list5);
        int sumList5 = calculateListSum(list5);
//        System.out.println("sumList5 = " + sumList5);

        strings.put("list1", list1);
        strings.put("list2", list2);
        strings.put("list3", list3);
        strings.put("list4", list4);
        strings.put("list5", list5);

        System.out.println("string1 -> " + strings);

        Map<String, Integer> stringsNew = new HashMap<>();
        for (Map.Entry<String, List<Integer>> string : strings.entrySet()) {
            String keyStringsNew = string.getKey();
            List<Integer> stringValue = string.getValue();
            int sumStringValue = calculateListSum(stringValue);
            stringsNew.put(keyStringsNew, sumStringValue);
            System.out.println(keyStringsNew + " = " + sumStringValue);
        }
        System.out.println("string2 -> " + stringsNew);
    }

    public static ArrayList<Integer> makeRandomList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Integer v = (int) (Math.random() * 1000);
            list.add(v);
        }
        return list;
    }

    public static int calculateListSum(List<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }
}
