package seminar3.homework.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void unLog() {
        List<User> data = new ArrayList<>();
        User user1 = new User("Alex", "123", true);
        User user2 = new User("Noy", "1234", false);
        data.add(user1);
        data.add(user2);
        user1.isAuthenticate = user1.authenticate("Alex", "123");
        user2.isAuthenticate = user2.authenticate("Noy", "1234");
        for (User user : data) {
            System.out.println(user.toString());
        }
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }
        for (User user : data) {
            System.out.println(user.toString());
        }
        for (User user : data) {
            if (!user.isAdmin) {
                assertFalse(user.isAuthenticate, user.name + "ошибка");
            }
        }
    }
}