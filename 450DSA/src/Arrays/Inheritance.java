package Arrays;
import java.util.Scanner;

class Person {
    static int ID;
    int id;
    String Name;

    public void set1(){
        Scanner scan = new Scanner(System.in);
        id = ++ID;
        System.out.print("Enter name : ");
        Name = scan.next();
    }
}

class Employee extends Person {
    int Salary;
    int ManagerId;
    String Post;
    boolean IsManager;

    public void set2(){
        Scanner scan = new Scanner(System.in);
        super.set1();
        System.out.print("Enter Post : ");
        Post = scan.next();
        System.out.print("Enter Manager ID : ");
        ManagerId = scan.nextInt();
        System.out.print("Enter Salary : ");
        Salary = scan.nextInt();
    }

    public void displayemp(){
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + Name);
        System.out.println("Salary : " + Salary);
        System.out.println("Manager ID : " + ManagerId);
        System.out.println("Post : " + Post);
    }
}

class Manager extends Employee {
    String Department;
    public void set3() {
        super.set2();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Department : ");;
        Department = scan.next();
    }
    public void displayman(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + Name);
        System.out.println("Salary : " + Salary);
        System.out.println("Manager ID : " + ManagerId);
        System.out.println("Post : " + Post);
        System.out.println("Department : " + Department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ch;
        int i = 0;
        Manager m = new Manager();
        m.displayman();
        Person p = new Person();
        p.set1();
        ((Manager)p).set3();


        float a = 10;
        int b =(int) a;
        char c = (char)(97);
        System.out.println(c);
//        Person p[] = new Person[10];
//
//        do {
//            System.out.println("Menu");
//            System.out.println("1. Create Manager");
//            System.out.println("2. Create Employee");
//            System.out.println("3. Display");
//            System.out.println("4. Exit");
//            ch = scan.nextInt();
//
//            switch(ch) {
//                case 1:
//                    p[i] = new Manager();
//                    ((Manager)p[i]).set3();
//                    ((Manager)p[i]).IsManager = true;
//                    ((Manager)p[i]).ManagerId = 0;
//                    i++;
//                    break;
//                case 2:
//                    p[i]= new Employee();
//                    ((Employee)p[i]).set2();
//                    ((Employee)p[i]).IsManager=false;
//                    i++;
//                    break;
//                case 3:
//                    System.out.println("1.Display All Employees\n2.Display All Managers\n3.Display Employees by ManagerId");
//                    int ch1=scan.nextInt();
//                    switch(ch1){
//                        case 1:
//                            for(int j=0;j<i;j++){
//                                if(((Employee)p[j]).IsManager==false){
//                                    ((Employee)p[j]).displayemp();
//                                }
//                            }
//
//                            break;
//
//                        case 2:
//                            for(int j=0;j<i;j++){
//                                if(((Manager)p[j]).IsManager==true){
//                                    ((Manager)p[j]).displayman();
//                                }
//                            }
//                            break;
//
//                        case 3:
//                            System.out.print("Enter Manager ID : ");
//                            int m_id=scan.nextInt();
//                            for(int j=0;j<i;j++){
//                                if(((Employee)p[j]).ManagerId == m_id){
//                                    ((Employee)p[j]).displayemp();
//                                    System.out.println("He/She not Manager");
//                                }
//                            }
//                            break;
//
//                        default :
//                            System.out.println("Invalid Input");
//
//                    }
//                    break;
//
//                case 4 :
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Invalid Input");
//
//            }
//        }while(true);



    }
}

