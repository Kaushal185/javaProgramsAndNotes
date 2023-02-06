package Generics;
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    float marks;
    public Student(){
        rollNo = 0;
        name = null;
        marks = 0;
    }
    public Student(int rollNo,String name,float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }
    public int compareTo(Student s){
       if(this.marks > s.marks){
           return 1;
       }
       if(this.marks < s.marks){
           return -1;
       }
       else return 0;
    }
}

public class ObjectComparision {
    public static void main(String[] args){
        Student kaushal = new Student(111,"Kaushal",99.99f);
        Student rahul = new Student(122,"Arjun",100f);
        if(kaushal.compareTo(rahul)<0){
            System.out.print("True");
        }

    }
}
