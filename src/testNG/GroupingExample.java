package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = ("apple"))
	public void apple1() {
		System.out.println("apple testing");
	}
	@Test(groups = ("apple"))
	public void apple2() {
		System.out.println("apple testing");
	}
	@Test(groups = ("moto"))
	public void moto1() {
		System.out.println("moto testing");
	}
	@Test(groups = ("moto"))
	public void moto2() {
		System.out.println("moto testing");
	}
	@Test(groups = ("vivo"))
	public void vivo1() {
		System.out.println("vivo testing");
	}
	@Test(groups = ("vivo"))
	public void vivo2() {
		System.out.println("vivo testing");
	}
	@Test(groups = ("lenova"))
	public void lenova1() {
		System.out.println("lenova testing");
	}
	@Test(groups = ("lenova"))
	public void lenovo2() {
		System.out.println("lenovo testing");
	}





}
