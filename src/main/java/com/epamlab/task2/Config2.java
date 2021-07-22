package com.epamlab.task2;


import com.epamlab.task2.beans.BeanB;
import com.epamlab.task2.beans.BeanC;
import com.epamlab.task2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
public class Config2 {

    @Bean(name = "beanB", initMethod = "initMethod", destroyMethod = "destroyMethod")
    @DependsOn(value = "beanD")
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean(name = "beanC", initMethod = "initMethod", destroyMethod = "destroyMethod")
    @DependsOn(value = {"beanB", "beanD"})
    public BeanC getBeanC() {
        return new BeanC();
    }

    @Bean(name = "beanD", initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanD getBeanD() {
        return new BeanD();
    }
}
