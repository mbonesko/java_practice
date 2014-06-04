package OOP_principles.Encapsulation;

/**
 * Created by masha on 04.06.2014.
 */
public class AnotherClass {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.a = 100;
        p.b = 200; //why this variable is visible?? b is protected
        // c is private and invisible
       // p.c = 300;
        p.d = 400;

    }
}
