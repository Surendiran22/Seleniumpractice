package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {


	    @Test(priority =0)
		public void StartTheCar() {
		    System.out.println("Start the car");
		}
	    @Test(priority = 5,enabled = false)
	    public void turnTheMusicOn() {
			System.out.println("music turn on");
		}
	    @Test(priority =1)
		public void putFirstGear() {
			System.out.println("First gear");
		}
	    @Test(priority =2)
		public void putSecondGear() {
			System.out.println("Second gear");
		}
	    @Test(priority =3)
		public void putThirdGear() {
			System.out.println("third gear");
		}
	    @Test(priority =4)
		public void putFourthGear() {
			System.out.println("fourth gear");
		}
		
	
	
	
	
	
	
}
