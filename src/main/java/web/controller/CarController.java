package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carServiceImp;
    @GetMapping("/cars")
    public String carTable(@RequestParam(value = "count",required = false) String count, Model model){

        if(count!=null){
            model.addAttribute("car",carServiceImp.limitCar(Integer.parseInt(count)));
        }else {
            model.addAttribute("car",carServiceImp.allСars());
        }


        return "pow";

    }
}
