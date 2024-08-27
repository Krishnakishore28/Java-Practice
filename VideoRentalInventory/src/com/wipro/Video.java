package com.wipro;

public class Video {
	private String videoName;
	private boolean checkout;
	private int rating;
	Video(String name){
		this.videoName=name;
		this.checkout=false;
		this.rating=0;
	}
	String getName() {
		return this.videoName;
	}
	void doCheckOut() {
		this.checkout=true;
	}
	void doReturn() {
		this.checkout=false;
	}
	void receiveRating(int rating) {
		this.rating=rating;
	}
	int getRating() {
		return this.rating;
	}
	boolean getCheckout() {
		return this.checkout;
	}
}
