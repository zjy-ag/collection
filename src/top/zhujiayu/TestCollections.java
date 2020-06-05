package top.zhujiayu;

import java.util.*;

/**
 * @auther zjy
 * @date 2020/6/5
 **/

public class TestCollections {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("-----------");

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("-----------");

        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------");

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int)o2 - (int)o1;
            }
        });
        System.out.println(list);

        System.out.println("-----------");

        Collections.swap(list,0,4);
        System.out.println(list);

        System.out.println("-----------");

        //获取排序后下标最大的元素,不改变原本的集合
        Object max = Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        System.out.println(list);
        System.out.println(max);

        System.out.println("-----------");

        //获取排序后下标最小的元素,不改变原本的集合
        Object min = Collections.min(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) o2 - (int) o1;
            }
        });
        System.out.println(list);
        System.out.println(min);

        System.out.println("-----------");

        //元素出现的频率
        System.out.println(Collections.frequency(list, 1));


        List list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(10 + i);
        }
        //把src集合复制到现在集合的首部，注意：现在集合的size >= src集合的size
        Collections.copy(list2, list);
        System.out.println(list2);

        System.out.println("-----------");

        Collections.replaceAll(list,1,11);
        System.out.println(list);
    }
}
