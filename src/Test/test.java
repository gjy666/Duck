package Test;

import Model.Duck;
import Model.MallardDuck;
import Model.RedheadDuck;
import Model.RubberDuck;

public class test {
	public static void main(String[] args) { 
		Duck duck1 = new MallardDuck(); 
		System.out.println("duck1"); 
		duck1.performFly(); 
		duck1.performQuack(); 	 
		Duck duck2 = new RubberDuck(); 
		System.out.println("duck2"); 
		duck2.performFly(); 
		duck2.performQuack(); 
		Duck duck3 = new RedheadDuck(); 
		System.out.println("duck3"); 
		duck3.performFly(); 
		duck3.performQuack(); 
				 
		 	} 

}
