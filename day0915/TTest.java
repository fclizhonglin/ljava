package day0915;

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.setname("����");
		String name =  stu1.getname();
		stu1.setsex("boy");
		String sex = stu1.getsex();
		System.out.println("��λͬѧ��"+name+"TA��һ��"+sex);
		Student stu2 = new Student("��÷÷","girl");
		System.out.println("��λͬѧ��"+stu2.getname()+"TA��һ��"+stu2.getsex());
	}

}
