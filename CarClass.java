package com.mapping.carmapping;

public class CarClass {

    private int CarId;
    private String CarName;

    public int getCarId() {
        return CarId;
    }

    public void setCarId(int carId) {
        CarId = carId;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public boolean isAirbags() {
        return Airbags;
    }

    public void setAirbags(boolean airbags) {
        Airbags = airbags;
    }

    private String CarType;
    private boolean Airbags;


}
