package ru.jafix.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CarAlt {
    private String vendor;
    private String model;
    private String engine;
    private Integer wheels;
    private Boolean airCondition;
    private Boolean openingRoof;

}
