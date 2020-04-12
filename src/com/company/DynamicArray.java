package com.company;

public class DynamicArray<T> {
    private T item;
    private int localLength;
    private Object[] arr;

    DynamicArray() {
        this.localLength = 0;
    }

    public void push(T item) {
        localLength++;

        Object[] newArr = new Object[localLength];
        if (localLength == 1)  {
            newArr[0] = item;
        } else {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[localLength-1] = item;
        }
        arr = newArr;
    }

    public int findCollisions() {
        int collisions = 0;
        if (localLength == 1) return collisions;

        for(int i = 0 ; i < localLength; i++) {
            for(int j = i+1; j < localLength; j++) {
                if ((int) arr[i] ==(int) arr[j]) {
                    ++collisions;

                }
            }
        }
        return collisions;
    }

    T getItem(int i) {
        return (T) arr[i];
    }
}
