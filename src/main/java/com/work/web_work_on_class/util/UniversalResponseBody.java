package com.work.web_work_on_class.util;

import lombok.Data;

@Data
public class UniversalResponseBody<T> {
    private int errorCode;

    private String message;

    public UniversalResponseBody(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public UniversalResponseBody(int errorCode, String message, T data) {
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    private T data;

}
