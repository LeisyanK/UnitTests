package seminar3.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    private static MyClass myClass;

    @Test
    void evenOddNumber() {
        myClass = new MyClass();
        int n = 30;
        boolean actual = myClass.evenOddNumber(n);
        assertTrue(actual, "метод evenOddNumber() работает некорректно");
    }

    @Test
    void numberInInterval() {
        myClass = new MyClass();
        int n = 30;
        boolean actual = myClass.numberInInterval(n);
        assertTrue(actual, "метод numberInInterval() работает некорректно");
    }
}