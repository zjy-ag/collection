package top.zhujiayu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @auther zjy
 * @date 2020/6/3
 **/

//map的遍历方式的三种方式
public class TestMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        //无序插入
        map.put("pgone", "李小璐");
        map.put("贾乃亮", "李小璐");
        map.put("王宝强", null);
        map.put(null, "马蓉");
        map.put("东亚劲夫", "外国人");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        //使用entrySet()遍历需要Map指定K,V的类型
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("---------");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + "  " + map.get(string));
        }

        System.out.println("---------");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }


    }
}












