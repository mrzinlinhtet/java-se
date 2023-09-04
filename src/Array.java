public class Array {
    public static void main(String[] args) {
//        String[] cars = {"Camaro","Corvertte","Tesla"};
//
//        cars[0] = "BMW";
//
//        System.out.println(cars[5]);

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvertte";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
