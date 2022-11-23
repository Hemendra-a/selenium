package test;

import java.util.Scanner;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import SQL_DATABASE.reverse_string;

public class reverse_string_test {
	 reverse_string ob ;
	 String input;
	@BeforeTest
	 public void getdata() {
		 ob=new reverse_string();
		 Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the input");
			input = sc.nextLine();
//			ob.getreverse(input);
			
		
	 }
	public static void main(String[] args) {
		reverse_string_test ob=new reverse_string_test();
		ob.getdata();
	}

}
