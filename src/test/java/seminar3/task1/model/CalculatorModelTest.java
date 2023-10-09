package seminar3.task1.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import seminar3.model.CalculatorModel;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    private static CalculatorModel calculator;
    @BeforeAll
    public static void createCalculator() {
        calculator = new CalculatorModel();
    }

    @Test
    void getFirstNumber() {
        int expectedNum = 3;
        calculator.setFirstNumber(expectedNum);
        int actualNum = calculator.getFirstNumber();
        assertEquals(expectedNum, actualNum, "метод getFirstNumber работает некорректно");

    }

    @Test
    void setFirstNumber() {
        int expectedNum = 3;
        calculator.setFirstNumber(expectedNum);
        int actualNum = calculator.getFirstNumber();
        assertEquals(expectedNum, actualNum, "метод setFirstNumber работает некорректно");
    }

    @Test
    void getSecondNumber() {
        int expectedNum = 3;
        calculator.setSecondNumber(expectedNum);
        int actualNum = calculator.getSecondNumber();
        assertEquals(expectedNum, actualNum, "метод getSecondNumber работает некорректно");
    }

    @Test
    void setSecondNumber() {
        int expectedNum = 3;
        calculator.setSecondNumber(expectedNum);
        int actualNum = calculator.getSecondNumber();
        assertEquals(expectedNum, actualNum, "метод setSecondNumber работает некорректно");
    }

    @Test
    void add() {
        int expectedNum = 14;
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(8);
        int actualNum = calculator.add();
        assertEquals(expectedNum, actualNum, "метод add() работает некорректно");
    }

    @Test
    void subtract() {
        int expectedNum = 4;
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(2);
        int actualNum = calculator.subtract();
        assertEquals(expectedNum, actualNum, "метод subtract() работает некорректно");
    }

    @Test
    void multiply() {
        int expectedNum = 12;
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(2);
        int actualNum = calculator.multiply();
        assertEquals(expectedNum, actualNum, "метод multiply() работает некорректно");
    }

    @Test
    void divide() {
        int expectedNum = 3;
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(2);
        int actualNum = calculator.divide();
        assertEquals(expectedNum, actualNum, "метод divide() работает некорректно");
    }

    @Test
    void divideByZero() {
        String message = "Деление на ноль запрещено";
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(0);
        Exception actual = assertThrows(ArithmeticException.class, () -> calculator.divide());
        assertEquals(message, actual.getMessage(), "метод divide() со вторым аргументом 0  некорректен");
    }
}