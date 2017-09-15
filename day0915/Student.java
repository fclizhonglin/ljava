package day0915;






public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}




private String name;
private String sex;

public void setname(String name){
	this.name = name;
}
public String getname(){
	return name;
}
public void setsex(String sex){
	this.sex = sex;
}
public String getsex(){
	return sex;
}
}
