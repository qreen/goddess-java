package com.bjike.goddess.outcarfare.vo;

/**
 * 资金准备金审核汇总
 *
 * @Author: [chenjunhao]
 * @Date: [2017-05-05 16:40]
 * @Description: [资金准备金审核汇总]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class MoneyReadyCountVO {
    /**
     * 项目组
     */
    private String groupTeam;
    /**
     * 时间
     */
    private String time;
    /**
     * 上月准备金
     */
    private Double lastMonthReserveSum;
    /**
     * 本月准备金
     */
    private Double currentMonthReserveSum;
    /**
     * 差额
     */
    private Double differences;
    /**
     * 增长率
     */
    private Double growth;
    /**
     * 地区
     */
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGroupTeam() {
        return groupTeam;
    }

    public void setGroupTeam(String groupTeam) {
        this.groupTeam = groupTeam;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getLastMonthReserveSum() {
        return lastMonthReserveSum;
    }

    public void setLastMonthReserveSum(Double lastMonthReserveSum) {
        this.lastMonthReserveSum = lastMonthReserveSum;
    }

    public Double getCurrentMonthReserveSum() {
        return currentMonthReserveSum;
    }

    public void setCurrentMonthReserveSum(Double currentMonthReserveSum) {
        this.currentMonthReserveSum = currentMonthReserveSum;
    }

    public Double getDifferences() {
        return differences;
    }

    public void setDifferences(Double differences) {
        this.differences = differences;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }
}
