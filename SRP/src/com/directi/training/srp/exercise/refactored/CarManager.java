package com.directi.training.srp.exercise.refactored;


public class CarManager
{

private Database _database = new Database();    

private CarNames _carNames = new CarNames(_database.getCars());

private BestCar _bestCar = new BestCar(_database.getCars());


 
}
