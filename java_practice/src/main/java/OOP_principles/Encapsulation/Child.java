package OOP_principles.Encapsulation;

/**
 * Created by masha on 04.06.2014.
 */
public class Child extends Parent {
    void method(){
        a = 10;
        b = 20;
      // 'c' is private anc is not visible here
      //  c = 30;
        d = 40;
    }
}
