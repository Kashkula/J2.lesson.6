package com.company;

public class Count<T extends Number> implements Calculate<T> {

    protected T third;
    protected T fourth;

    public Count(T third, T fourth) {
        this.third = third;
        this.fourth = fourth;
    }

    public T getThird() {
        return third;
    }

    public T getFourth() {
        return fourth;
    }

    @Override
    public void minus(T first, T second) {
        int result = first.intValue() - second.intValue() - third.intValue() - fourth.intValue();
        System.out.println(result);
    }

    @Override
    public void plus(T first, T second) {
        int result = first.intValue() + second.intValue() + third.intValue() + fourth.intValue();
        System.out.println(result);
    }
}
