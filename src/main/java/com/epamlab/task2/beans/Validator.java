package com.epamlab.task2.beans;


public interface Validator {

    default boolean validate(String className, String name, int value) {
        if (name == null) {
//            throw new Error("Invalid name in " + className + System.lineSeparator() + "positive value is required, current name is " + name);
            System.out.println("Invalid name in " + className + System.lineSeparator() + "not null name is required");
        }
        if (value <0) {
//            throw new Error("Invalid value in " + className + System.lineSeparator() + "positive value is required, current value is " + value);
            System.out.println("Invalid value in " + className + System.lineSeparator() + "positive value is required, current value is " + value);
        }
        return true;
    }
}
