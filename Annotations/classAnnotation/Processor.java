package Annotations.classAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import Annotations.fieldAnnotation.AutoIncrement;
import Annotations.fieldAnnotation.Printable;
import Annotations.fieldAnnotation.Required;
import Annotations.fieldAnnotation.UnidentifiedValueException;

public class Processor {
    private int counter = 0;

    public void process(Object object) throws Exception {

        Class<?> claz = object.getClass();
        Field[] fields = claz.getDeclaredFields();
        // Processing the Class Type Annotation
        if(claz.isAnnotationPresent(Entity.class)) {
            Entity entity = claz.getAnnotation(Entity.class);
            System.out.println("Entity name: " + entity.name());
        }
        
        // Processing the Field Type Annotations
        for(Field field: fields) {

            if(field.isAnnotationPresent(Required.class)) {

                field.setAccessible(true);

                Object value = field.get(object);
                if(value == null) {
                    throw new UnidentifiedValueException(field.getName() + " cannot be null or unidentified");
                }

            }
            if(field.isAnnotationPresent(AutoIncrement.class)) {

                field.setAccessible(true);

                counter++;

                field.set(object, counter);
            }

            if(field.isAnnotationPresent(MoreThan.class)) {
                field.setAccessible(true);
                MoreThan moreThan = field.getAnnotation(MoreThan.class);

                Object value = field.get(object);

                if(value instanceof Number number) {

                    double actual = number.doubleValue();
                    double limit = moreThan.limit();

                    if(actual < limit) {
                        throw new OutOfIntervalException("The value is out of the defined interval");
                    }
                }
            }
            if(field.isAnnotationPresent(LessThan.class)) {
                field.setAccessible(true);
                LessThan lessThan = field.getAnnotation(LessThan.class);

                Object value = field.get(object);

                if(value instanceof Number number) {
                    double actual = number.doubleValue();
                    double limit = lessThan.limit();

                    if(actual > limit) {
                        throw new OutOfIntervalException("The value is out od the defined interval");
                    }
                }
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
