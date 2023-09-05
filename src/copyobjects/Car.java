package copyobjects;

public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    Car(Car x) {
        this.copy(x);
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

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
