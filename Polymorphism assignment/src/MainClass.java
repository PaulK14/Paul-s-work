import java.sql.SQLOutput;

//class X {
//    void method(int a) {
//        System.out.println("ONE");
//    }
//
//    void method(double d) {
//        System.out.println("TWO");
//    }
//}
//
//class Y extends X {
//    @Override
//    void method(double d) {
//        System.out.println("THREE");
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        new Y().method(100);
//    }
//}

//class X {
//    void calculate(int a, int b) {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X {
//    @Override
//    void calculate(int a, int b) {
//        System.out.println("Class Z");
//    }
//}
//
//class Z extends Y {
//    @Override
//    void calculate(int a, int b) {
//        System.out.println("Class Z");
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        X x = new Y();
//        x.calculate(10,20);
//        Y y = (Y) x;
//        y.calculate(50,100);
//        Z z = (Z) y;
//        z.calculate(100, 200);
//    }
//}

//class A {
//    public A(int i) {
//        System.out.println(1);
//    }
//
//    public A() {
//        this(10);
//
//        System.out.println(2);
//    }
//
//    void A() {
//        A(10);
//
//        System.out.println(3);
//    }
//
//    void A(int i) {
//        System.out.println(4);
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        new A().A();
//    }
//}

//class A {
//    void myMethod(Object o, Double D) {
//        System.out.println(1);
//    }
//
//    void myMethod(Integer I, Number N) {
//        System.out.println(2);
//    }
//}
//
//class B extends A {
//    void myMethod(Float F, Double D) {
//        System.out.println(3);
//    }
//    void myMethod (Double D, Integer I) {
//        System.out.println(4);
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        B b = new B();
//        b.myMethod(11.11, 0000);
//        b.myMethod(8778, 3223);
//        b.myMethod(2.3*1.2, 4.1*1.4);
//        b.myMethod((float)23.56, 21.45);
//    }
//}

class ABC {
    void methodABC() {
        new XYZ
    }
}