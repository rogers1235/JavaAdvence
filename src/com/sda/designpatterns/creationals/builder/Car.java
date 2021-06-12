package com.sda.designpatterns.creationals.builder;

public class Car {

    private String engineType;

    private String acType;
    private boolean electricWindows;
    private boolean heatChairs;
    private boolean autoPilot;
    private int numberOfAirbags;

    private Car(CarBuilder carBuilder){
        this.engineType = carBuilder.engineType;
        this.acType = carBuilder.acType;
        this.electricWindows = carBuilder.electricWindows;
        this.heatChairs = carBuilder.heatChairs;
        this.autoPilot = carBuilder.autoPilot;
        this.numberOfAirbags = carBuilder.numberOfAirbags;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", acType='" + acType + '\'' +
                ", electricWindows=" + electricWindows +
                ", heatChairs=" + heatChairs +
                ", autoPilot=" + autoPilot +
                ", numberOfAirbags=" + numberOfAirbags +
                '}';
    }

    public static class CarBuilder{

        private String engineType;

        private String acType;
        private boolean electricWindows;
        private boolean heatChairs;
        private boolean autoPilot;
        private int numberOfAirbags;

        public CarBuilder(String engineType) {
            this.engineType = engineType;
        }

        public CarBuilder setAcType(String acType) {
            this.acType = acType;
            return this;
        }

        public CarBuilder setElectricWindows(boolean electricWindows) {
            this.electricWindows = electricWindows;
            return this;
        }

        public CarBuilder setHeatChairs(boolean heatChairs) {
            this.heatChairs = heatChairs;
            return this;
        }

        public CarBuilder setAutoPilot(boolean autoPilot) {
            this.autoPilot = autoPilot;
            return this;
        }

        public CarBuilder setNumberOfAirbags(int numberOfAirbags) {
            this.numberOfAirbags = numberOfAirbags;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
