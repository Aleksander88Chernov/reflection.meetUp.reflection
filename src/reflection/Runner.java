package reflection;

public class Runner {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("BMW","sedan",200);
        ReflectionTest reflectionTest = new ReflectionTest();
//         reflectionTest.printClassName(car);
//         System.out.println("-----------------------------------");
//         reflectionTest.printFieldsName(car);
//         reflectionTest.printMethodsName(car);
//        System.out.println("-----------------------------------");
//        reflectionTest.printFieldAnnotations(car);
        System.out.println(car.toString());
        reflectionTest.setMaxSped(car);
        System.out.println(car.toString());
    }
}
