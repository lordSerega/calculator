package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float divide(int num1, int num2) {
        return num1 / num2;
    }


}
