package top.zhujiayu;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;

/**
 * @auther zjy
 * @date 2020/6/1
 **/

//arraylist的扩容，调试时右击List -> view as object
public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        //初始化容量10
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //容量不够，增加为 10 + 10 / 2 = 15
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        //容量不够，增加为 15 + 15 / 2 = 22
        for (int i = 0; i < 99; i++) {
            list.add(i);
        }

    }
}
