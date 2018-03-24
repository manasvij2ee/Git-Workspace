package com.home;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadObject {

	public static void main(String[] args) {
		Person person = new Person("Manasvi", 20);
		
		
			try {
				FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\vivek\\Desktop\\Temp\\Object.txt"));
				ObjectOutputStream o = new ObjectOutputStream(fos);
				
				//write
				o.writeObject(person);
				o.close();
				fos.close();
				
				FileInputStream fis = new FileInputStream(new File("C:\\Users\\vivek\\Desktop\\Temp\\Object.txt"));
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				//read
				Person person1 = (Person) ois.readObject(); 
				System.out.println(person1.toString());
				ois.close();
				fis.close();
				
				
				
			} catch (IOException | ClassNotFoundException e) {
				System.out.println("Exception");
			}
			
		
		
		
		
		
	}

}
