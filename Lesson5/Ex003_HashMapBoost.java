package Lesson_05;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        // первый аогумент длина, 2й коэфициент когда нужно удваивать длину.
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
    }
}