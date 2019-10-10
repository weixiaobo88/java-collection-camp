package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Flatten {

    Integer[][] array;
    public Flatten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimensional() {
        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimensional() {
        throw new NotImplementedException();
    }
}
