package com.example.Spring_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcController
{
    @Autowired
    CalcService calcService;

    CalcController()
    {
        System.out.println("CalcService created");
    }

    @GetMapping("/home")
    public String welcome()
    {
        return "Приветсвуем тебя, пользователь!";
    }

    @GetMapping("/sum/{num1}+{num2}")
    @ResponseBody
    public String calcSum(@PathVariable Integer num1, @PathVariable Integer num2) {

        Integer sum = calcService.sum(num1,num2);
        return sum.toString();
    }

    @GetMapping("/sum/{num1}-{num2}")
    @ResponseBody
    public String calcSub(@PathVariable Integer num1, @PathVariable Integer num2) {

        Integer sum = calcService.sub(num1,num2);
        return sum.toString();
    }

    @GetMapping("/sum/{num1}x{num2}")
    @ResponseBody
    public String calcMultiply(@PathVariable Integer num1, @PathVariable Integer num2) {

        Integer sum = calcService.multiply(num1,num2);
        return sum.toString();
    }

    @GetMapping("/sum/{num1}/{num2}")
    @ResponseBody
    public String calcDev(@PathVariable Integer num1, @PathVariable Integer num2) {

        Integer sum = calcService.dev(num1,num2);
        return sum.toString();
    }
}
