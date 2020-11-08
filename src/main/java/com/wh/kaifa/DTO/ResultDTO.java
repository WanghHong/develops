package com.wh.kaifa.DTO;

/**
 * Created by wanghong on 2020/11/8.
 */
public class ResultDTO {
    private Integer openNum;
    private Integer countNum;

    public Integer getOpenNum() {
        return openNum;
    }

    public void setOpenNum(Integer openNum) {
        this.openNum = openNum;
    }

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "openNum=" + openNum +
                ", countNum=" + countNum +
                '}';
    }
}
