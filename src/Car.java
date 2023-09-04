public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2023;
    String color = "blue";
    double price = 50000.000;


    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }

    public String toString() {
        return make +"\n"+model +"\n" +year +"\n" + color +"\n"+ price;
    }
}
