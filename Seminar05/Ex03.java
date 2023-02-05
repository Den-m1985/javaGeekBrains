import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex03 {
    /*
    Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь
     */
    public static void main(String[] args) {
        System.out.println(Skobki());
    }

    private static Boolean Skobki() {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        String str = "a+(d*3)";
        Stack<Character> currentSkibob = new Stack<>();
        for (int index = 0; index < str.length(); index++) {
            Character a = str.charAt(index);
            if (pairs.containsKey(a))  // Если элемент а есть
                currentSkibob.push(pairs.get(a)); // то добавляем в Stack.
            else if (pairs.containsValue(a)){ // Если а встретилась в значении
                if (currentSkibob.isEmpty())  // и если значение пустое, возвращаем false
                    return false;
                else if (a!=currentSkibob.pop())  // Если а не равно тому, что мы хотим удалить
                    return false;
            }
        }
        return currentSkibob.isEmpty(); // Если пустой, то возвращаем true
    }

    public static boolean FindSkobki() {
        String s1 = "[a+(1*3)]";
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');

        Stack<Character> states = new Stack<>();
        for (int i = 0; i < s1.length(); i++) {
            char el = s1.charAt(i);
            // РµСЃР»Рё РЅР°С€Р»Рё С‚Р°РєРѕР№ РєР»СЋС‡
            if (pairs.containsKey(el)) {
                //Р·Р°РєРёРґС‹РІР°РµРј Р·РЅР°С‡РµРЅРёРµ
                states.push(pairs.get(el));
            }
            //РµСЃР»Рё РЅР°С€Р»Рё Р·РЅР°С‡РµРЅРёРµ
            else if (pairs.containsValue(el))
                if (states.isEmpty())
                    return false;
                else if (el != states.pop())
                    return false;
        }
        return states.isEmpty();
    }

}
