package ru.jafix.creational.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {
    private String vendor;
    private String model;
    private String engine;
    private Integer wheels;
    private Boolean airCondition;
    private Boolean openingRoof;

    private Car(Builder builder) {
        this.vendor = builder.vendor;
        this.model = builder.model;
        this.wheels = builder.wheels;
        this.engine = builder.engine;
        this.airCondition = builder.airCondition;
        this.openingRoof = builder.openingRoof;
    }

    public static class Builder {
        private String vendor;
        private String model;
        private String engine;
        private Integer wheels;
        private Boolean airCondition;
        private Boolean openingRoof;

        public Builder(String vendor, String model) {
            this.vendor = vendor;
            this.model = model;
        }

        public Builder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setAirCondition(boolean airCondition) {
            this.airCondition = airCondition;
            return this;
        }

        public Builder setOpeningRoof(boolean openingRoof) {
            this.openingRoof = openingRoof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
