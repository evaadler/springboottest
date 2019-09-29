package com.fifi.springboottest.filter;

import com.fifi.springboottest.bean.HtsMessage;

/**
 * @author Alicia
 * @description
 * @date 2019/9/21
 */
public class ActivityTypeFilter extends AbstractProcessorFilter<HtsMessage> {

    // 在初始化里，拿到父类的泛型等put进map，所以拿到的是HtsMessage
}
