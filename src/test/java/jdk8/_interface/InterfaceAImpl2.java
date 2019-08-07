package jdk8._interface;

/**
 * Created by 64274 on 2019/8/7.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/7---22:03
 */
public class InterfaceAImpl2 implements InterfaceA {

    /**
     * 跟接口default方法一致,但不能再加default修饰符
     */
    @Override
    public void showDefault() {
        System.out.println("InterfaceAImpl2 实现类 重写 接口中的 default方法");
    }
}
