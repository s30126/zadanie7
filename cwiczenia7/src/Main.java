public class Main {

    public static void main(String[] args) {


        System.out.println("\n ~ zadanie 1 ~ \n");

        Vehicle car = new Car(5);
        car.start();
        car.stop();

        System.out.println("\n ~ zadanie 2 ~ \n");

        car.start();
        car.stop();

        System.out.println("\n ~ zadania 3 i 4 ~ \n");

        Lion lion = new Lion();
        lion.sleep();
        lion.roam();
        lion.makeNoise();

        Cat cat = new Cat();
        cat.sleep();
        cat.roam();
        cat.makeNoise();

        Wolf wolf = new Wolf();
        wolf.sleep();
        wolf.roam();
        wolf.makeNoise();

        Dog dog = new Dog();
        dog.sleep();
        dog.roam();
        dog.makeNoise();




    }
}
