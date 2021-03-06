package com.epamlab.task2.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class BeanF implements Validator{
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
