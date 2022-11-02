package nuc.zm.nuc_mybatis.exception;

/**
 * 我异常
 *
 * @author zm
 * @date 2022/11/02
 */
public class MyException extends RuntimeException {

    private final Integer code;
    private final String  message;

    public MyException( Integer code,String message) {
        super(message);
        this.code  = code;
        this.message = message;
    }

    public MyException(ExceptionEnum e) {
        this(e.getCode(),e.getMessage());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
