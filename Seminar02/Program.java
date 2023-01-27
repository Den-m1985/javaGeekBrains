public class Program {
    public static void main(String[] args) {
        /*
        Дано целое число N (>0) и символы c1 и c2.
        Написать метод, который вернет строку длины N, которая
        состоит из чередующихся символов c1 и c2, начиная с c1.
        N=5
        c1=”Oleg”
        c2=”Vasya”
        res = “OlegVasyaOlegVasyaOleg”
         */
        int N = 5;
        String c1 = "Oleg", c2 = "Vasya";
        String c3 = "";
        for (int i = 0; i < N; i++) {
            //if (i %2 ==0)
             //   c3 += c1;
            //else c3 += c2;
            c3 = (i %2==0) ? c3 + c1 : c3 + c2;  // Записали по другому.
        }
        System.out.println(c3);

        /*
        Задание №2
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcddad.
        Выход abcd
        charAt(i) возаращает символ на i позиции
        indefOf(s) => возвращает место где находится s, если символ не найдет, то вернет -1.
         */
        String a = "aaaabbbcddad";
        System.out.println(compressString(a));

    }

    public static String compressString(String name){
        String b = "";
        for (int i = 0; i < name.length(); i++) {
            if (b.indexOf(name.charAt(i)) == -1) b += name.charAt(i);
            //System.out.print(name.charAt(i) + " ");
        }
        return b;
    }
}
