
import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        // Постфиксная форма
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3 т.е. сначала 23* (2*3) затем 16+ (1+6) = 7
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            // Проверяем на число
            if (isDigit(exp[i])) {
                // добавляем с СТЭК предварительно преобразовав из строки в число. ????????????
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    // если не число, то разбиваем на операции, вычисляем и кладем в СТЭК.
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        // Извлекаем последний элемент
        System.out.printf("%d\n", st.pop());
    }
}