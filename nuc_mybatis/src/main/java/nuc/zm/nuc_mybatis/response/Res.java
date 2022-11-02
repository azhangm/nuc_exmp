package nuc.zm.nuc_mybatis.response;


import nuc.zm.nuc_mybatis.exception.ExceptionEnum;

public class Res<T>{
    private final Integer code;
    private final String message;
    private  T data;
    public Res(T data) {
        this.code = 200;
        this.message = "success";
        this.data = data;
    }

    public Res(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Res<String> success() {return  new Res<>(null);}

    public static <T> Res<T> success(T data) {return  new Res<T>(data);}

    public static Res<String> error() {return new Res<>(1000,"error");}

    public static Res<ExceptionEnum> error(ExceptionEnum e)  {
        return new Res<>(e.getCode(),e.getMessage());
    }

    public T getData() {
        return data;
    }
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
