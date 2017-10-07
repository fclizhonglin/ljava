package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

import students.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> A= new ArrayList<Student>();
		Student a = new Student("小明",18);
		Student b = new Student("小丽",17);
		Student c = new Student("小花",16);
		A.add(c);
		A.add(b);
		A.add(a);
		Map<String,Student> ts = new HashMap<String,Student>();
		ts.put("小明", a);
		ts.put("小丽",b);
		ts.put("小花",c);
		
//		for (String string : ts.keySet()) {
//			System.out.println(string+"     "+ts.get(string));
//		}
//		Set<Entry<String, Student>> set = ts.entrySet();
//		Iterator<Entry<String, Student>> it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		Set<String> set = ts.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str+"=="+ts.get(str));
		}
		
//		System.out.println(set);
//		for (Entry<String, Student> entry : set) {
//			System.out.println(entry);
//		}
//		for (Student entry : ts.values()) {
//			System.out.println(entry);
//		}
//		HashSet<Student> B = new HashSet<Student>();
//		B.add(c);
//		B.add(b);
//		B.add(a);
//		System.out.println(A.size()+"o"+B.size());
//		int x = 0;
//		int max = 0;
//		for(int i = 0;i<A.size();i++){
//			x = A.get(i).getAge();
//			if(x>max){
//				max = x;
//				
//			}
//		}
				
	}

}
