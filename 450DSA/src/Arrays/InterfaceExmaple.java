//package Arrays;
//import java.util.Scanner;
//interface TwoWheel{
//
//    int wheels=2;
//
//}
//
//interface FourWheel{
//
//    int wheels=4;
//
//}
//
//abstract class Vehicle{
//
//    abstract int noOfWheels(); // should return number of wheels of vehicle
//    abstract int cubicCapacity(); // should return CC of vehicle.
//}
//
//class Bike extends Vehicle implements TwoWheel {
//
//    int noOfWheels(){
//        return wheels;
//    }
//    int cubicCapacity(){
//
//        System.out.println("Enter cubic capacity for bike:");
//        return new Scanner(System.in).nextInt();
//    }
//}
//
//class Car extends Vehicle implements FourWheel{
//    int noOfWheels(){
//        return wheels;
//    }
//    int cubicCapacity(){
//
//        System.out.println("Enter cubic capacity for bike:");
//        return new Scanner(System.in).nextInt();
//    }
//
//}
//
////1. Use above skeleton and develop  class Bike and Car.
////
////        2. Provide Menu with options
////
////        1. Create Bike     2. Create Car  3. Display All Bikes   4 Display All Cars
////
//
////        3. Use array of Vehicle class to hold objects of Bike & Car class.
//class res{
//    int w;
//    int cc;
//    res(){
//        w = 0;
//        cc = 0;
//    }
//}
//public class InterfaceExmaple {
//
//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        int choice;
//        int count = 0;
//
//        Vehicle[] arr = new Vehicle[10];
//        res[] forBike = new res[10];
//        res[] forCar = new res[10];
//        int n = arr.length-1;
//      do{
//          System.out.println("Press 0 for exit ");
//          System.out.println("Press 1 for creating bike ");
//          System.out.println("Press 2 for creating car ");
//          System.out.println("Press 3 for displaying bikes ");
//          System.out.println("Press 4 for displaying cars ");
//          System.out.println("Enter your choice");
//          choice = in.nextInt();
//          switch(choice){
//
//              case 1:
//                  arr[count] = new Bike();
//                  break;
//
//              case 2:
//                  arr[count] = new Car();
//                  break;
//              case 3:
//                    for(int j=0;j<arr.length;j++){
//                        if(arr[j] instanceof Bike){
//                            res a = new res();
//                            a.w = arr[j].noOfWheels();
//                            a.cc = arr[j].cubicCapacity();
//                           forBike[j] =a;
//                        }
//                    }
//                    int j = 0;
//                  while(forBike[j] != null){
//                      System.out.println(forBike[j].w +" "+forBike[j].cc);
//                      j++;
//                  }
//                  break;
//              case 4:
//
//                  for(int i=0;i<arr.length;i++){
//                      if(arr[i] instanceof Car){
//                          res a = new res();
//                          a.w = arr[i].noOfWheels();
//                          a.cc = arr[i].cubicCapacity();
//                          forCar[i] =a;
//                      }
//                  }
//                  int k =0;
//                  while(forCar[k] != null){
//                      System.out.println(forCar[k].w +" "+forCar[k].cc);
//                      k++;
//                  }
//                    break;
//              default:
//                  System.out.println("exits");
//
//          }
//          count++;
//          n--;
//      }while(choice != 0 && n>0 );
//
//
//    }
//}
