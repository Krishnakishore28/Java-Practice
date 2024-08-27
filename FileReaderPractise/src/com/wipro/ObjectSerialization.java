package com.wipro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectSerialization {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		try {
			FileOutputStream stream=new FileOutputStream("BufferStream.txt");
			ObjectOutputStream s=new ObjectOutputStream(stream);
			Employee e=new Employee("sumanth",new Date(),"accounts","assistance",5000.00);
			s.writeObject(e);
			s.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream inputStream=new FileInputStream("Bufferstream.txt");
		ObjectInputStream obj=new ObjectInputStream(inputStream);
		Employee e=(Employee) obj.readObject();
		obj.close();
		System.out.println(e);
		
		
	}

}
