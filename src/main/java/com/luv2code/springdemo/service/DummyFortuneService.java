package com.luv2code.springdemo.service;

public class DummyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Nope. Just Dummy Fortune Class";
    }
}
