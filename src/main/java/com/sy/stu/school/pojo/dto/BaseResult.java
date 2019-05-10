package com.sy.stu.school.pojo.dto;

import java.io.Serializable;

public class BaseResult implements Serializable {

    private int code;
    //错误信息或者正确信息
    private String message;
    private Object data;



    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAIL = 1;

    public  static BaseResult success(){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_SUCCESS, "success",null);
        return baseResult;
    }
    public  static BaseResult success(String message){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_SUCCESS, message,null);
        return baseResult;
    }

    public  static BaseResult success(String message, Object data){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_SUCCESS, message,data);
        return baseResult;
    }
    public  static BaseResult success(Object data){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_SUCCESS, "success",data);
        return baseResult;
    }

    public static BaseResult success(int status, String message, Object data){
        BaseResult baseResult = BaseResult.createBaseResult(status, message,data);
        return baseResult;
    }



    public static BaseResult fail(){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_FAIL, "fail",null);
        return baseResult;
    }
    public static BaseResult fail(String message){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_FAIL,message,null );
        return baseResult;
    }
    public static BaseResult fail(String message, Object data){
        BaseResult baseResult = BaseResult.createBaseResult(STATUS_FAIL,message,data );
        return baseResult;
    }


    public static BaseResult fail(int status, String message){
        BaseResult baseResult = BaseResult.createBaseResult(status, message,null);
        return baseResult;
    }
    public static BaseResult fail(int status, String message, Object data){
        BaseResult baseResult = BaseResult.createBaseResult(status, message,data);
        return baseResult;
    }

    public static BaseResult createBaseResult(int status , String message, Object data){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(status);
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
