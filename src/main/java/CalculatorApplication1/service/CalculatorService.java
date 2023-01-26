package com.sky.pro.calculate_application.service;

@Service
public class CalculatorService {




    public int plus(Integer a, Integer b);
    public int minus(Integer a, Integer b);
    public int multiple(Integer a, Integer b);
    public double divide(Integer a, Integer b);

    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (a != 0) {
            return (double) a / b;

        } else {
            return RuntimeException "на ноль делить нельзя";
        }

    }