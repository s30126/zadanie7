public class Car extends Vehicle {

    private int numberOfSeats;

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car (int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Samochód został uruchomiony.");
    }

    @Override
    public void stop() {
        System.out.println("Samochód się zatrzymał.");
    }
}
