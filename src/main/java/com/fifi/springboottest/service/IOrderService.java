package com.fifi.springboottest.service;

import com.fifi.springboottest.bean.OrderDTO;

/**
 * @author Alicia
 * @description
 * @date 2019/9/20
 */
public interface IOrderService {

    /**
     * 根据订单类型作出不同处理
     */
    public String handle(OrderDTO dto);


}
