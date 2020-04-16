package Revision.java;

public class Box {
	
	double width;
	double height;
	double length;
	
	public Box (){
		width = 3;
		height = 4;
		length = 5;
	}
	
	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double compute() {
		return width * height * length;
	}
}
