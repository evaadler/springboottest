package com.fifi.service;

import com.fifi.bean.OrderDTO;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
public class IOrderServiceImpl implements IOrderService {

    @Override
    public String handle(OrderDTO dto) {

        String type = dto.getType();

        if ("1".equals(type) ){

        }
        return null;
    }
}
