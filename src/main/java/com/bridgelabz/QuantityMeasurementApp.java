package com.bridgelabz;

public class QuantityMeasurementApp {

    public static void demonstrateLengthConversion(
            double value,
            LengthUnit from,
            LengthUnit to) {

        double result =
                QuantityLength.convert(value, from, to);

        System.out.println(value + " " + from +
                " = " + result + " " + to);
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(
                1.0,
                LengthUnit.FEET,
                LengthUnit.INCHES);
    }
}