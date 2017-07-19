package iterator.DinerMergePancake;

/**
 * Created by xu on 14/07/2017.
 */
public class MenuTestDrive {
     public static void main(String[] args){
         PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
         DinerMenu dinerMenu = new DinerMenu();
         Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
         waitress.printMenu();
     }
}
