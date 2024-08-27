package com.wipro;

public class VideoStore {
	Video[] store=new Video[10];
	static int i=0;
	void addVideo(String name) {
		Video video=new Video(name);
		this.store[i]=video;
		i++;
	}
	void doCheckout(String name) {
		for(int j=0;j<i;j++) {
			if(store[j].getName().equals(name)) {
				Video video=store[j];
				video.doCheckOut();
				break;
			}
		}
	}
	void doReturn(String name) {
		for(int j=0;j<i;j++) {
			if(this.store[j].getName().equals(name)) {
				Video video=this.store[j];
				video.doReturn();
				break;
			}
		}
	}
	void receiveRating(String name,int rating) {
		for(int j=0;j<i;j++) {
			if(this.store[j].getName().equals(name)) {
				Video video=this.store[j];
				video.receiveRating(rating);
				break;
			}
		}
	}
	void listInventory() {
		System.out.println("---------------------------------------------------------");
		System.out.println("videoName      |      Checkout Status      |      Rating ");
		for(int j=0;j<i;j++) {
			System.out.println(this.store[j].getName()+"          |         "+this.store[j].getCheckout()+"       |        "+store[j].getRating());
			
		}
		System.out.println("----------------------------------------------------------");
		
	}

}
