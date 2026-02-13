package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> cars = new ArrayList<>();

    public CarDAOImpl() {
        cars.add(new Car("Lada", "Vesta", "White"));
        cars.add(new Car("UAZ", "Patriot", "Grey"));
        cars.add(new Car("KAMAZ", "5320", "Orange"));
        cars.add(new Car("KIA", "Spectra", "Gold"));
        cars.add(new Car("Aurus", "Combat", "Black"));
    }

    @Override
    public List<Car> getCars(int cnt) {

        List<Car> carList = new ArrayList<>();

        if (cnt <= 5) {
            carList = cars.stream().limit(cnt).toList();
        }
        return carList;
    }
}
