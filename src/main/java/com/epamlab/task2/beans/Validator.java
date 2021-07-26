package com.epamlab.task2.beans;


public interface Validator {

    default void validate(String className, String name, int value) throws IllegalArgumentException{
        if (name == null) {
            throw new IllegalArgumentException("Error: Invalid name in " + className + System.lineSeparator() + "positive name is required, current name is " + name);
        }
        if (value < 0) {
            throw new IllegalArgumentException("Error: Invalid value in " + className + System.lineSeparator() + "positive value is required, current name is " + name);
        }
    }
}
