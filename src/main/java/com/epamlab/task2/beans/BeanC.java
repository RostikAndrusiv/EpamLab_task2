package com.epamlab.task2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanC implements Validator{
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    protected void initMethod() {
        System.out.println("BeanC: initialized (init method)");
    }

    protected void destroyMethod() {
        System.out.println("BeanC: destroyed (destroy method)");
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
