package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics<T>{
        public<T> List<List<T>> boxingMethod(T name) {
        List<T> firstList = new ArrayList<T>();
        firstList.add(name);
        List<List<T>> secondList = new ArrayList<List<T>>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public<T> void cloneMethod(List<T> consumer, List<T> producer) {
        consumer.addAll(producer);
    }

}
