package Arrays;
class A{
    int x;
    int y;
    A(){
        x = 10;
        y = 20;
    }
}
class B extends A{
    int x;
    int y;
    B(){
        x = 15;
        y = 25;
    }
}
public class Animal {
    public static void main(String[] args){
        A var = new A();
        B obj = new B();
        A obj1 = new B();
        System.out.println(var.x + "  "+ var.y);//10 20
        System.out.println(obj.x + "  "+obj.y);//15 25
        System.out.println(obj1.x + "   "+obj1.y);//10 20
    }
}
