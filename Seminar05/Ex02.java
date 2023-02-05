import java.util.HashMap;
import java.util.Map;

public class Ex02 {
        /*
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        буква может не меняться, а остаться такой же. (Например, note - code)
        Пример 1:
        Input: s = "foo", t = "bar"
        Output: false
        Пример 2:
        Input: s = "paper", t = "title"
         */

        public static void main(String[] args) {

            System.out.println(IsIzomorph());

        }

        public static Boolean IsIzomorph(){
            Map<Character, Character> pairs = new HashMap<>();
            String s1 = "title";
            String s2 = "title";
            // s = "paper",  t = "tiqle"
            // key -> value
            // p -> t
            // a -> i
            // p -> q - не изоморфны
            // e -> l
            // r -> e
            // addaa  изоморфно eggee? - да
            // addaa  изоморфно egghh? - нет
            if (s1.length()!=s2.length())
                return false;
            if (s1.equals(s2))
                return true;
            for (int i = 0; i < s1.length(); i++) {
                Character a = s1.charAt(i);//Символ первого слова
                Character b = s2.charAt(i);//символ второго слова
                // РµСЃР»Рё РІ map СѓР¶Рµ РµСЃС‚СЊ РєР»СЋС‡ "a", С‚Рѕ С‚РѕРіРґР° Р·РЅР°С‡РµРЅРёРµ РїРѕ РєР»СЋС‡Сѓ a РґРѕР»Р¶РЅРѕ СЃРѕРѕС‚РІРµС‚СЃС‚РІРѕРІР°С‚СЊ "b"
                if (pairs.containsKey(a) && pairs.get(a)!=b) // containsKey если есть ключ возвращает true.
                    return false;
                else
                    pairs.put(a, b);
            }
            return true;
        }

/*
    public static boolean IsIzomorph(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2)) {
            return true;
        }
        Map<Character, Character> sub = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (sub.containsKey(a) && sub.get(a) != b)
                return false;
            else {
                sub.put(a, b);
            }
        }
        return true;
    }
      */



}
