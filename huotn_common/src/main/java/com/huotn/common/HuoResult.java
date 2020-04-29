package com.huotn.common;

import java.io.Serializable;

/**
 * @author:leichengyang
 * @desc:com.huotn.common
 * @date:2020-04-27
 */
public class HuoResult implements Serializable {

    private String statusCode="200";

    private Object data;

    private String msg="操作成功";

    public HuoResult() {
    }

    public HuoResult(String statusCode) {
        this.statusCode=statusCode;
    }

    public HuoResult(String statusCode, Object data) {
        this.statusCode=statusCode;
        this.data=data;
    }

    public HuoResult(String statusCode, String msg) {
        this.statusCode=statusCode;
        this.msg=msg;
    }

    public HuoResult(String statusCode, Object data, String msg) {
        this.statusCode=statusCode;
        this.data=data;
        this.msg=msg;
    }

    public HuoResult success(){
        return new HuoResult("200");
    }

    public HuoResult success(Object data){
        return new HuoResult("200",data);
    }

    public HuoResult success(String msg){
        return new HuoResult("200",msg);
    }

    public HuoResult success(String statusCode,Object data){
        return new HuoResult(statusCode,data);
    }

    public HuoResult success(String statusCode,String msg){
        return new HuoResult(statusCode,msg);
    }

    public static HuoResult faild() {
        return new HuoResult("0", "操作失败");
    }

    public static HuoResult faild(String msg) {
        return new HuoResult("0", msg);
    }

    public static HuoResult faild(Object data) {
        return new HuoResult("0", data);
    }

    public String getStatusCode() {
        return statusCode;
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
}
