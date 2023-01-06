package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public String add(double a, double b) {
        return this.display.display(a + b);
    }

    public String subtract(double a, double b) {
        return this.display.display(a - b);
    }

    public String multiply(double a, double b) {
        return this.display.display(a * b);
    }

    public String divide(double a, double b) {
        if (b != 0) {
            return this.display.display(a / b);
        } else {
            return this.display.showError();
        }
    }
}
