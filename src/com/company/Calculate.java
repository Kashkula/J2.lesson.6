package com.company;

public interface Calculate<T extends Number> {

    void minus(T first, T second);

    void plus(T first, T second);
}
