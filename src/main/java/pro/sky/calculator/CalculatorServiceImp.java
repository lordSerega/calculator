package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    public String hello() {

        return "<b>Добро пожаловать в калькулятор</b>";
    }

}
