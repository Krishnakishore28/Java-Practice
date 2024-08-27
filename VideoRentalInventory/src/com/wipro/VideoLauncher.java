package com.wipro;
import java.util.*;
public class VideoLauncher {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		VideoStore store=new VideoStore();
		
		while(true) {
			System.out.println("MAIN MENU");
			System.out.println("===========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check Out Video");
			System.out.println("3.Return Video");
			System.out.println("4.Receive Rating");
			System.out.println("5.List Inventory");
			System.out.println("6.Exit");
			System.out.println("Enter yourChoice (1..6):");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the name of the video you want to add:");
				String name=sc.next();
				store.addVideo(name);
				System.out.println("Video "+name+" added successfully");
			}
			else if(choice==4) {
				System.out.println("Enter the name of the video you want Rate:");
				String name=sc.next();
				System.out.println("Enter the rating for the video:");
				int rating=sc.nextInt();
				store.receiveRating(name, rating);
				System.out.println("Rating "+rating+" has been added successfully");
			}
			else if(choice==2) {
				System.out.println("Enter the name of the video you want to checkout:");
				String name=sc.next();
				store.doCheckout(name);
				System.out.println("Video "+name+" checked out successfully");
			}
			else if(choice==5) {
				store.listInventory();
			}
			else if(choice==3) {
				System.out.println("Enter the name of the video you want to return:");
				String name=sc.next();
				store.doReturn(name);
				System.out.println("video "+name+" returned successfully");
				
			}
			else if(choice==6) {
				System.out.println("Exiting...!! Thanks for using the application");
				break;
			}
		}
	}
}
