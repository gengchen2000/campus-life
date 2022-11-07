package com.dbn.campuslife.util;


import java.util.List;

/**
 * 数据的工具类
 *
 * @param <T> 数据类型
 */
public class Result<T> {
    /**
     * 数据
     */
    private List<T> data;
    /**
     * 总数量
     */
    private Integer count;

    public Result() {
    }

    public Result(List<T> data, Integer count) {
        this.data = data;
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
