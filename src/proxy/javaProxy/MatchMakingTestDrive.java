package proxy.javaProxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

/**
 * Created by xu on 01/08/2017.
 */
public class MatchMakingTestDrive {//测试配对服务
     Hashtable datingDB = new Hashtable();

     public static void main(String[] args){
         MatchMakingTestDrive test = new MatchMakingTestDrive();
         test.drive();
     }
     // initializeDatabase
    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive(){

         PersonBean joe = getPersonFromDatabase("Joe Javabean");
         PersonBean ownerProxy = getOwnerProxy(joe); //创建一个拥有者代理
        System.out.println("Name is " + ownerProxy.getName());//调用getter
        ownerProxy.setInterests("bowling, Go");//调用setter
        System.out.println("Interests set from owner proxy");

        //试着改变评分：应该是行不通的
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);//创建一个非拥有者代理
        System.out.println("Name is " + nonOwnerProxy.getName());//调用getter

        //试着调用setter：应该是行不通的
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

     }
     public PersonBean getPersonFromDatabase(String name){
        return (PersonBean) datingDB.get(name);
     }

     public PersonBean getOwnerProxy(PersonBean person) {
         return (PersonBean) Proxy.newProxyInstance(
                 person.getClass().getClassLoader(),
                 person.getClass().getInterfaces(),
                 new OwnerInvocationHandler(person));
     }
    PersonBean getNonOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
     public void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);


        PersonBean kelly = new PersonBeanImpl();
         kelly.setName("Kelly Klosure");
         kelly.setInterests("ebay, movies, music");
         kelly.setHotOrNotRating(6);
         datingDB.put(kelly.getName(), kelly);
     }
}
