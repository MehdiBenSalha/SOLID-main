package com.directi.training.srp.exercise.refactored;

import java.util.List;

public class BestCar {
    private List<Car> _carsDb;

    public BestCar(List<Car> carsDb)
    {
        _carsDb = carsDb;
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
    
}
