package com.bridgelabz.response;

public class ApiResponse<T> {

    private boolean status;
    private String msg;
    private T data;

    public ApiResponse(boolean status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}