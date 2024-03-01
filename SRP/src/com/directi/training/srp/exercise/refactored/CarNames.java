package com.directi.training.srp.exercise.refactored;

import java.util.List;

public class CarNames {
    private List<Car> _carsDb;

    public CarNames(List<Car> carsDb)
    {
        _carsDb = carsDb;
    }
    public String getCarsNames(Car[] _carsDb)
    {

        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
    
}
