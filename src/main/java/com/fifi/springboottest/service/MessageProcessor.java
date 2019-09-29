package com.fifi.springboottest.service;

public interface MessageProcessor {
    void init();

    void before();

    void after();
}
