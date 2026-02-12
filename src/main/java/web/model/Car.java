package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private static String header = "Brand/" + ' ' + "Model/" + ' ' + "Color";
    private String brand;
    private String model;
    private String color;

    public Car() {

    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeader() {
        return header;
    }

    public String toStringFormatted() {
        return brand + "/ " + model + "/ " + color;
    }


}
