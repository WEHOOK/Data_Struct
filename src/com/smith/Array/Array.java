package com.smith.Array;

public class Array {

    private int size;

    private int[] data;


    /**
     * 构造函数，创建指定大小的数组
     *
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 构造函数，默认创建容量为10的数组
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素的个数
     *
     * @return int
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的长度
     *
     * @return int
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 向数组指定位置添加元素
     *
     * @param index 位置
     * @param e     元素
     */
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("add fail,Array is full");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add fail,index > 0 && index < size ");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }

    /**
     * 向数组末尾添加元素
     *
     * @param e e
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 向数组头添加元素
     *
     * @param e e
     */
    public void addFirst(int e) {
        add(0, e);
    }


}
