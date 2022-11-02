package com.dbn.campuslife.util;

import com.dbn.campuslife.exception.CustomException;
import org.slf4j.Logger;

/**
 * 返回结果实体类
 *
 * @param <T> 返回数据类型
 */
public class JsonResult<T> {

    /**
     * ture或false
     */
    private boolean successful;
    /**
     * 响应码
     */
    private String code;

    /**
     * 信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public JsonResult() {
    }

    public JsonResult(boolean successful, String code, String message, T data) {
        this.successful = successful;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回对象
     *
     * @param message 成功的信息
     * @param <T>     返回数据类型
     * @return 成功返回对象
     */
    public static <T> JsonResult<T> success(String message) {
        return new JsonResult<>(true, "200", message, null);
    }

    /**
     * 成功
     *
     * @param <T> 返回数据类型
     * @return 成功返回对象
     */
    public static <T> JsonResult<T> success() {
        return new JsonResult<>(true, "200", null, null);
    }

    /**
     * @param logger   日志对象
     * @param business 业务信息
     * @param e        异常
     * @param <T>      返回数据类型
     * @return 返回信息
     */
    public static <T> JsonResult<T> fail(Logger logger, String business, Exception e) {
        logger.error(business, e);
        /*如果是我们自定义异常*/
        if (e instanceof CustomException) {
            return new JsonResult<>(false, "501", e.getMessage(), null);
        }
        return new JsonResult<>(false, "500", "服务异常", null);
    }


    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
