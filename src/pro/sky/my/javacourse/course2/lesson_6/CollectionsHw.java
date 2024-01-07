package pro.sky.my.javacourse.course2.lesson_6;

import java.util.*;

public class CollectionsHw {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
        task3Alternative();
//        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        Integer number = null;
        for (int i = 0; i < nums.size(); i++) {
            if (!nums.get(i).equals(number) && nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + " ");
                number = nums.get(i);
            }
        }
        System.out.println();
    }

    public static void task3() {
        List<String> strings = new ArrayList<>(List.of("два", "один", "два", "три", "один", "три", "пять", "три"));
        Collections.sort(strings);
        String word = null;
        for (int i = 0; i < strings.size(); i++) {
            if (!strings.get(i).equals(word)) {
                System.out.println(strings.get(i));
                word = strings.get(i);
            }
        }
    }

    public static void task3Alternative() {
        List<String> strings = new ArrayList<>(List.of("два", "один", "два", "три", "один", "три", "пять", "три"));
        Set<String> stringsSet = new HashSet<>(strings);
        System.out.println(stringsSet);
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("два", "один", "два", "три", "один", "три", "пять", "три"));
        Collections.sort(strings);
        System.out.println(strings);
        String word = strings.get(0);
        int counter = 1;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).equals(word)) {
                counter++;
            } else {
                System.out.println(counter);
                counter = 1;
            }
            word = strings.get(i);
        }
        if (counter > 1) System.out.println(counter);
    }
}
