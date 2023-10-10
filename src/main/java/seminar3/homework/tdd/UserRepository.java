package seminar3.homework.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       //..
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void unLog() {
        for (User user : data) {
            if (!user.isAdmin) {
                System.out.println("Пользователь " + user.name + "разлогинин.");
            }
        }
    }
}