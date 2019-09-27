package com.fifi.springboottest;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements HelloInterface {
    @Override
    public void sayHelllo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("userHello");
    }
}
