package seminar2.homework;

public class Motorcycle extends Vehicle{
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease, 2, 0);
    }

    @Override
    public void testDrive() {
        this.setSpeed(75);
    }

    @Override
    public void park() {
        this.setSpeed(0);
    }


}
