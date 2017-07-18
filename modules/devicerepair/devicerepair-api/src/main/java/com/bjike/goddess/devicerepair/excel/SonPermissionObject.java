package com.bjike.goddess.devicerepair.excel;

import java.io.Serializable;

/**
 * 市场活动下拉导航权限控制
 *
 * @Author: [tanghaixiang]
 * @Date: [2017-06-08 10:30]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class SonPermissionObject implements Serializable {
    /**
     * 导航名
     */
    private String name;
    /**
     * 描述
     */
    private String describesion;

    /**
     * 是否有权限
     */
    private Boolean flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getDescribesion() {
        return describesion;
    }

    public void setDescribesion(String describesion) {
        this.describesion = describesion;
    }
}
