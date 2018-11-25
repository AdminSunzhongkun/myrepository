package com.fh.product.util;

/**
 * @一句话描述：
 * @作者        ：孙中坤
 * @邮箱        : 279983976@qq.com
 * @创建日期    ：2018年10月18日 18:28
 */
public class SeverResponse {

    private Integer code;
    private String msg;
    private Object data;

    public SeverResponse(){

    }

    public SeverResponse(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static SeverResponse success(SeverEnum severEnum,Object data){

        return new SeverResponse(SeverEnum.SECCESS_ENUM.getCode(),SeverEnum.SECCESS_ENUM.getMsg(),data);
    }

    public static SeverResponse success(SeverEnum severEnum){


        return new SeverResponse(severEnum.getCode(),severEnum.getMsg(),null);
    }


    public static SeverResponse error(SeverEnum severEnum){

        return new SeverResponse(severEnum.getCode(),severEnum.getMsg(),null);
    }


    public static SeverResponse error(SeverEnum severEnum,Object data){

        return new SeverResponse(severEnum.getCode(),severEnum.getMsg(),null);
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

}
