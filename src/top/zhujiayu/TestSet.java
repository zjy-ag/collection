package top.zhujiayu;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther zjy
 * @date 2020/6/2
 **/

//无序、不允许重复、至多一个null
public class TestSet {

    public static void main(String[] args) {

        Set set = new HashSet<>();

        set.add(null);
        set.add("apple");
        set.add("banana");
        set.add(null);
        set.add("apple");
        set.add("banana");

        for (Object o : set) {
            System.out.println(o);
        }

    }
}
