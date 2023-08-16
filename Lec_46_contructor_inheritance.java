package hello.com;
class base1{
    base1(){
        System.out.println("I'm a constructor ");
    }
    base1(int a){
        System.out.println("I'm overloaded constructor with value of a as: " + a);
    }}
    class derived1 extends base1{

        derived1(){
            super(0);
            System.out.println("I'm a derived constructor");
        }
        derived1(int a, int b){
        super(a);
            System.out.println("I'm overload of derived constructor of b: " + b);
        }
    }

public class Lec_46_contructor_inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
        derived1 d = new derived1(10,14);

    }
}
