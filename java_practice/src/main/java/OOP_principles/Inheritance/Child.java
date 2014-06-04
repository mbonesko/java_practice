package OOP_principles.Inheritance;

/**
 * Created by masha on 04.06.2014.
 */
public class Child extends Parent {
    Child(){
        super("Child");
        System.out.println("child's constructor");
            }
    void childMethod(){
        System.out.println("child's method");
        super.parentMethod();
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.childMethod();
        ch.parentMethod();
            }
}
