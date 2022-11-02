package nuc.zm.nuc_mybatis.exception;

import nuc.zm.nuc_mybatis.response.Res;
import org.apache.ibatis.binding.BindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static nuc.zm.nuc_mybatis.exception.ExceptionEnum.BIND_EXCEPTION;

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(Exception.class)
    public Res<String> error() {
        return Res.error();
    }

    @ExceptionHandler(BindingException.class)
    public Res errorBind(){
        return Res.error(BIND_EXCEPTION);
    }

}
