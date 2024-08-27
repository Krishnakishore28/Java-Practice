package com.wipro;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
	public static void main(String args[]) throws IOException {
		FileReader fr;
		System.out.println("Enter the file to be read");
		Scanner sc=new Scanner(System.in);
		String source=sc.nextLine();
		File f=new File(source);
		fr=new FileReader(f);
		int c,count=0;
		System.out.println("Enter the character to read");
		char key=sc.next().charAt(0);
		while((c=fr.read())!=-1) {
			if(((char)c)==key) {
				count+=1;
			}
			
		}
		if(count>0) {
			System.out.println("The file "+source+" has "+count+" instances of letter "+key);
		}
		else {
			System.out.println("The file "+source+" has "+count+" no instances of letter "+key);
		}
	}

}
