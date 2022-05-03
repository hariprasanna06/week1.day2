package day2.assignment;

public class Car {
	public void applybreak()
	{
		System.out.println("Apply Brake");
		
	}
	public void applyGear() 
	{
		System.out.println("Apply Gear");
	}
	public void switchonAc() 
	{
		System.out.println("Switch on Ac");
	}
	public void applyAcclerate() 
	{
		System.out.println("Apply Accelerator");
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.applyAcclerate();
		car1.applybreak();
		car1.applyGear();
		car1.switchonAc();
		
	class Mycar
	{
		public void Mycar()
		{
			Car car2 = new Car();
			System.out.println(car2);
		}
	}
		
	}

}
