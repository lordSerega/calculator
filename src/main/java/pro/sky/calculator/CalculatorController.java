package pro.sky.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer firstValue,
                       @RequestParam(value = "num2", required = false) Integer secondValue) {

        if (firstValue == null || secondValue == null) {
            return "Проверьте, что вы ввели оба параметра.";
        }

        return firstValue + "+" + secondValue + "=" + calculatorService.plus(firstValue, secondValue);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer firstValue,
                        @RequestParam(value = "num2", required = false) Integer secondValue) {

        if (firstValue == null || secondValue == null) {
            return "Проверьте, что вы ввели оба параметра.";
        }

        return firstValue + "-" + secondValue + "=" + calculatorService.minus(firstValue, secondValue);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer firstValue,
                           @RequestParam(value = "num2", required = false) Integer secondValue) {
        if (firstValue == null || secondValue == null) {
            return "Проверьте, что вы ввели оба параметра.";
        }

        return firstValue + "*" + secondValue + "=" + calculatorService.multiply(firstValue, secondValue);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer firstValue,
                         @RequestParam(value = "num2", required = false) Integer secondValue) {
        if (firstValue == null || secondValue == null) {
            return "Проверьте, что вы ввели оба параметра.";
        }

        if (secondValue == 0) {
            return "На 0 делить нельзя!";
        }

        return firstValue + "/" + secondValue + "=" + calculatorService.divide(firstValue, secondValue);
    }


}
