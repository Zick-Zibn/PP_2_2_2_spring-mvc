package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @Override
    public List<Car> getCars(int cnt) {
        return carDAO.getCars(cnt);
    }

    public String getHeader() {
        return "Brand/" + ' ' + "Model/" + ' ' + "Color";
    }
}
