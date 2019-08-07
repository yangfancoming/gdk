package jdk8._interface;

/**
 * Created by 64274 on 2019/8/7.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/7---21:54
 */
public interface InterfaceA {

    /**
     * 静态方法
     */
    static void showStatic() {
        System.out.println("InterfaceA ----  showStatic");
    }


    /**
     * 默认方法
     */
    default void showDefault() {
        System.out.println("InterfaceA  ---- showDefault");
    }

}
