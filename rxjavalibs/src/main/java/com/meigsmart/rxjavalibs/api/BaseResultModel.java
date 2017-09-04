package com.meigsmart.rxjavalibs.api;

/**
 * 请求统一实体类
 * Created by chenMeng on 2017/9/4.
 */

public class BaseResultModel<T> {
    private String result;//请求标致
    private String errorMsg;//错误信息
    private T data;//内容

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
