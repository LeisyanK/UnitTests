//package seminar3.task1.controller;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.function.IntSupplier;
//
//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CalculatorControllerTest {
//    private CalculatorController controller;
//    @Mock
//    private CalculatorModel model;
//    @Mock
//    private CalculatorView view;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        controller = new CalculatorController(model, view);
//    }
//
//    @Test
//    public void testPerformOperationWithArithmeticException() {
//        when(view.getInput()).thenReturn(5, 0); // Ввод пользователя: первое число = 5, второе число = 0
//        when(model::divide).thenThrow(new ArithmeticException("Деление на ноль"));
//
//        controller.run();
//
//// Проверяем, что было вызвано сообщение об ошибке с правильным сообщением
//        verify(view).printErrorMessage("Ошибка: Деление на ноль");
//    }
//}
////import org.junit.jupiter.api.BeforeEach;
////import org.junit.jupiter.api.Test;
////import seminar3.controller.CalculatorController;
////import seminar3.model.CalculatorModel;
////import seminar3.view.CalculatorView;
////
////import java.io.ByteArrayInputStream;
////import java.io.ByteArrayOutputStream;
////import java.io.PrintStream;
////import java.util.function.IntSupplier;
////
////import static org.junit.jupiter.api.Assertions.*;
////import static org.mockito.Mockito.*;
//
////public class CalculatorControllerTest {
//
//
//
////    private CalculatorController controller;
////    private CalculatorModel model;
////    private CalculatorView view;
////
////    @BeforeEach
////    public void setUp() {
////        model = new CalculatorModel(); // Простой стаб для CalculatorModel
////        view = new CalculatorView(); // Простой стаб для CalculatorView
////        controller = new CalculatorController(model, view);
////    }
////
////    @Test
////    public void testPerformOperationWithArithmeticException() {
////// Устанавливаем ввод пользователя: первое число = 5, второе число = 0
////        System.setIn(new ByteArrayInputStream("5\n0\n".getBytes()));
////
////        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
////        System.setOut(new PrintStream(outContent));
////
////        controller.run();
////
////// Проверяем, что было вызвано сообщение об ошибке с правильным сообщением
////        assertTrue(outContent.toString().contains("Ошибка: Деление на ноль"));
////
////// Восстанавливаем стандартный поток вывода и ввода
////        System.setIn(System.in);
////        System.setOut(System.out);
////    }
////
////}
