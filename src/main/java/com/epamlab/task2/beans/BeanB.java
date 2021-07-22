package com.epamlab.task2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanB implements Validator {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    protected void initMethod() {
        System.out.println("BeanB: initialized (init method)");
    }

    protected void destroyMethod() {
        System.out.println("BeanB: destroyed (destroy method)");
    }

    protected void beanFactoryDestroyMethod() {
        System.out.println("BeanB: destroyed by BeanFactoryPostProcessor");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
