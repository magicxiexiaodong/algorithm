package com.xxd.algo.base.array;

/**
 * @Author: XiaoDong.Xie
 * @DateTime: 2020/2/26 10:27
 * @Description: 1) 数组的插入、删除、按照下标随机访问操作；
 * 2）数组中的数据是int类型的；
 */
public class Array {
    public int data[];
    // 数组长度
    private int n;
    // 数据存储的个数
    private int count;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    /**
     * 根据索引找到数组中的元素并返回
     *
     * @param index 索引
     * @return 元素
     */
    public int find(int index) throws Exception {
        checkIndexForFind(index);
        return data[index];
    }

    /**
     * 检查索引是否越界
     *
     * @param index
     * @throws Exception
     */
    private void checkIndexForFind(int index) throws Exception {
        if (index < 0 || index >= count)
            throw new Exception("数组索引有错");
    }

    /**
     * 检查索引是否越界
     *
     * @param index
     * @throws Exception
     */
    private void checkIndex(int index) throws Exception {
        if (index < 0 || index >= n)
            throw new Exception("数组索引有错");
    }

    /**
     * 插入元素：头部插入，尾部插入
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) throws Exception {
        checkIndex(index);

        for (int i = count; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    /**
     * 根据索引，删除数组中的元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= count) return false;

        //从删除位置开始，将后面的元素向前移动一位

        for (int i = index + 1; i < count; ++i) {
            data[i - 1] = data[i];
        }
        --count;
        return true;
    }

}
