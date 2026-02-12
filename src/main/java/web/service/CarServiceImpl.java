package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    CarDAO carDAO;
    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @Override
    public List<Car> getCars(int cnt) {
        return carDAO.getCars(cnt);
    }
}
