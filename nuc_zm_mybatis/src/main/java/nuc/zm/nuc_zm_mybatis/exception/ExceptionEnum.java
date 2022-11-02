package nuc.zm.nuc_zm_mybatis.exception;

public enum ExceptionEnum {
    SYSTEM_EXCEPTION(100001,"系统异常"),
    BIND_EXCEPTION(100002,"绑定失败 请联系管理员");


    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
