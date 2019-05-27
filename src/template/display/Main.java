package template.display;

/**
 * Created by xu on 03/02/2018.
 */
public class Main {
     public static void main(String[] args){
         char ch = 'c';
         String str = "hello word";
         AbstractDisplay adc = new CharDisplay(ch);
         AbstractDisplay adstr = new StringDisplay(str);

         adc.display();
         adstr.display();
     }
}
