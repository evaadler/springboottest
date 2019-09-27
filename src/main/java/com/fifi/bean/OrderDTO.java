package com.fifi.bean;

import java.math.BigDecimal;

/**
 * @author Alicia
 * @description
 * @date 2019/9/20
 */
public class OrderDTO {
    private String code;
    private BigDecimal price;

    /**
     * 订单类型
     */
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
