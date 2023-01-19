package testNG;

import org.testng.annotations.Test;

public class DependanciessManagement {


    //Problem1 :You have admit a student to engineering
	//Problem2 :You have admit a  student to secondary 
	
    @Test(enabled = true)
	public void highSchool() {
		System.out.println("high school");
	}
    @Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("higher sec school");
	}
    @Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("college");
	}
	
	
}
