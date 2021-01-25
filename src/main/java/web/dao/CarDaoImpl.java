package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2012));
        cars.add(new Car("Lada", "Kalina", 2020));
        cars.add(new Car("Renault", "Duster", 2016));
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("FIAT", "Punto", 2011));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
