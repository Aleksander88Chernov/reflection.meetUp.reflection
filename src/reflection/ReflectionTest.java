package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public void printClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }
    public void printFieldsName(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
        }
    }
    public void printMethodsName(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
    public void printFieldAnnotations(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            Annotation[] annotations = field.getAnnotations();
           for (Annotation annotation : annotations) {
               System.out.println("Field "+field.getName()+"-"+annotation.toString());
           }
        }
    }
    public void printMethodsAnnotation(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            Annotation[] annotations = method.getAnnotations();
           for (Annotation annotation : annotations) {
               System.out.println(method.getName()+":"+annotation.toString());
           }
        }
    }
    public void setMaxSped(Object object) throws IllegalAccessException, NoSuchFieldException {
        Class clazz = object.getClass();
        Field maxSpedField = clazz.getDeclaredField("maxSped");
        maxSpedField.setAccessible(true);
        maxSpedField.setInt(object, 400);

    }
}
