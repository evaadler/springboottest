package com.fifi.springboottest.service;
import com.fifi.springboottest.annotation.HandlerContext;
import com.fifi.springboottest.bean.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
//@Service
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


