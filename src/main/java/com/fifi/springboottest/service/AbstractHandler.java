package com.fifi.springboottest.service;

import com.fifi.springboottest.bean.OrderDTO;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
public abstract class AbstractHandler {
    abstract public String handle(OrderDTO dto);
}
