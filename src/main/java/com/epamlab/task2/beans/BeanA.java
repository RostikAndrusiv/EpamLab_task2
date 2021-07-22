package com.epamlab.task2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean, Validator {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA: destroyed (DisposableBean Interface method)");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("beanA: initialized (InitializingBean Interface method)");
    }
}
