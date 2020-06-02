package top.zhujiayu;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @auther zjy
 * @date 2020/6/2
 **/

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                return Integer.compare(p2.getAge(), p1.getAge());//desc
            }
        });

        treeSet.add(new Person("zhangsan", 22));
        treeSet.add(new Person("lisi", 23));
        treeSet.add(new Person("wangwu", 24));
        treeSet.add(new Person("zhaoliu", 25));

        Utils.print(treeSet);
    }
}
