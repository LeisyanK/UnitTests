package seminar2.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
    private Car car;
    private Motorcycle moto;

    @BeforeEach
    public void setUp(){
        car = new Car("Renault", "Logan", 2010);
        moto = new Motorcycle("Izh", "Planet5", 2015);
    }

    /* Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя
оператор instanceof). */
    @Test
    public void testInstanceof() {
//        System.out.println(car instanceof Vehicle);
        assertTrue(car instanceof Vehicle);
        assertTrue(moto instanceof Vehicle);
    }

    /*
 - Проверить, что объект Car создается с 4-мя колесами.
 - Проверить, что объект Motorcycle создается с 2-мя колесами.*/
   @Test
   public void testNumWheels() {
//       System.out.println(car.getNumWheels());
//       System.out.println(moto.getNumWheels());
       assertEquals(4, car.getNumWheels(), "Количество колес неверное");
       assertEquals(2, moto.getNumWheels(), "Количество колес неверное");
   }

    /*
 - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод
testDrive()).*/
    @Test
    public void testTestDrive() {
//        car.testDrive();
//        System.out.println(car.getSpeed());
        assertEquals(60.0, car.getSpeed(), "Скорость автомобиля не соответствует");
        assertEquals(75.0, moto.getSpeed(), "Скорость мотоцикла не соответствует");
    }

    /*
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
останавливается (speed = 0).
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл
останавливается (speed = 0).*/
    @Test
    public void testPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Скорость автомобиля не соответствует");

        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed(), "Скорость мотоцикла не соответствует");
    }
}
