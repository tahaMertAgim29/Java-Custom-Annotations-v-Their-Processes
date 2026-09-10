package Annotations.fieldAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Processor {

    private int counter = 0;
    public void process(Object object) throws Exception {

        Class<?> claz = object.getClass();
        Field[] fields = claz.getDeclaredFields();

        for(Field field: fields) {

            if(field.isAnnotationPresent(Required.class)) {

                field.setAccessible(true);

                Object value = null;
                if(object instanceof Character)
                    value = field.get(object);

                if(value == null) {
                    throw new UnidentifiedValueException(field.getName() + " must not be null or unidentified");
                }

            }
            if(field.isAnnotationPresent(AutoIncrement.class)) {

                field.setAccessible(true);

                counter++;

                field.set(object, counter);
            }

            else 
                continue;
        }

        for(Method method: claz.getDeclaredMethods()) {

            if(method.isAnnotationPresent(Printable.class)) {

                method.invoke(object);
            }
            else
                continue;
        }
    }
}
