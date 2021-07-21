package com.zhong.stream;

import com.google.common.collect.Lists;
import com.zhong.entity.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    /**  计算
     * 题目要求：一分钟内完成此题，只能用一行代码实现！
     * 现在有5个用户！筛选：
     * 1、ID 必须是偶数
     * 2、年龄必须大于23岁
     * 3、用户名转为大写字母
     * 4、用户名字母倒着排序
     * 5、只输出一个用户！
     */
    public static void main(String[] args) {

        User u1 = new User(10, 12, "mao",true, Lists.newArrayList());
        User u2 = new User(20, 20, "gou",true,  Lists.newArrayList());
        User u3 = new User(30, 35, "ji",true,  Lists.newArrayList());
        User u4 = new User(40, 68, "niao",true,  Lists.newArrayList());
        User u5 = new User(5, 5, "chong",true,  Lists.newArrayList());
        User u6 = new User(60, 25, "yu",true,  Lists.newArrayList());

        List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6);

        //计算交给stream流
        //对list进行一些处理,map之后再用sorted 会不一样
        list.stream()
                .filter(user -> { return user.getId() % 2 == 0; })
                .filter(user -> user.getId() != 0)
                .filter(user -> { return user.getAge() > 23 ;})
                .map(user -> { return user.getName().toUpperCase(); })
                .sorted((one,two)->{ return two.compareTo(one);}) //用户名字母倒着排序
//                .sorted(Comparator.comparing(User :: getAge))
                .limit(6)
                .forEach(System.out::println);
        /*
        结果：
            YU
            NIAO
            JI
         */
        System.out.println("----------------------------------");

        //对list排序
        list.stream()
                .sorted(Comparator.comparing(User::getAge).reversed().thenComparing(User::getId)) //逆序
                .forEach(System.out::println);
        /*
        结果：
            User(id=40, age=68, name=niao)
            User(id=30, age=35, name=ji)
            User(id=60, age=25, name=yu)
            User(id=20, age=20, name=gou)
            User(id=10, age=12, name=mao)
            User(id=5,  age=5,  name=chong)
         */
        System.out.println("----------------------------------");

        //取出user的name属性收集起来放到list里面
        List<String> collect = list.stream()
                .map(User::getName) //map 更像是直接去取值
                .collect(Collectors.toList());
        System.out.println(collect);
        /*
        结果：
            [mao, gou, ji, niao, chong, yu]
         */
        System.out.println("----------------------------------");

        //先用map，再用sortd ，排序就会利用map的结果来排序
        list.stream()
                .map(User::getId)
                .sorted(((o1, o2) -> o1.compareTo(o2) )) //升序
                .forEach(System.out::println);
        /*
        结果：
            5
            10
            20
            30
            40
            60
         */

        // id作为map的key，此对象作为map的value  -> (Id, List<User>)
        System.out.println("----------------------------------");
        Map<Integer, List<User>> map = list.stream()
                .collect(Collectors.groupingBy(user -> user.getId()));
        System.out.println(map);
        /*
        结果：
            {
                20=[User(id=20, age=20, name=gou)],
                5 =[User(id=5,  age=5,  name=chong)],
                40=[User(id=40, age=68, name=niao)],
                10=[User(id=10, age=12, name=mao)],
                60=[User(id=60, age=25, name=yu)],
                30=[User(id=30, age=35, name=ji)]
            }
         */
    }
}
