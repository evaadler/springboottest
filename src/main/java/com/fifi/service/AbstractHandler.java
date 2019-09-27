package com.fifi.service;

import com.fifi.bean.OrderDTO;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
public abstract class AbstractHandler {
    abstract public String handle(OrderDTO dto);
}
