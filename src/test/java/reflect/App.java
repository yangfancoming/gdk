package reflect;

import reflect.model.Constructor2;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * Created by 64274 on 2019/8/6.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/6---15:46
 */
public class App {


    Class aClass2 = Constructor2.class;


    /** getParameterTypes 测试  */
    @Test
    public void test4()  {
        Constructor<?>[] consts = aClass2.getDeclaredConstructors();
        Class<?>[] c1 = consts[0].getParameterTypes();
        Class<?>[] c2 = consts[1].getParameterTypes();
        Class<?>[] c3 = consts[2].getParameterTypes();
        Class<?>[] c4 = consts[3].getParameterTypes();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        Arrays.stream(consts).forEach(x->System.out.println(x.getParameterTypes().length));
        Assert.assertEquals(3,consts.length);

    }

}
