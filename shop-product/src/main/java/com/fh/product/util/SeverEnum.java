package com.fh.product.util;

/**
 * @一句话描述：
 * @作者        ：孙中坤
 * @邮箱        : 279983976@qq.com
 * @创建日期    ：2018年10月19日 14:02
 */
public enum SeverEnum {

    SECCESS_ENUM(0,"成功"),
    ERROR_ENUM(1,"失败"),
    USER_PASS_ERROR(2,"密码错误"),
    USER_CODE_ERROR(3,"验证码错误"),
    USER_USERNAME_ERROR(4,"用户名错误"),
    USER_MSG_MISS(5,"信息不全"),
    USER_LOCK(6,"账号被锁定"),


    SMS_NULLNUM(2000,"手机号为空"),
    SMS_ERRORNUM(2001,"手机格式不对"),
    SMS_ERROR(2002,"发送验证码失败");


    private Integer code;

    private String msg;

    private SeverEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "SeverEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
