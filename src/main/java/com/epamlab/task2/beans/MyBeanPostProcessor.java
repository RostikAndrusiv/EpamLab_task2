package com.epamlab.task2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Validator) {
            Class<?> beanClass = bean.getClass();
            String className = beanClass.getName();
            try {
                Field nameField = beanClass.getDeclaredField("name");
                nameField.setAccessible(true);
                String name = (String) nameField.get(bean);
                Field valueField = beanClass.getDeclaredField("value");
                valueField.setAccessible(true);
                int value = (Integer) valueField.get(bean);
                try {
                    ((Validator) bean).validate(className, name, value);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }
}
