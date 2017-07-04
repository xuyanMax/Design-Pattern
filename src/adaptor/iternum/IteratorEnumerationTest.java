package adaptor.iternum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by xu on 2017/7/4.
 */
public class IteratorEnumerationTest {
     public static void main(String[] args){
         ArrayList l = new ArrayList(Arrays.asList(args));
         Enumeration enumeration = new IteratorEnumeration(l.iterator());
         while (enumeration.hasMoreElements())
             System.out.println(enumeration.nextElement());

     }
}
