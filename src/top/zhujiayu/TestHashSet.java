package top.zhujiayu;

import java.util.HashSet;

/**
 * @auther zjy
 * @date 2020/6/2
 **/

public class TestHashSet {

    public static void main(String[] args) {

        HashSet<Object> hashSet = new HashSet<>();

        hashSet.add(new Person("zhangsan", 22));
        hashSet.add(new Person("zhangsan", 22));//需要重写hashcode和equals方法
        hashSet.add(new Person("lisi", 23));
        hashSet.add(new Person("wangwu", 24));
        hashSet.add(new Person("zhaoliu", 25));

        Utils.print(hashSet);
    }
}
