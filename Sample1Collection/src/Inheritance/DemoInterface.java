package Inheritance;

import OOPs.I1;
import OOPs.I2;

public class DemoInterface  extends Demo1 implements I1,I2{

	
	@Override
	public void display() {
		
		// TODO Auto-generated method stub
		System.out.println("Overriden method from I1"+i);
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Overriden method from I2");
	}

}
