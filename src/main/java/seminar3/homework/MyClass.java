package seminar3.homework;

public class MyClass {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval (int n) {
        int a = 25;
        int b = 100;
        if (n > a && n < b) {
            return true;
        } else {
            return false;
        }
    }
}
