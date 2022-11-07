package com.dbn.campuslife.util;

import io.swagger.annotations.ApiModelProperty;

public abstract class AbstractPageBO extends CheckPropertyUtil{
    /**
     * 当前页
     */
    @ApiModelProperty(required = true)
    private Integer pageIndex;

    /**
     * 每页的数量
     */
    @ApiModelProperty(required = true)
    private Integer pageSize;

    /**
     * 开始位置
     */
    private Integer startIndex;
    /**
     * 结束位置
     */
    private Integer endIndex;

    public void pageInit() {
//        1 - 20   21 -40
        startIndex = (pageIndex - 1) * pageSize + 1;
        endIndex = pageIndex * pageSize;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
