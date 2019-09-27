package com.fifi.annotation;

import com.fifi.bean.BeanTool;
import com.fifi.service.AbstractHandler;

import java.util.Map;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
public class HandlerContext {
    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handler){
        handlerMap = handler;
    }

    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if (clazz == null){
            throw new IllegalArgumentException("not found handler type "+ type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
