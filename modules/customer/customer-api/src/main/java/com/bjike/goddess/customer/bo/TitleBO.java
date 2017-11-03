package com.bjike.goddess.customer.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 市场信息图形展示传输对象
 * @Author: [lijuntao]
 * @Date: [2017-09-09 15:32]
 * @Description: [市场信息图形展示传输对象 ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class TitleBO extends BaseBO{
    /**
     * 名称
     */
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
