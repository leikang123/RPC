package com.lk.service;

import com.lkj.RpcProxy;

public class SomeConsumer {
    public static void main(String[] args) {
        SomeService service = RpcProxy.create(SomeService.class);
        System.out.println(service.hello("Tom"));
        System.out.println(service.hashCode());
    }
}
