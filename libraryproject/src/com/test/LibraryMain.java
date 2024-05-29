


package com.test;

import java.util.Scanner;

import com.dao.Library;

public class LibraryMain {

	public static void main(String[] args) {
		
		char ch;  
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("----*******-----WELCOME IN THE LIBRARY-------*****-------");
		
		System.out.println();
		
		System.out.println("-----*****------BOOKS INFORMATION------*****---------");
		
		
		Library l = new Library();
		
		do {
			System.out.println("-----*****----WELCOME TO THE LIBRARY MANAGMENT SYSTEM----*****-------\npress 1 for issue book \npress 2 for return book \npress 3 for BookInformation \npress 4 for StudentInformation");
		
			int i = sc.nextInt();
			
			switch(i)
			{
			case 1:
			{
				l.issueBook();
				break;
			}
			case 2:
			{
				l.returnBook();
				break;
			}
			case 3:
			{
				l.bookShow();
				break;
			}
			case 4:
			{
				l.studentData();
				break;
			}
			default : {
				System.out.println("Enter the valid Input .....");
				break;
			}
		
		}
			System.out.println("-----------********------------Do you want to continue------*********----------");
			System.out.println("y/n");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y'); 
		
			
		System.out.println("Thank You visit again !!!!");
		
		
	

		
		

	
	
}
}
