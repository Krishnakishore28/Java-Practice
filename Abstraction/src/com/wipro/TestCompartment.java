package com.wipro;
import java.util.*;
public class TestCompartment {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] arr=new Compartment[10];
		
		Scanner sc=new Scanner(System.in);
		
		while(i<arr.length) {
			System.out.println("Enter the number between 1 to 4 for compartment and 5 to exit ");
			int key=sc.nextInt();
			if(key==1) {
				Compartment compartment=new Luggage();
				System.out.println(compartment.notice());
				arr[i]=compartment;
				i++;
				
			}
			else if(key==2) {
				Compartment compartment=new Ladies();
				System.out.println(compartment.notice());
				arr[i]=compartment;
				i++;
			}
			else if(key==3) {
				Compartment compartment=new FirstClass();
				System.out.println(compartment.notice());
				arr[i]=compartment;
				i++;
			}
			else if(key==4) {
				Compartment compartment=new General();
				System.out.println(compartment.notice());
				arr[i]=compartment;
				i++;
			}
			else if(key==5) {
				System.out.println("Exitted");
				break;
			}
			
		}
		/*for(Compartment c:arr) {
			System.out.println(c.notice());
		}*/
		
		
	}

}
