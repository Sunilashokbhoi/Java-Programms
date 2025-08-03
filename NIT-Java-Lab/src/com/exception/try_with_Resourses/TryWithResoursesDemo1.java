package com.exception.try_with_Resourses;

import java.io.Closeable;
import java.io.IOException;

class FileResourses implements Closeable{
	public void close() {
		System.out.println("File Resourses Closed ...");
	}
}

class DataBaseResourses implements AutoCloseable{
	public void close() {
		System.out.println("Database Resourses Closed !!!");
	}
}


public class TryWithResoursesDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Is Started ...");
		
		FileResourses fr = new FileResourses();
		DataBaseResourses dr = new DataBaseResourses();
		
		try(fr ; dr){
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.err.println("Divided By Zero Problem...");
		}
		System.out.println("Main Ended");
	}
}
