package Arrays;

//interface and abstract class
import java.util.*;
interface TwoWheel {
    int wheels = 2;
}
interface FourWheel {
    int wheels = 4;
}
abstract class Vehicle{
    abstract int noOfWheels();
    abstract int CubicCapacity();
    public void display()
    {
        System.out.println("Vehicle Details : ");
    }
}
class Bike extends Vehicle implements TwoWheel{
    int cc;
    Scanner sc = new Scanner(System.in);
    public int noOfWheels(){
        return wheels;
    }
    public int CubicCapacity(){
        System.out.println("Enter cubic capacity of bike");
        cc = sc.nextInt();
        return cc;
    }
    public void display()
    {
        super.display();
        System.out.println("Type : Two Wheeler");
        System.out.println("No of Wheels : " + wheels);
        System.out.println("CC of bike : " + cc);
        System.out.println();
    }
}
class Car extends Vehicle implements FourWheel{
    int cc;
    Scanner sc = new Scanner(System.in);
    public int noOfWheels(){
        return wheels;
    }
    public int CubicCapacity(){
        System.out.println("Enter cubic capacity of Car");
        cc = sc.nextInt();
        return cc;
    }
    public void display()
    {
        super.display();
        System.out.println("Type : Four Wheeler");
        System.out.println("No of Wheels : " + wheels);
        System.out.println("CC of Car : " + cc);
        System.out.println();
    }
}
public class transport {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of vehicles you want to create");
        int n = sc.nextInt();
        Vehicle[] v = new Vehicle[n];

        int i = 0, ch;
        System.out.println("Enter your choice");
        do {
            try {
                System.out.println("1. Create Bike \n2. Create Car \n3. Display all Bikes \n4. Display all Cars \n5. exit");

                ch = sc.nextInt();
                switch (ch) {
                    case 1: {
                        v[i] = new Bike();
                        v[i].noOfWheels();
                        v[i].CubicCapacity();
                        i++;
                        break;
                    }
                    case 2: {
                        v[i] = new Car();
                        v[i].noOfWheels();
                        v[i].CubicCapacity();
                        i++;
                        break;

                    }
                    case 3: {
                        for (int j = 0; j < n; j++) {
                            if (v[j] instanceof Bike) {
                                System.out.print("Vehicle : ");
                                System.out.print(j+1);
                                System.out.println("");
                                v[j].display();

                            }
                        }
                        break;
                    }
                    case 4: {
                        for (int j = 0; j < n; j++) {

                            if (v[j] instanceof Car) {
                                System.out.print("Vehicle : ");
                                System.out.print(j+1);
                                System.out.println();
                                v[j].display();
                            }
                        }
                        break;
                    }
                    case 5:
                    {
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Invalid Input");
                    }
                }
            }
            catch(Exception ArrayIndexOutOfBoundsException)
            {
                System.out.println("VEHICLE LIMIT EXCEEDED, CANNOT ADD MORE VEHICLES");
            }
        }
        while(true);

    }
}
