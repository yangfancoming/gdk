package jdk8._interface;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/7.
 * @Description:  测试 java8 中新增的 接口 default 方法 和 static 方法
 * @author  山羊来了
 * @date 2019/8/7---21:54
 */
public class App {

    /** 测试 static 方法
     * 定义一个或者更多个静态方法。用法和普通的static方法一样
     * 注意：实现接口的类或者子接口不会继承接口中的静态方法
     */
    @Test
    public void test(){
        InterfaceA.showStatic();
    }

    /** 测试 default 方法  实现单一接口，仅实现接口
     */
    @Test
    public void test1(){
        new InterfaceAImpl().showDefault();
    }

    /** 测试 default 方法  实现单一接口，重写接口中的default方法
     */
    @Test
    public void test2(){
        new InterfaceAImpl2().showDefault();
    }

    /** 测试 default 方法  实现多个接口，且接口中拥有相同的default方法和static方法
     *  InterfaceAImpl2 实现单个接口  可以不去实现 接口中的 default方法和static方法  编译器不会报错
     *  InterfaceImpl3 实现多个接口  如果每个接口种都有相同的default方法 那么必须要重写该方法。 否则编译器报错
     */
    @Test
    public void test3(){
        new InterfaceImpl3().showDefault();
    }
}
