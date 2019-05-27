package observer.numberGenerator;

import observer.numberGenerator.generator.DigitGeneratorListener;
import observer.numberGenerator.generator.GraphGeneratorListener;
import observer.numberGenerator.generator.AbstractNumberGenerator;
import observer.numberGenerator.generator.RandomNumberGenerator;

/**
 * Created by xu on 03/02/2018.
 */
public class Main {
     public static void main(String[] args){

         AbstractNumberGenerator generator = new RandomNumberGenerator();
         Observer digit = new DigitGeneratorListener(generator);
         Observer graph = new GraphGeneratorListener(generator);
         generator.execute();
     }
}
