package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("apply break");	
	}
	public void applyGear() {
		System.out.println("apply gear");
			}
     public void switchOnAc() {

    	 System.out.println("switch on ac");
    }
     public void applyAcclerate() {
    	 System.out.println("apply acclerate");
     }
     public static void main(String[] args) {
		Car indico =new Car();
		indico.applyBreak();
		indico.applyGear();
		indico.switchOnAc();
		indico.applyAcclerate();
	}
}

