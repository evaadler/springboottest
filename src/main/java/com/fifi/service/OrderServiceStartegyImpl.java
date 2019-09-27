package com.fifi.service;

import com.fifi.annotation.HandlerContext;
import com.fifi.bean.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
@Service
public class OrderServiceStartegyImpl implements IOrderService
{
    @Autowired
    HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }
}


