package strategy.duck;

import strategy.flyBehavior.FlyWithWings;
import strategy.quackBehavior.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
