package seminar2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {

    @Test
    public void testMethod() {
// В этом примере, мы ожидаем, что метод someMethod() бросит ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            int result = someMethod(10, 0);
        });
    }

    // Это пример метода, который бросает исключение
    public int someMethod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }
}
