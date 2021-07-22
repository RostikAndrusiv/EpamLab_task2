package com.epamlab.task2.beans;


public interface Validator {

    default void validate(String className, String name, int value) throws Exception {
        if (name == null) {
            throw new Exception("Error: Invalid name in " + className + System.lineSeparator() + "positive value is required, current name is " + name);
        }
        if (value < 0) {
            throw new Exception("Error: Invalid value in " + className + System.lineSeparator() + "positive value is required, current value is " + value);
        }
    }
}
