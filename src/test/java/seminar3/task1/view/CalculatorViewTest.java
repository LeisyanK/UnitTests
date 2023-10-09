package seminar3.task1.view;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import seminar3.view.CalculatorView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {
    private static CalculatorView view;

    @BeforeAll
    public static void createView() {
        view = new CalculatorView();
    }

    @Test
    void printMenu() {
        // Проверяем, что метод printMenu() выводит текст меню
// Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printMenu();

// Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход\n", outContent.toString());

// Восстанавливаем стандартный поток вывода
        System.setOut(System.out);

    }

    @Test
    void printResult() {
        String expectedText = "Результат: 10\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printResult(10);

        assertEquals(expectedText, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void getInput() {
//        String testedValue = "9"; // Значение для тестов
//        int expectedNum = 9;
//        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayInputStream in = new ByteArrayInputStream("42\n".getBytes());
//        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
//        System.setIn(in); // Подменяем ввод
//        int actualNum = view.getInput(); // Вызываем метод
//        System.out.println(testedValue); // Для наглядности вывода
        assertEquals(42, view.getInput(), "метод getInput() работает");
//        System.setIn(inputStream); // Подменяем обратно
        System.setIn(System.in);
//        assertEquals(int(testedValue), actualNum, "метод getInput() работает");


//        int expectedNum = 3;
//
//        ByteArrayInputStream inContent = new ByteArrayInputStream(3);
//        System.setIn(new );
//        int actualNum = view.getInput();
//        assertEquals(expectedNum, actualNum, "метод getInput() работает");
    }

    @Test
    void printErrorMessage() {
        String expectedText = "Деление на ноль запрещено\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printErrorMessage("Деление на ноль запрещено");

        assertEquals(expectedText, outContent.toString());

        System.setOut(System.out);
    }
}