package adaptor.iternum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by xu on 2017/7/4.
 */
public class EnumerationIteratorTest {
     public static void main(String[] args){
         Vector v = new Vector(Arrays.asList(args));
         Iterator iterator = new EnumerationIterator(v.elements());
         while (iterator.hasNext())
             System.out.println(iterator.next());
     }
}
