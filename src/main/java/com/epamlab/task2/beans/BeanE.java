package com.epamlab.task2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements Validator{
    private String name;
    private int value;

    @PostConstruct
    protected void initMethod() {
        System.out.println("BeanE: initialized (PostConstruct annotation)");
    }

    @PreDestroy
    protected void destroyMethod() {
        System.out.println("BeanE: destroyed (PreDestroy annotation)");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
