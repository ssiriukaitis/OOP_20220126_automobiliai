import java.util.ArrayList;

public class Car {

    private int id;
    private String brand;
    private String model;
    private ArrayList<Car> cars;

    public Car(){

    }


    public Car(int id, String brand, String model, ArrayList<Car> cars) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "id=" + id +
                ", automobilio markė yra'" + brand + '\'' +
                ", modelis yra'" + model + '\'' +
                ", cars=" + cars +
                '}';
    }
}
