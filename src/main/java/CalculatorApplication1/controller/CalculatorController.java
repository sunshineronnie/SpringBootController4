package com.sky.pro.calculate_application.controller;

import com.sky.pro.calculate_application.service.CalculatorService;
import jdk.jfr.Registered;

@RestController
@RegisteredArgsConstructor
@RequestMapping("/controller/")
public class CalculatorController {

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private final CalculatorService calculatorService;

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam(name = "num1") Integer a,

                       @ReqestParam(name = "num2") Integer b) {
        int plus = calculatorService.plus(a,b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam(name = "num1") Integer a,

                        @ReqestParam(name = "num2") Integer b) {
        int minus = calculatorService.minus(a,b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping("/calculator/multiple")
    public String multiple(@RequestParam(name = "num1") Integer a,

                           @ReqestParam(name = "num2") Integer b) {
        int multiple = calculatorService.multiple (a,b);
        return a + " * " + b + " = " + multiple;
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam(name = "num1") Integer a,

                         @ReqestParam(name = "num2") Integer b) {
        double divide = calculatorService.divide (a,b);
        return a + " / " + b + " = " + divide;
    }
}

