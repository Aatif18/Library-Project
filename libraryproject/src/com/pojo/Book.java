package com.pojo;

public class Book {
	int id,copyno;
	String name,authorname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCopyno() {
		return copyno;
	}
	public void setCopyno(int copyno) {
		this.copyno = copyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	public String toString() {
		return "Book [id=" + id + ", copyno=" + copyno + ", name=" + name + ", authorname=" + authorname + "]";
	}
	
}
