package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics<T>{
        public List<List<T>> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<T>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public T genericMethod(T data) {

            return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
