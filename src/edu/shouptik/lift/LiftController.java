package edu.shouptik.lift;

public class LiftController {
	
	 public static void main(String[] args) {
		System.out.println("Lift is starting");
		
		Lift lift1 = new Lift("1",0,10);
		Lift lift2 = new Lift("2",-1,5);
		Lift lift3 = new Lift("3",0,8);
		
		lift1.open();
		lift2.close();
		
		lift1.moveFloor(15);
		
	}

}
