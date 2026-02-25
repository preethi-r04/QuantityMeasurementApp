package com.bridgelabz;

public class QuantityMeasurementApp {

    // Inner class for Feet measurement
    static class Feet {

        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals()
        @Override
        public boolean equals(Object obj) {

            // same reference check
            if (this == obj) {
                return true;
            }

            // null or different type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet other = (Feet) obj;

            // compare double safely
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method (UC1 demo)
    public static void main(String[] args) {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        System.out.println("Equal : " + feet1.equals(feet2));
    }
}
