package seminar1;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class Task5 {
    public static void main(String[] args) {
//        assertConditionA();
//        assertConditionB();
        sum(1234567890, 999999999);
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = 0;
        assert x >= 0;
    }

    public static int sum(int a, int b) {
        long result = (long) a + b;
        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);
        assert result < Integer.MAX_VALUE : "Переполнение переменных";
        return a+b;
    }
}
