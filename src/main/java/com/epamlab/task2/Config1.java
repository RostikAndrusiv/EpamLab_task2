package com.epamlab.task2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config2.class)
@ComponentScan
public class Config1 {
}
