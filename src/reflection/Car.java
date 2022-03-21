package reflection;


public class Car {
    @Deprecated
    private String brand;
    private String type;
    private int maxSped;


    public Car(String brand,String type,Integer maxSped) {
        this.brand = brand;
        this.type = type;
        this.maxSped = maxSped;

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getMaxSped() {
        return maxSped;
    }

    @Override
    public String toString() {
        return "reflection.Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", maxSped=" + maxSped +
                '}';
    }
}
