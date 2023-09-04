public class Methodoverloads {
    public static void main(String[] args) {

        double x = add(5.0,6.0, 5.0);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloads method # 1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloads method # 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloads method # 3");
        return a + b + c + d;
    }
    static double add(double a, double b) {
        System.out.println("This is overloads method # 4");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloads method # 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloads method # 6");
        return a + b + c + d;
    }

}
