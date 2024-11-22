package ru.jafix.creational.builder;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder("АВТОВАЗ", "ВАЗ 2107")
                .setAirCondition(false)
                .setWheels(4)
                .build();

        System.out.println(car1);

        CarAlt b = CarAlt.builder()
                .model("A8D2")
                .vendor("Audi")
                .engine("V12")
                .build();


        Car car = new Car();
        car.setVendor("Mercedes");
        car.setModel("S300");



    }
}