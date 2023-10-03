package seminar1;

import homework.MyClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Homework {
    @Test
    public void sumListShouldBeCorrect(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 5));
        List<Integer> resultTest = MyClass.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков неверна!");
    }

    @Test
    public void testFindMax(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 2, 7, 9, 3));
        int max = 8;
        int maxTest = MyClass.findMax(list1);
        assertEquals(max, maxTest, "Максимальный элемент найден неверно!");
    }

    @Test
    public void testFilterStrings(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Hello", ",", "World", "!"));
        int minLen = 2;
        List<String> newListExpected = new ArrayList<>(Arrays.asList("Hello", "World", "llk"));
        List<String> newListTest = MyClass.filterStrings(list1, minLen);
        assertEquals(newListExpected, newListTest, "Строки найдены неверно!");
    }
}
