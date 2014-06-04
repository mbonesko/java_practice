package OOP_principles.Polymorphism;

/**
 * Created by masha on 04.06.2014.
 */
public class Child extends Parent {
    void method(){
        System.out.println("this is child's overrided method");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        Parent p = ch;
        p.method();
    }
}
