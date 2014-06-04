


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Bona on 14.05.14.
 */
public class SearchText {
    Scanner sc = new Scanner(System.in);
    String s;
    String []text;
    String ex ;
    char charArr[] ;
    HashMap<Character,Integer> map;

    String[] inputText(){
        System.out.println("Please enter text");
        s  = sc.nextLine();
        text = s.split(" ");
        return text;
    }
    String inputExpression(){
        System.out.println("please enter searchable expression");
        ex  = sc.next();
        return ex;
    }
    /* void findExpression(){
         System.out.println("the following words contains your expression:");
         for(String i : text){
             if(i.contains(ex)) {
                 System.out.println(i);
             }
         }
         System.out.println();
     }*/
    void countChars(){
        charArr = s.toCharArray();
        map = new HashMap<Character,Integer>();
        for(char c:charArr){
            int count = 0;
            for(char i: charArr){
                if (i==c)
                    count++;
            }
            map.put(c,count);
        }
        ValueComparator bvc =  new ValueComparator(map);
        TreeMap<Character,Integer> sorted_map = new TreeMap<Character,Integer> (bvc);
        sorted_map.putAll(map);
        System.out.println("sorted "+sorted_map);
        Set set = sorted_map.entrySet();
        System.out.println("5 the most common characters are");
        Iterator iterator = set.iterator();
        int i = 0;
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey()+" = "+(int)((Character)me.getKey()));
            i++;
            if(i==5)break;
        }
    }
    String findReg(String ex,String s){
        Pattern p = Pattern.compile(ex);
        Matcher m = p.matcher(s);
        while((m.find())){
            System.out.println("found words: ");
            System.out.println(m.group());
        }
        return "no other matches";
    }


    public static void main(String[] args) {
        SearchText a = new SearchText();
        a.inputText();
        a.inputExpression();
        // a.findExpression();
        System.out.println("Symbol's count is: " + a.s.length());
        a.countChars();
        a.findReg(a.ex,a.s);

    }

}
