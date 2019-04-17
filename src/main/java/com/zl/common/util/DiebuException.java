package com.zl.common.util;

/**
 * Created by Zhang Hong Zhi on 2017/3/26.
 */
public class DiebuException extends  RuntimeException{
    private static final String defaultCode = "basic";

    private String errorCode;

    public DiebuException(String message){
        super(message);
        this.errorCode = defaultCode;
    }

    public DiebuException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public String getCode() {
        return this.errorCode;
    }
}
