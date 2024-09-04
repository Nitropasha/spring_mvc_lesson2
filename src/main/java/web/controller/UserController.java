package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.entity.Car;
import web.entity.User;
import web.service.CarService;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private CarService carService;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count, Model model) {
        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = "+user.getId());
            System.out.println("First Name = "+user.getFirstName());
            System.out.println("Last Name = "+user.getLastName());
            System.out.println("Email = "+user.getEmail());

            System.out.println();
        }
//        Car car1 = carService.newCar("Mercedes", "E", 250);
//        Car car2 = carService.newCar("Lada", "KALINA", 1);
//        Car car3 = carService.newCar("Moskvich", "Turbp", 10);
//        Car car4 = carService.newCar("BMW", "xDrive", 330);
//        Car car5 = carService.newCar("Volga", "Vedro", 2);
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        carList.add(car4);
//        carList.add(car5);
//        List<Car> newCars = carService.getAllCars(carList, count);
        model.addAttribute("cars", users);
        return "cars";
    }

}