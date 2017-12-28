package strategy;

import strategy.quackBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
