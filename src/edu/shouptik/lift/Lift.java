package edu.shouptik.lift;

public class Lift {
	
	private int minFloor ;
	private int maxFloor;
	private String name;
	
	private int currentFloor;
	
	static int MOVEUP =1;
	static int MOVEDOWN = -1;
	
	public Lift(String name, int minnFloor, int maxFloor) {
		this.name = name;
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
		currentFloor = minFloor;
	}
	
	int goToFloor(int floor) {
		moveFloor(floor - currentFloor);
		stop();
		return currentFloor;
	}
	
	void moveFloor(int noOfFloor) {
		move(noOfFloor/Math.abs(noOfFloor), Math.abs(noOfFloor));
	}
	
	
	void move( int direction, int floor) {
		
	}
	
	void stop() {
		System.out.format("Lift %s am stopped\n",name);
	}
	
	void open() {
		System.out.format("Lift %s am Open\n",name);
	}
	
	void close() {
		System.out.format("Lift %s am Closed",name);
	}
	
	
	
}
