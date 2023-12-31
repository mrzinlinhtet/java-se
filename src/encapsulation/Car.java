package encapsulation;

public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public String setMake(String make) {
        return this.make = make;
    }
    public String setModel(String model) {
        return this.model = model;
    }
    public int setYear(int year) {
        return this.year = year;
    }

}
