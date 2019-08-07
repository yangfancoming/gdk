package jdk8._interface;

/**
 * Created by 64274 on 2019/8/7.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/7---22:05
 */
public interface InterfaceB {

    /**
     * 静态方法
     */
    static void showStatic() {
        System.out.println("InterfaceB++showStatic");
    }

    /**
     * 默认方法
     */
    default void showDefault() {
        System.out.println("InterfaceB ++showDefault");
    }

}