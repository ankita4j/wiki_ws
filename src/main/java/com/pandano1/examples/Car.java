package com.pandano1.examples;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Car {
    public static CarBuilder customCar = new CarBuilder();
    final String color;

    final String model;

    final String type;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    private Car(CarBuilder carBuilder) {

        this.color = carBuilder.color;
        this.model = carBuilder.model;
        if (color == "Red")
            this.type = "cff";
        else
            this.type = "ff";
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public static class CarBuilder {

        String color;
        String model;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
