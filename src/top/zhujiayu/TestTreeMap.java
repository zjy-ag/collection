package top.zhujiayu;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @auther zjy
 * @date 2020/6/5
 **/

public class TestTreeMap {

    public static void main(String[] args) {


        TreeMap treeMap = new TreeMap<>(new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                Employee employee1 = (Employee) o1;
                Employee employee2 = (Employee) o2;
                if (employee1.getSalary() > employee2.getSalary()) {
                    return 1;
                } else if (employee1.getSalary() < employee2.getSalary()) {
                    return -1;
                }
                return Integer.compare(employee1.getAge(), employee2.getAge());
            }
        });

        treeMap.put(new Employee("zhangsan", 19, 3000.1), 1111);
        treeMap.put(new Employee("lisi", 20, 2000.1), 1112);
        treeMap.put(new Employee("wangwu", 21, 4000.1), 1113);
        treeMap.put(new Employee("zhaoliu", 22, 6000.1), 1114);
        treeMap.put(new Employee("tianqi", 23, 3000.1), 1115);

        Set entrySet = treeMap.entrySet();

        for (Object o : entrySet) {
            Map.Entry set = (Map.Entry) o;
            System.out.println(set.getKey() + "  " + set.getValue());
        }
    }
}
