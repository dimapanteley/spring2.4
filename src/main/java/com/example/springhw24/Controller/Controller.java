package com.example.springhw24.Controller;
import com.example.springhw24.Service.CalculatorService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class  Controller {
    private final CalculatorService сalculatorService;

    public Controller (CalculatorService сalculatorService) {
        this.сalculatorService=сalculatorService;
    }


    @GetMapping()
    public String calculator(){
        return "<strong. >Добро пожаловать в калькулятор</strong>";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam int num1, int num2){
        return сalculatorService.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, int num2){
        return сalculatorService.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, int num2){
        return сalculatorService.multiply(num1,num2);
    }
    @GetMapping("/separate")
    public String separate(@RequestParam int num1, int num2){
        return сalculatorService.separate(num1,num2);
    }
}