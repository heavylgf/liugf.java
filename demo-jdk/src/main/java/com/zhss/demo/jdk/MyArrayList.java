package com.zhss.demo.jdk;

import java.util.Arrays;

/**
 * 自己编写的ArrayList类
 * Created by CTWLPC on 2018/11/1.
 */
public class MyArrayList {

    private Object[] elements;

    private static int defaultCapacity = 10;

    // 集成的长度(注意这个长度不是elements数组的长度)
    private int size;

    /**
     * 默认构造器
     */
    public MyArrayList() {
        this(defaultCapacity);
    }

    /**
     * 指定长度构造器
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    /**
     * 末尾添加一个元素
     *
     * @param element
     * @return
     */
    public boolean add(Object element) {
        // 判断容量是否足够
        if (size == elements.length) {
            // 扩容
            grow();
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * 指定位置添加元素
     *
     * @param index
     * @param element
     * @return
     */
    public boolean add(int index, Object element) {
        // 判断时候越界
        rangeCheck(index);

        // 判断是否需要扩容
        if (size == elements.length) {
            grow();
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
        return true;
    }

    /**
     * 删除指定元素
     *
     * @param index
     * @return
     */
    public Object remove(int index) {
        //判断是否越界
        rangeCheck(index);

        // 获取要删除的值
        Object oldElement = elements[index];

        // 需要移动的元素数量
        int movNum = size - index - 1;
        // 如果movNum == 0, 表示删除的是最后一位的元素，就不需要移动数组了
        if (movNum > 0) {
            // 指定位置之后的所有元素向前移动一位
            // 相当于将elements数组中从index + 1位置起之后 movNum 多个元素复制到elements数组中，
            // 且起始位置是index
            System.arraycopy(elements, index + 1, elements, index, movNum);
        }
        // 将最后一个元素设置为null
        elements[size - 1] = null;
        size--;
        return oldElement;
    }

    /**
     * 更新数组中指定位置的元素的值
     *
     * @param index
     * @param element
     * @return
     */
    public Object set(int index, Object element) {
        // 判断是否越界
        rangeCheck(index);

        // 获取之前数组中index位置的值
        Object oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    /**
     * 获取元素
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        // 判断是否越界
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 获取集合长度
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 扩容
     */
    private void grow() {
        // 1.5 倍扩容
        int size = elements.length + (elements.length >> 1);
        // copy 元素到新数组中
        elements = Arrays.copyOf(elements, size);
    }

    /**
     * 判断越界
     *
     * @param index
     */
    private void rangeCheck(int index) {
        if (index > elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index：" + index + ", Size：" + elements.length);
        }
    }


    @Override
    public String toString() {
        StringBuilder resultStr = new StringBuilder();
        resultStr.append("[");
        for (int i = 0; i < size; i++) {
            if (resultStr.length() == 1) {
                resultStr.append(elements[i]);
            } else {
                resultStr.append(",").append(elements[i]);
            }
        }
//      for(Object element : elements) {
//          if(resultStr.length() == 1) {
//              resultStr.append(element);
//          } else {
//              resultStr.append(",").append(element);
//          }
//      }
        resultStr.append("]");
        return resultStr.toString();
    }


}
