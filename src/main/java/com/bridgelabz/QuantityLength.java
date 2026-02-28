package com.bridgelabz;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (!Double.isFinite(value) || unit == null)
            throw new IllegalArgumentException("Invalid input");

        this.value = value;
        this.unit = unit;
    }

    public static double convert(double value,
                                 LengthUnit source,
                                 LengthUnit target) {

        if (!Double.isFinite(value) || source == null || target == null)
            throw new IllegalArgumentException("Invalid conversion input");

        double valueInFeet =
                value * source.getConversionFactor();

        return valueInFeet / target.getConversionFactor();
    }
}