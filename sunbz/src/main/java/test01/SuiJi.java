package test01;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//随机生成五十万随机数目的为了测试，所以没有做随机生成数的”活“方法
public class SuiJi {
    //第一题 从五十万个随机不重复数字之中随机取出十万个不重复数字
    public static void main(String[] args) {
        List<Integer> list = wuShi();
        List<Integer> list1 = xuanZe(list);
        //list1 为最后的结果

    }

    //从五十万拿出十万
    public static List<Integer> xuanZe(List list){
        ArrayList<Integer> newList=(ArrayList<Integer>)list;
        Integer i = 0;
        //map的key取值的速度要比数组索引取值快
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : newList) {
            map.put(i++, i);
        }

        List<Integer> resu = new ArrayList<>();
        //一边生成随机数 一边查找存入set的方法要不断的操作五十万的map 所以先生成十万不相同key
        List<Integer> shiwan = shiWan();
        System.out.println(shiwan.get(1));
        shiwan.forEach(s -> {
            resu.add(map.get(s));
        });

        return resu;
    }






    //定义随机生成十万个随机数
    public static List<Integer> shiWan() {
        Random r = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < 100000) {
            //随机生成一百万以内的整数
            int i = r.nextInt(500000);
            set.add(i);
        }

        //list查询效率更高
        List<Integer> l = set.stream().collect(Collectors.toList());


        return l;
    }


    //定义方法用于测试，随机生成五十万个数字
    public static List<Integer> wuShi() {
        Random r = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < 500000) {
            //随机生成一百万以内的整数
            int i = r.nextInt(1000000);
            set.add(i);
        }

        //list查询效率更高
        List<Integer> l = set.stream().collect(Collectors.toList());


        return l;
    }
}
