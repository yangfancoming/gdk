import model.Constructor2;
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
    @Test
    public void test4()  {
        Constructor<?>[] consts = aClass2.getConstructors();
        Arrays.stream(consts).forEach(x->System.out.println(x.getParameterTypes().length));
        Assert.assertEquals(3,consts.length);
    }

}
