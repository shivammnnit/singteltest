package com.solution;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import com.solution.Bird;


public class TestBird {
	static ByteArrayOutputStream outContent = new ByteArrayOutputStream();	
	static PrintStream originalOut = System.out;
	static String expectedSingString = "I am singing\r\n";

	
	public static void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	
	public static void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	//Testing Bird Sing	
	public static void main(String args[]) {
		setUpStreams();
		Bird testBird = new Bird();
		testBird.sing();
		String actualString = outContent.toString();
		
		restoreStreams();
		if (expectedSingString.equals(actualString)){
			System.out.println("Bird Sing() Successful");
		}
		else {
			System.out.println("Bird Sing() Failed");
		}
	}
}
