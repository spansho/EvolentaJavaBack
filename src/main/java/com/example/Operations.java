package com.example;

public class Operations {

    public static class Subtractor implements Operation {
        @Override
        public double getResult(double a, double b) {
            return a - b;
        }
    }


    public static class Adder implements Operation {
        @Override
        public double getResult(double a, double b) {
            return a + b;
        }
    }


    public static class Divided implements Operation {
        public Divided(){};

        @Override
        public double getResult(double a, double b) {
            return a / b;
        }
    }

    public static class Multiplie implements Operation {
        @Override
        public double getResult(double a, double b) {
            return a * b;
        }
    }

}
