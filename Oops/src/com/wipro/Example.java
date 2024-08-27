package com.wipro;
class Point{
	private int x;
	public void setX(int x) {
		this.x=5;
	}
	public int getX() {
		
		return x;
	}
}
public class Example {
	public static void main(String args[]) {
		Point p=new Point();
		p.setX(0);
		System.out.println(p.getX());
	}
}
