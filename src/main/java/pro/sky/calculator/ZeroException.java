package pro.sky.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroException extends IllegalArgumentException {

    public ZeroException() {
        super("На 0 делить нельзя!");
    }


}
