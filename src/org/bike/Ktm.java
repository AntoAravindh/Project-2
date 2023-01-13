package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Ktm cost: 2lakh");
			
	}

	@Override
	public void speed() {
		System.out.println("Ktm top speed: 125km");
			}
public static void main (String []args ) {
	Ktm be= new Ktm();
	be.cost();
	be.speed();
}

}
