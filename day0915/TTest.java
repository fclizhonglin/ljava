package day0915;

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.setname("李雷");
		String name =  stu1.getname();
		stu1.setsex("boy");
		String sex = stu1.getsex();
		System.out.println("这位同学叫"+name+"TA是一个"+sex);
		Student stu2 = new Student("韩梅梅","girl");
		System.out.println("这位同学叫"+stu2.getname()+"TA是一个"+stu2.getsex());
	}

}
