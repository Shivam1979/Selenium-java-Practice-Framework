package JavaPractice.JavaBasics.OOP.classAndObject;
/*
Create a class Car with variables: brand, model, price.
 Create 3 objects and print their details.
 */
public class Car {

    String brand = null;
    String model = null;

    long price = 0;

    public Car(String brand, String model, long price) {
        this.brand= brand;
        this.model= model;
        this.price = price;
    }

    public static void main(String args[]) {

        Car car = new Car("Suzuki", "Brezza", 1600000);
        String b = car.brand;
        System.out.println("brand name is : " + b);
        System.out.println("Car model name is : " + car.model);
        System.out.println("Car price is : " + car.price);

        Car car1 = new Car("Suzuki", "hym", 20000);
        String a = car1.brand;
        System.out.println("brand name is : " + a);
        System.out.println("Car model name is : " + car1.model);
        System.out.println("Car price is : " + car.price);
    }


}
