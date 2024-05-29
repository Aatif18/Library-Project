package com.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import com.pojo.Book;
import com.pojo.Student;

public class Library {
	
	Scanner sc = new Scanner(System.in);
	
	Student s[] = new Student[5];
	
	Book b[] = new Book[4];
	
	int count = 0;
	
	public Library() {
		
		Book b1 = new Book();
		b1.setId(1001);
		b1.setName("Lekin");
		b1.setAuthorname("Jaun Elia");
		b1.setCopyno(10);
		b[0]=b1;
		
		Book b2 = new Book();
		b2.setId(1002);
		b2.setName("Naraz");
		b2.setAuthorname("Rahat Indori");
		b2.setCopyno(10);
		b[1]=b2;
		
		Book b3 = new Book();
		b3.setId(1003);
		b3.setName("Diwan-E-Galib");
		b3.setAuthorname("Mirza Galib");
		b3.setCopyno(10);
		b[2]=b3;
		
		Book b4 = new Book();
		b4.setId(1004);
		b4.setName("Baal-E-Jibreel");
		b4.setAuthorname("Mohammad Iqubal");
		b4.setCopyno(10);
		b[3]=b4;
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Aatif");
		s1.setDept("Mechanical");
		s1.setContact("7000978537");
		s1.setEmail("Aatif@gamil.com");
		s[0]=s1;
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Pramod");
		s2.setDept("Mechanical");
		s2.setContact("8000978537");
		s2.setEmail("Pramod@gamil.com");
		s[1]=s2;
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("faizan");
		s3.setDept("IT");
		s3.setContact("9000978537");
		s3.setEmail("faizan@gamil.com");
		s[2]=s3;
		
		Student s4 = new Student();
		s4.setId(103);
		s4.setName("Farhan");
		s4.setDept("IT");
		s4.setContact("6000978537");
		s4.setEmail("Farhan@gamil.com");
		s[3]=s4;
		
		Student s5 = new Student();
		s5.setId(104);
		s5.setName("Aman");
		s5.setDept("IT");
		s5.setContact("5000978537");
		s5.setEmail("Aman@gamil.com");
		s[4]=s5;
		
		System.out.println(Arrays.toString(b));
	
		
		
		
	}
	public void bookShow() {
		
		System.out.println("------------THIS BOOKS ARE AVAILABLE ON THIS LIBRARY-----------");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public void studentData() {
		System.out.println("-----------------Students Name-----------------");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getStatus()!=null)
			{
				System.out.println(s[i]);
			}
		}
	}
	public void issueBook() {
		System.out.println("--------------Which book you want to issue-------------");
		
		System.out.println("Press Student id");
		int st = sc.nextInt();
		
		System.out.println("Press Book id");
		int bk= sc.nextInt();
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getId()==bk)
			{
				int copyno=b[i].getCopyno()-1;
				b[i].setCopyno(copyno);
			}
			
		}
		for(int j=0;j<s.length;j++)
		{
			if(s[j].getId()==st)
			{
				s[j].setStatus("Issued");
				s[j].setBookid(bk);
				System.out.println(s[j]);
			}
		}
		LocalDate IssueDate = LocalDate.now(); //Autometic date provide krega
		Calendar c = Calendar.getInstance();   //Calandar class
		c.add(Calendar.DATE,15);
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		String ReturnDate = f.format(c.getTime());
		System.out.println("Issue Date"+IssueDate);
		System.out.println("Return Date"+ReturnDate);
		
		
		
	}
	public void returnBook() {
		
		System.out.println("Press Student id");
		int st = sc.nextInt();
		
		System.out.println("Press Book id");
		int bk= sc.nextInt();
		
		for(int j=0;j<s.length;j++)
		{
			if(s[j].getStatus()!=null)
			{
			if(s[j].getStatus().equalsIgnoreCase("Issued") && s[j].getBookid()==bk)
			{
				s[j].setStatus("Return");
				s[j].setBookid(0);
				System.out.println(s[j]);
			}else {
				count++;
				System.out.println("---------------Enter the Correct book id -----------");
				break;
			}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(count==0) {
				
			if(b[i].getId()==bk)
			{
				int copyno=b[i].getCopyno()+1;
				b[i].setCopyno(copyno);
				
			}
			}else {
				
				break;
			}
		}
		
	}
	
	
	
}
