//A
//class A
//{ int i = 10;
//}
//
//class B extends A
//{ int i = 20;
//}
//
//public class MainClass{
//    public static void main(String[] args){
//        A a = new B();
//
//        System.out.println(a.i);
//    }
//}

//B
//class M{
//    int i;
//    public M(int i) {
//        this.i = i--;
//    }
//}
//
//class N extends M {
//    public N(int i) {
//        super(++i);
//
//        System.out.println(i);
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        N n = new N(26);
//    }
//}

//C
//class A {
//    public A() {
//        System.out.println("Class A constructor");
//    }
//}
//
//class B extends A {
//    public B() {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B {
//    public C() {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        C c = new C();
//    }
//}

//D
//class M {
//    int i = 51;
//
//    public M(int j) {
//        System.out.println(i);
//
//        this.i = j * 10;
//    }
//}
//
//class N extends M {
//    public N(int j) {
//        super(j);
//
//        System.out.println(i);
//
//        this.i = j * 20;
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        N n = new N(26);
//
//        System.out.println(n.i);
//    }
//}

//E
//class A {
//    void A() {
//        System.out.println(1);
//    }
//}
//
//class B extends A {
//    void B() {
//        A();
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        new B().B();
//    }
//}

//F
class A {
    int methodOfA(int i) {
        i /=10;

        return i;
    }
}

class B extends A {
    int methodOfB(int i) {
        i *=20;

        return methodOfA(i);
    }
}

public class MainClass {
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.methodOfB(100));
    }
}