package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList();

        ls.add(5);
        ls.add(18);
        ls.add(Integer.parseInt("7"));
        //ls.add(Integer.parseInt("type erasure"));

        System.out.println(ls);

        //   Ми можемо додати об’єкт типу String в List<Integer> лише тоді, коли наш рядок є числом,
//		і якщо ми використаємо
//		функцію перетворення рядка в числове значення - parseInt("--***--")
//   Якщо ми спробуємо додати в List<Integer> простий рядок із слів або ж число,
//		але, не використавши parseInt(), програма не скомпілюється.
// 	 Якщо ми спробуємо перетворити звичайний рядок у числове значення,
//		отримаємо NumberFormatException


    }
}



