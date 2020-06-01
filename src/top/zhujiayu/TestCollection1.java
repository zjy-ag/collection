package top.zhujiayu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @auther zjy
 * @date 2020/5/30
 **/

public class TestCollection1 {

    public static void main(String[] args) {

        Collection collection = new ArrayList<>();

        collection.add("111");
        collection.add("112");
        collection.add("113");
        collection.add("114");
        collection.add("115");

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------");

        //不能在增强for里增删元素，因为每一次执行next方法都要判断modCount是否改变，而增删都会改变这一数值
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
