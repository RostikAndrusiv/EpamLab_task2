package com.epamlab.task2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanD implements Validator{
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    protected void initMethod() {
        System.out.println("BeanD: initialized (init method)");
    }

    protected void destroyMethod() {
        System.out.println("BeanD: destroyed (destroy method)");
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
