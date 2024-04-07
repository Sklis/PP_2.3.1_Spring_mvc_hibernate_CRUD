package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String askNumberCars() {
        return "cars";
    }

    @RequestMapping("/show_cars")
    public String getCars(@RequestParam("count") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "show_cars";
    }
}
