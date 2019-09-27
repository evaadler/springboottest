package com.fifi.service;

public interface MessageProcessor {
    void init();

    void before();

    void after();
}
