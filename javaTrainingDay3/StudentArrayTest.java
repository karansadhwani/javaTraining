import java.util.*;

class Student{
	
	private int rollNo;
	private String name;
	private float marks;
	
	public Student(){
			System.out.println("The Students Data is....");
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setrollNo(){
		this.rollNo=rollNo;
	}
	
	public void setMarks(float marks){
		this.marks=marks;
	}
	
	public void getName(){
		System.out.println("Name is : "+name);
	}
	
	public int getrollNo(){
		return rollNo;
	}
	
	public float getmarks(){
		return marks;
	}
	
	//Student studentArray[]= new Student(size);
	
	
	
}



public class StudentArrayTest{
	
	public static void main(String[] args){
			
			Student s=new Student();
			s.setName("Karan");
			s.getName();
			
		
	}
	
}