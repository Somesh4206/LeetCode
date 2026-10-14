package practice;

public class Methods {
 
	class Emp 
	 {
	 	 String Name;
	 	 int emp_id;
	 	 int salary;
	 	 String position;
	 	 void show()
	 	 {
	 	     int  b =0; 
	 		 System.out.println("ABC prv.ltd");
	 	 }
	 	 public class work
	 	 {
	 	public static void main(String[] args) {
	 		
	 		Emp b = new Emp();
	 		b.show();
	 		b.Name ="giri";
	 		System.out.println(b.Name);
	 		b.emp_id = 1234;
	 		System.out.println(b.emp_id);
	 		b.salary = 40000;
	 		System.out.println(b.salary);
	 		b.position = "manager";
	 		System.out.println(b.position);
	 	}
	 	 }
	 }