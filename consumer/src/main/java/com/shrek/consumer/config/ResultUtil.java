package com.shrek.consumer.config;

/**
 * @Author: shrek
 * @Date: 2018/7/26 10:51
 * @Description:    通用返回值工具
 */
public class ResultUtil {

    //当正确时返回的值
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("OK");
        result.setData(data);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
