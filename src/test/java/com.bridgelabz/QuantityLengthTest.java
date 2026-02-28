package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityLengthTest {

    @Test
    void testConversion_FeetToInches() {
        assertEquals(12.0,
                QuantityLength.convert(1.0,
                        LengthUnit.FEET,
                        LengthUnit.INCHES), 0.0001);
    }

    @Test
    void testConversion_YardsToFeet() {
        assertEquals(9.0,
                QuantityLength.convert(3.0,
                        LengthUnit.YARDS,
                        LengthUnit.FEET), 0.0001);
    }

    @Test
    void testConversion_InvalidUnit() {
        assertThrows(IllegalArgumentException.class,
                () -> QuantityLength.convert(
                        1.0, null, LengthUnit.FEET));
    }
}