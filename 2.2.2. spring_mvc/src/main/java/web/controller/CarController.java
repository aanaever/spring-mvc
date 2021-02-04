package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    CarServiceImpl service = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam Integer count, Model model) {
        if (count == null) {
            List<Car> allCars = service.getCarList();
            model.addAttribute("cars", allCars);
        } else {
            List<Car> cars = service.carCounts(count);
            model.addAttribute("cars", cars);
        }

        return "cars";
    }
}
