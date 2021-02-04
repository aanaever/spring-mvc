package web.service;


import web.model.Car;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Model-X", "Black"));
        cars.add(new Car("Mercedes", "S-Class", "Space-grey"));
        cars.add(new Car("Lexus", "LX-570", "White"));
        cars.add(new Car("Lamborghini", "Huracan", "Yellow"));
        cars.add(new Car("Toyota", "Camry-3.5", "Black"));
        return cars;
    }

    @Override
    public List<Car> carCounts(int count) {
        List<Car> carsList = getCarList();
        List<Car> carListByCount = carsList.stream().limit(count).collect(Collectors.toList());
        return carListByCount;
    }
}


