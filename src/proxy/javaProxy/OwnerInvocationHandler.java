package proxy.javaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by xu on 01/08/2017.
 */
public class OwnerInvocationHandler implements InvocationHandler { //所有调用处理器都实现InvocationHandler接口
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

            try {
                if (method.getName().startsWith("get"))//如果方法是getter，我们就调用person内的方法
                    return method.invoke(person, args);
                else if (method.getName().equals("setHotOrNotRating"))//如果方法是setHotOrNotRating，抛出异常
                    throw new IllegalAccessException();
                else if (method.getName().startsWith("set"))//如果我们是拥有者，所以任何其他set方法都可以，我们就在主题上调用它
                    return method.invoke(person, args);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {//如果真正主题抛出异常的话，就会抛出这里
                e.printStackTrace();
            }
            return null;//如果调用其他方法，一律不理，返回null
    }
}
