package iterator.DinnerMergeCafeIter;


/**
 * Created by xu on 14/07/2017.
 */
public class MenuTestDrive {
     public static void main(String[] args){
         //dinerMenu 不支持迭代器，所以需要手动创建一个DinerMenuIterator迭代器
         DinerMenu dinerMenu = new DinerMenu();
         PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
         CafeMenu cafeMenu = new CafeMenu();

         Waitress waitress = new Waitress(cafeMenu, pancakeHouseMenu, dinerMenu);
         waitress.printMenu();

     }
}
