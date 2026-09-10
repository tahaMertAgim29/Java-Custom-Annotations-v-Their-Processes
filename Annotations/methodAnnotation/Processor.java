package Annotations.methodAnnotation;

import java.lang.reflect.Method;

public class Processor {


    public void process(Object object, int number) throws Exception {

        Class<?> claz = object.getClass();
        
        for(Method method: claz.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Evaluate.class)) {
                
                method.invoke(object, number);
            }
        }
    }
}
