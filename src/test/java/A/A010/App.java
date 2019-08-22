package A.A010;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by 64274 on 2019/8/22.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/22---16:22
 */
public class App {

    Map<String,Object> hashMap = new HashMap<>();

    SortedMap<String,Object> sortedMap = new TreeMap<>();

    @Before
    public void before() {
    }


    /** 看上去还以为HashMap也保证了有序性，其实是随机的，如果值设置的复杂一点 hashMap 就不行了 */
    @Test
    public void test(){
        hashMap.put("1", "a");
        hashMap.put("5", "b");
        hashMap.put("2", "c");
        hashMap.put("4", "d");
        hashMap.put("3", "e");
        Set<Map.Entry<String, Object>> entry = hashMap.entrySet();
        for(Map.Entry<String, Object> temp : entry){
            System.out.println("hashMap:" + temp.getKey() + " 值" + temp.getValue() );
        }

        sortedMap.put("1", "a");
        sortedMap.put("5", "b");
        sortedMap.put("2", "c");
        sortedMap.put("4", "d");
        sortedMap.put("3", "e");
        System.out.println("\n");
        Set<Map.Entry<String, Object>> entry2 = sortedMap.entrySet();
        for(Map.Entry<String, Object> temp : entry2){
            System.out.println("sortedMap:"+temp.getKey()+" 值"+temp.getValue());
        }
    }


    /** 很显然只有TreeMap保证了有序性 */
    @Test
    public void test2(){
        hashMap.put("1b", "a");
        hashMap.put("2", "b");
        hashMap.put("4b", "d");
        hashMap.put("3", "c");
        hashMap.put("2b", "d");
        hashMap.put("3b", "c");
        Set<Map.Entry<String, Object>> entry = hashMap.entrySet();
        for(Map.Entry<String, Object> temp : entry){
            System.out.println("hashMap:"+temp.getKey()+" 值"+temp.getValue());
        }

        System.out.println("\n");

        sortedMap.put("1b", "a");
        sortedMap.put("2", "b");
        sortedMap.put("4b", "d");
        sortedMap.put("3", "c");
        sortedMap.put("2b", "d");
        sortedMap.put("3b", "c");
        Set<Map.Entry<String, Object>> entry2 = sortedMap.entrySet();
        for(Map.Entry<String, Object> temp : entry2){
            System.out.println("sortedMap:"+temp.getKey()+" 值"+temp.getValue());
        }
    }

    @Test
    public void test3(){
        SortedMap<String,String> map = new TreeMap<>() ; //通过子类实例化接口对象
        map.put("D","DDDDD") ;
        map.put("A","AAAAA") ;
        map.put("C","CCCCC") ;
        map.put("B","BBBBB") ;
        System.out.println("第一个元素的key:" + map.firstKey()) ;
        System.out.println("key对应的值为:" + map.get(map.firstKey())) ;

        System.out.println("最后一个元素的key:" + map.lastKey()) ;
        System.out.println("key对应的值为:" + map.get(map.lastKey())) ;

        System.out.println("返回小于指定范围的集合（键值小于“C”）") ;
        for(Map.Entry<String,String> me:map.headMap("C").entrySet()){
            System.out.println("\t|- " + me.getKey() + "-->" + me.getValue()) ;
        }
        System.out.println("返回大于指定范围的集合（键值大于等于“C”）") ;
        for(Map.Entry<String,String> me:map.tailMap("C").entrySet()){
            System.out.println("\t|- " + me.getKey() + "-->" + me.getValue()) ;
        }
        System.out.println("返回部分集合（键值“B”和“D”之间,包括B不包括D）") ;
        for(Map.Entry<String,String> me:map.subMap("B","D").entrySet()){
            System.out.println("\t|- " + me.getKey() + "-->" + me.getValue()) ;
        }
    }
}
