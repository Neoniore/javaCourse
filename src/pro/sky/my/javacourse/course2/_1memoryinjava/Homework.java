package pro.sky.my.javacourse.course2._1memoryinjava;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
//        int value = 33;
//        changeValue(value);
//        System.out.println("value = " + value);

//        Integer value1 = 33;
//        changeValue1(value1);
//        System.out.println("value1 = " + value1);

//        Integer[] value = new Integer[]{3, 4};
//        System.out.println("value.toString() = " + Arrays.toString(value));
//        changeValue3(value);
//        System.out.println("value.toString() = " + Arrays.toString(value));

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person.toString() = " + person.toString());
        changePerson(person);
        System.out.println("person.toString() = " + person.toString());

    }

//    public static void changeValue(int value) {
//        value = 22;
//    }

//    public static void changeValue1(Integer value) {
//        System.out.println(value.hashCode());
//        value = 22;
//    }

//    public static void changeValue2(Integer[] value) {
//        System.out.println("value.toString() = " + Arrays.toString(value));
//        value = new Integer[]{1, 2};
//        System.out.println("value.toString() = " + Arrays.toString(value));
//    }

//    public static void changeValue3(Integer[] value) {
//        value[0] = 99;
//    }

    public static void changePerson(Person person) {
        //person = new Person("Ilya", "Lagutenko");
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
